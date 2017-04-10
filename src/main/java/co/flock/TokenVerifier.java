package co.flock;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;

import java.io.UnsupportedEncodingException;

public class TokenVerifier {

    private final JWTVerifier _verifier;
    private final String _appId;

    public TokenVerifier(String appId, String appSecret) throws UnsupportedEncodingException {
        _appId = appId;
        _verifier = JWT.require(Algorithm.HMAC256(appSecret)).build();
    }

    public boolean verifyToken(String token, String userId) throws Exception {
        JWT jwt = (JWT) _verifier.verify(token);
        String userIdInToken = jwt.getClaim("userId").asString();
        String appIdInToken = jwt.getClaim("appId").asString();
        return userId.equals(userIdInToken) && _appId.equals(appIdInToken);
    }

    public static class TokenVerificationException extends Exception {
    }
}
