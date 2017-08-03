package com.flock.api;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import com.google.gson.Gson;

class ApiUtils {
    static final String FLOCK_BASE_URL = "https://api.flock.co/v1";
    private static final Gson gson = new Gson();

    static void putParam(Map<String, Object> map, String key, Object value) {
        if (key != null && value != null) {
            if (value instanceof Collection) {
                value = gson.toJson(value);
            }
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
