

package com.flock.api;

import com.flock.model.Group;
import com.flock.model.Error;
import com.flock.model.PublicProfile;

import com.google.common.util.concurrent.ListenableFuture;
import static com.flock.api.ApiUtils.*;
import static com.flock.api.FlockApiClient.*;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Groups {

    /**
     *  (makes an asynchronous HTTP request)
     * 
     * @param token  (required) 
     * @param groupId  (required) 
     * @return ListenableFuture<Group>
     */
    public static ListenableFuture<Group> getInfoAsync(String token, String groupId) {
        Map<String, Object> params = new HashMap<>();
        putParam(params, "token", token);
        putParam(params, "groupId", groupId);
        return sendRequest(post(FLOCK_BASE_URL + "/groups.getInfo").headers(getDefaultHeaders()).fields(params), Group.class);
    }

    /**
     *  (makes a synchronous HTTP request)
     * 
     * @param token  (required) 
     * @param groupId  (required) 
     * @return Group
     */
    public static Group getInfo(String token, String groupId) throws Exception {
        return getInfoAsync(token, groupId).get();
    }

    /**
     *  (makes an asynchronous HTTP request)
     * 
     * @param token  (required) 
     * @param groupId  (required) 
     * @return ListenableFuture<PublicProfile[]>
     */
    public static ListenableFuture<PublicProfile[]> getMembersAsync(String token, String groupId) {
        Map<String, Object> params = new HashMap<>();
        putParam(params, "token", token);
        putParam(params, "groupId", groupId);
        return sendRequest(post(FLOCK_BASE_URL + "/groups.getMembers").headers(getDefaultHeaders()).fields(params), PublicProfile[].class);
    }

    /**
     *  (makes a synchronous HTTP request)
     * 
     * @param token  (required) 
     * @param groupId  (required) 
     * @return PublicProfile[]
     */
    public static PublicProfile[] getMembers(String token, String groupId) throws Exception {
        return getMembersAsync(token, groupId).get();
    }

    /**
     *  (makes an asynchronous HTTP request)
     * 
     * @param token  (required) 
     * @return ListenableFuture<Group[]>
     */
    public static ListenableFuture<Group[]> listAsync(String token) {
        Map<String, Object> params = new HashMap<>();
        putParam(params, "token", token);
        return sendRequest(post(FLOCK_BASE_URL + "/groups.list").headers(getDefaultHeaders()).fields(params), Group[].class);
    }

    /**
     *  (makes a synchronous HTTP request)
     * 
     * @param token  (required) 
     * @return Group[]
     */
    public static Group[] list(String token) throws Exception {
        return listAsync(token).get();
    }
}
