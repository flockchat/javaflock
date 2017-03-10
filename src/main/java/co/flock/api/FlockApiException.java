
package co.flock.api;

import co.flock.model.Error;
import java.util.List;
import java.util.Map;

public class FlockApiException extends Exception {
    private int _statusCode;
    private Map<String, List<String>> _headers;
    private String _rawBody;
    private Error _error;

    public FlockApiException() {
    }

    public FlockApiException(String message) {
        super(message);
    }

    public FlockApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public FlockApiException(Throwable cause) {
        super(cause);
    }

    public FlockApiException(int statusCode, Map<String, List<String>> headers, Error error, String rawBody) {
        super(rawBody);
        _statusCode = statusCode;
        _headers = headers;
        _error = error;
        _rawBody = rawBody;
    }

    public int getStatusCode() {
        return _statusCode;
    }

    public Map<String, List<String>> getHeaders() {
        return _headers;
    }

    public String getRawBody() {
        return _rawBody;
    }

    public Error getError() {
        return _error;
    }
}