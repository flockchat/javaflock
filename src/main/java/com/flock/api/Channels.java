

package com.flock.api;

import com.flock.model.Channel;
import com.flock.model.Error;
import com.flock.model.ListMembersOptionalParams;
import com.flock.model.ChannelMember;

import com.google.common.util.concurrent.ListenableFuture;
import static com.flock.api.ApiUtils.*;
import static com.flock.api.FlockApiClient.*;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Channels {

    /**
     *  (makes an asynchronous HTTP request)
     * 
     * @param token  (required) 
     * @param channelId  (required) 
     * @return ListenableFuture<Channel>
     */
    public static ListenableFuture<Channel> getInfoAsync(String token, String channelId) {
        Map<String, Object> params = new HashMap<>();
        putParam(params, "token", token);
        putParam(params, "channelId", channelId);
        return sendRequest(post(FLOCK_BASE_URL + "/channels.getInfo").headers(getDefaultHeaders()).fields(params), Channel.class);
    }

    /**
     *  (makes a synchronous HTTP request)
     * 
     * @param token  (required) 
     * @param channelId  (required) 
     * @return Channel
     */
    public static Channel getInfo(String token, String channelId) throws Exception {
        return getInfoAsync(token, channelId).get();
    }

    /**
     *  (makes an asynchronous HTTP request)
     * 
     * @param token  (required) 
     * @return ListenableFuture<Channel[]>
     */
    public static ListenableFuture<Channel[]> listAsync(String token) {
        Map<String, Object> params = new HashMap<>();
        putParam(params, "token", token);
        return sendRequest(post(FLOCK_BASE_URL + "/channels.list").headers(getDefaultHeaders()).fields(params), Channel[].class);
    }

    /**
     *  (makes a synchronous HTTP request)
     * 
     * @param token  (required) 
     * @return Channel[]
     */
    public static Channel[] list(String token) throws Exception {
        return listAsync(token).get();
    }

    /**
     *  (makes an asynchronous HTTP request)
     * 
     * @param token  (required) 
     * @param channelId  (required) 
     * @param listMembersOptionalParams (optional)
     * @return ListenableFuture<ChannelMember[]>
     */
    public static ListenableFuture<ChannelMember[]> listMembersAsync(String token, String channelId, ListMembersOptionalParams listMembersOptionalParams) {
        if(listMembersOptionalParams == null) {
            listMembersOptionalParams = new ListMembersOptionalParams();
        }
        Map<String, Object> params = new HashMap<>();
        putParam(params, "token", token);
        putParam(params, "channelId", channelId);
        putParam(params, "showPublicProfile", listMembersOptionalParams.getShowPublicProfile());
        return sendRequest(post(FLOCK_BASE_URL + "/channels.listMembers").headers(getDefaultHeaders()).fields(params), ChannelMember[].class);
    }

    /**
     *  (makes a synchronous HTTP request)
     * 
     * @param token  (required) 
     * @param channelId  (required) 
     * @param listMembersOptionalParams (optional)
     * @return ChannelMember[]
     */
    public static ChannelMember[] listMembers(String token, String channelId, ListMembersOptionalParams listMembersOptionalParams) throws Exception {
        return listMembersAsync(token, channelId, listMembersOptionalParams).get();
    }
}
