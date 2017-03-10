

package co.flock.api;

import co.flock.model.PublicProfile;
import co.flock.model.Error;

import com.google.common.util.concurrent.ListenableFuture;
import static co.flock.api.ApiUtils.*;
import static co.flock.api.FlockApiClient.*;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Roster {

    /**
     *  (makes an asynchronous HTTP request)
     * 
     * @param token  (required) 
     * @return List&lt;PublicProfile&gt;
     */
    public static ListenableFuture<PublicProfile[]> listContactsAsync(String token) {
        Map<String, Object> params = new HashMap<>();
        putParam(params, "token", token);
        return sendRequest(post(FLOCK_BASE_URL + "/roster.listContacts").headers(getDefaultHeaders()).fields(params), PublicProfile[].class);
    }

    /**
     *  (makes a synchronous HTTP request)
     * 
     * @param token  (required) 
     * @return List&lt;PublicProfile&gt;
     */
    public static PublicProfile[] listContacts(String token) throws Exception {
        return listContactsAsync(token).get();
    }
}
