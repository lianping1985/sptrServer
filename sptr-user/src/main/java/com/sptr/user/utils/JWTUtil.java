package com.sptr.user.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;

import java.util.Date;

/**
 * @author：lianp
 * @description：
 * @date：19:12 2020/4/8
 */
public class JWTUtil {
    public static final String SECRET_KEY = "123456"; //秘钥
    public static final long TOKEN_EXPIRE_TIME = 5 * 60 * 1000; //token过期时间
    public static final long REFRESH_TOKEN_EXPIRE_TIME = 10 * 60 * 1000; //refreshToken过期时间
    private static final String ISSUER = "sptr"; //签发人

    /**
     * 生成签名
     */
    public static String generateToken(String username){
        Date now = new Date();
        Algorithm algorithm = Algorithm.HMAC256(SECRET_KEY); //算法

        String token = JWT.create()
                .withIssuer(ISSUER) //签发人
                .withIssuedAt(now) //签发时间
                .withExpiresAt(new Date(now.getTime() + TOKEN_EXPIRE_TIME)) //过期时间
                .withClaim("userSymbol", username) //保存身份标识
                .sign(algorithm);
        return token;
    }

    /**
     * 验证token
     */
    public static boolean verify(String token){
        try {
            Algorithm algorithm = Algorithm.HMAC256(SECRET_KEY); //算法
            JWTVerifier verifier = JWT.require(algorithm)
                    .withIssuer(ISSUER)
                    .build();
            verifier.verify(token);
            return true;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return false;
    }

    /**
     * 从token获取userSymbol
     */
    public static String getUserSymbol(String token){
        try{
            return JWT.decode(token).getClaim("userSymbol").asString();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return "";
    }

    public static void main(String[] args){
        String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJzcHRyIiwiZXhwIjoxNTg2NDE1MzUxLCJpYXQiOjE1ODY0MTUwNTEsInVzZXJuYW1lIjoiZGRkZGRkZGRkZGRkZGRkZGRkZGRkZGQifQ.csxicpBICmyQ_yVlvlSXU07pQssvaLTTUo7xqaf58e8";
        System.out.println(getUserSymbol(token));
    }
}
