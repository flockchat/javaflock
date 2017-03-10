package co.flock.api;

import java.util.HashMap;
import java.util.Map;

class ApiUtils {
    static final String FLOCK_BASE_URL = "https://api.flock.co/v1";

    static void putParam(Map<String, Object> map, String key, Object value) {
        if (key != null && value != null) {
            map.put(key, value);
        }
    }

    static Map<String, String> getDefaultHeaders() {
        return new HashMap<String, String>() {
            {
                put("Accept", "application/json");
                put("Content-Type", "application/x-www-form-urlencoded");
            }
        };
    }
}
