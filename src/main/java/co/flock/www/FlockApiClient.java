package co.flock.www;
import co.flock.www.modals.Group;
import co.flock.www.modals.PublicProfile;
import co.flock.www.modals.User;
import co.flock.www.modals.message.FlockMessage;
import com.google.gson.Gson;
import com.ning.http.client.*;
import java.util.concurrent.CompletableFuture;

/**
 * FlockApiClient is the wrapper class to make request to the FlockApi using the user Token.
 */
public class FlockApiClient {
    private String userToken;
    private final String apiEndPoint = "https://api.flock.co/v1/";
    private static final AsyncHttpClient asyncHttpClient  = new AsyncHttpClient(new AsyncHttpClientConfig.Builder().setCompressionEnforced(true).setConnectTimeout(10000).setRequestTimeout(10000).build());
    private static final Gson gson = new Gson();

    /***
     * Default constructor of the FlockApiClient
     * @param userToken Token of the user on whose behalf the request is being sent
     */
    public FlockApiClient(String userToken){
        this.userToken = userToken;
    }

    /**
     * This method allows an app to send a message to a user or a group.
     * @param message Message is the object which contains the message being sent to Flock
     * @return The uid of the message which is the unique identifier given to the message being successfully post
     * @throws Exception In case message is not sent successfully in the Flock , exception is thrown with detail error message.
     */
    public String chatSendMessage(FlockMessage message) throws Exception{
        return  chatSendMessageAsync(message).get();
    }

    /**
     * This method allows an app to send a message to a user or a group Asynchronously.
     * @param message Message is the object which contains the message being sent to Flock
     * @return CompletableFuture of the uid of the message which is the unique identifier given to the message being successfully post
     * @throws Exception In case message is not sent successfully in the Flock , exception is thrown with detail error message.
     */
    public CompletableFuture<String> chatSendMessageAsync(FlockMessage message) throws  Exception {
        RequestBuilder requestBuilder = getRequestBuilder();
        requestBuilder.setUrl(apiEndPoint + "chat.sendMessage");
        requestBuilder.setBody(gson.toJson(message));
        requestBuilder.setMethod("POST");
        return postAsyncRequest(requestBuilder, String.class);
    }

    /**
     * This method retrieves information related to a group.
     * @param groupId Identifier of the group for which information was requested
     * @return Group information
     * @throws Exception In case user have the permission issue or the group provided in the groupId field can't be located.
     */
    public Group getGroupInfo(String groupId) throws  Exception{
        return getGroupInfoAsync(groupId).get();
    }

    /**
     * This method retrieves information related to a group Asynchronously.
     * @param groupId Identifier of the group for which information was requested
     * @return CompletableFuture of Group information
     * @throws Exception In case user have the permission issue or the group provided in the groupId field can't be located.
     */
    public CompletableFuture<Group> getGroupInfoAsync(String groupId) throws  Exception{
        RequestBuilder requestBuilder = getRequestBuilder();
        requestBuilder.setUrl(apiEndPoint + "groups.getInfo");
        requestBuilder.setBody("{\"groupId\" : \"" + groupId + "\"}");
        requestBuilder.setMethod("POST");
        return postAsyncRequest(requestBuilder, Group.class);
    }

    /**
     * This method retrieves a list of the groups that the user is a member of.
     * @return A list of Group objects.
     * @throws Exception In case user have the permission issue or the group provided in the groupId field can't be located.
     */
    public Group[] getGroupList() throws Exception{
        return getGroupListAsync().get();
    }

    /**
     * This method retrieves a list of the groups that the user is a member of Asynchronously.
     * @return CompletableFuture of list of Group objects.
     * @throws Exception In case user have the permission issue or the group provided in the groupId field can't be located.
     */
    public CompletableFuture<Group[]> getGroupListAsync() throws Exception{
        RequestBuilder requestBuilder = getRequestBuilder();
        requestBuilder.setUrl(apiEndPoint + "groups.list");
        requestBuilder.setMethod("POST");
        return postAsyncRequest(requestBuilder, Group[].class);
    }

    /**
     * This method retrieves information about the user.
     * @return A single User object.
     * @throws Exception In case user have the permission issue or the user does not exists.
     */
    public User getUserInfo() throws Exception{
        return getUserInfoAsync().get();
    }
    /**
     * This method retrieves information about the user Asynchronously.
     * @return CompletableFuture of single User object.
     * @throws Exception In case user have the permission issue or the user does not exists.
     */
    public CompletableFuture<User> getUserInfoAsync() throws Exception{
        RequestBuilder requestBuilder = getRequestBuilder();
        requestBuilder.setUrl(apiEndPoint + "users.getInfo");
        requestBuilder.setMethod("POST");
        return postAsyncRequest(requestBuilder, User.class);
    }

    /**
     * This method retrieves public profiles of users belonging to this group.
     * @param groupId Identifier of the group for which the membership information was requested
     * @return A List of  PublicProfile object.
     * @throws Exception In case user have the permission issue or the group does not exists.
     */
    public PublicProfile[] getGroupMembers(String groupId) throws Exception{
        return getGroupMembersAsync(groupId).get();
    }

    /**
     * This method retrieves public profiles of users belonging to this group Asynchronously.
     * @param groupId Identifier of the group for which the membership information was requested
     * @return CompletableFuture of List of  PublicProfile object.
     * @throws Exception In case user have the permission issue or the group does not exists.
     */
    public CompletableFuture<PublicProfile[]> getGroupMembersAsync(String groupId) throws Exception{
        RequestBuilder requestBuilder = getRequestBuilder();
        requestBuilder.setUrl(apiEndPoint + "groups.getMembers");
        requestBuilder.setBody("{\"groupId\" : \"" + groupId + "\"}");
        requestBuilder.setMethod("POST");
        return postAsyncRequest(requestBuilder, PublicProfile[].class);
    }

    /**
     * This method retrieves the list of contacts associated with a user.
     * @return A list of PublicProfile objects.
     * @throws Exception Exception In case user have the permission issue
     */
    public PublicProfile[] getRoasterListContacts() throws Exception{
        return getRoasterListContactsAsync().get();
    }

    /**
     * This method retrieves the list of contacts associated with a user Asynchronously.
     * @return CompletableFuture of list of PublicProfile objects.
     * @throws Exception Exception In case user have the permission issue
     */
    public CompletableFuture<PublicProfile[]> getRoasterListContactsAsync() throws Exception{
        RequestBuilder requestBuilder = getRequestBuilder();
        requestBuilder.setUrl(apiEndPoint + "roster.listContacts");
        requestBuilder.setMethod("POST");
        return postAsyncRequest(requestBuilder, PublicProfile[].class);
    }

    private RequestBuilder getRequestBuilder() {
        RequestBuilder requestBuilder;
        requestBuilder = new RequestBuilder().addHeader("X-Flock-User-Token", userToken);
        requestBuilder.addHeader("Content-type","application/json; charset=utf-8");
        return requestBuilder;
    }

    private static <T> CompletableFuture<T> postAsyncRequest(RequestBuilder requestBuilder, final Class<T> t){
        final CompletableFuture<T> completableFuture = new CompletableFuture<T>();
        asyncHttpClient.executeRequest(requestBuilder.build(), new AsyncCompletionHandler<Void>() {
            @Override
            public Void onCompleted(Response response) throws Exception {
                if(response.getStatusCode() == 200){
                    if ("java.lang.String".equals(t.getName())) {
                        completableFuture.complete((T) response.getResponseBody());
                    } else{
                        completableFuture.complete((T) gson.fromJson(response.getResponseBody(),t.getClass()));
                    }
                }  else {
                    completableFuture.completeExceptionally(new Exception("Flock api has got error code " + response.getStatusCode() + " and the error message is " + response.getResponseBody()));
                }
                return null;
            }

            @Override
            public void onThrowable(Throwable throwable){
                completableFuture.completeExceptionally(throwable);
            }
        });
        return  completableFuture;
    }

}
