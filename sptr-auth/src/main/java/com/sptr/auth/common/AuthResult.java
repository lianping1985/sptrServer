package com.sptr.auth.common;

import lombok.Data;

/**
 * @author：lianp
 * @description：
 * @date：19:23 2020/4/8
 */
@Data
public class AuthResult {
    Integer code;
    String message;
    String token;
    String refreshToken;

    public AuthResult(Integer code,String message){
        this.code = code;
        this.message = message;
    }

    public AuthResult(Integer code,String message,String token,String refreshToken){
        this.code = code;
        this.message = message;
        this.token = token;
        this.refreshToken = refreshToken;
    }
}
