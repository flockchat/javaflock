
package co.flock.api;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.async.Callback;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.BaseRequest;
import co.flock.model.Error;

class FlockApiClient extends Unirest {
    private static final Gson _gson = new Gson();

    static <T> ListenableFuture<T> sendRequest(final BaseRequest baseRequest, final Class<T> classType) {
        final SettableFuture<T> future = SettableFuture.create();
        baseRequest.asStringAsync(new Callback<String>() {
            @Override
            public void completed(HttpResponse<String> httpResponse) {
                String body = httpResponse.getBody();
                if (httpResponse.getStatus() == 200) {
                    future.set(_gson.fromJson(body, classType));
                } else {
                    Error error = _gson.fromJson(body, Error.class);
                    future.setException(new FlockApiException(httpResponse.getStatus(), httpResponse.getHeaders(), error, body));
                }
            }

            @Override
            public void failed(UnirestException e) {
                future.setException(new FlockApiException(e));
            }

            @Override
            public void cancelled() {
                future.setException(new FlockApiException("request cancelled"));
            }
        });
        return future;
    }
}