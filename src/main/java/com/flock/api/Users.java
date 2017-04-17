

package com.flock.api;

import com.flock.model.User;
import com.flock.model.Error;
import com.flock.model.PublicProfile;

import com.google.common.util.concurrent.ListenableFuture;
import static com.flock.api.ApiUtils.*;
import static com.flock.api.FlockApiClient.*;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Users {

    /**
     *  (makes an asynchronous HTTP request)
     * 
     * @param token  (required) 
     * @return ListenableFuture<User>
     */
    public static ListenableFuture<User> getInfoAsync(String token) {
        Map<String, Object> params = new HashMap<>();
        putParam(params, "token", token);
        return sendRequest(post(FLOCK_BASE_URL + "/users.getInfo").headers(getDefaultHeaders()).fields(params), User.class);
    }

    /**
     *  (makes a synchronous HTTP request)
     * 
     * @param token  (required) 
     * @return User
     */
    public static User getInfo(String token) throws Exception {
        return getInfoAsync(token).get();
    }

    /**
     *  (makes an asynchronous HTTP request)
     * 
     * @param token  (required) 
     * @param userId  (required) 
     * @return ListenableFuture<PublicProfile>
     */
    public static ListenableFuture<PublicProfile> getPublicProfileAsync(String token, String userId) {
        Map<String, Object> params = new HashMap<>();
        putParam(params, "token", token);
        putParam(params, "userId", userId);
        return sendRequest(post(FLOCK_BASE_URL + "/users.getPublicProfile").headers(getDefaultHeaders()).fields(params), PublicProfile.class);
    }

    /**
     *  (makes a synchronous HTTP request)
     * 
     * @param token  (required) 
     * @param userId  (required) 
     * @return PublicProfile
     */
    public static PublicProfile getPublicProfile(String token, String userId) throws Exception {
        return getPublicProfileAsync(token, userId).get();
    }
}
