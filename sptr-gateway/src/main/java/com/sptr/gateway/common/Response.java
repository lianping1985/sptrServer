package com.sptr.gateway.common;

import lombok.Data;

/**
 * @author：lianp
 * @description：
 * @date：19:54 2020/4/8
 */
@Data
public class Response {
    private int code;
    private String message;
    private String data;

    public Response(){

    }

    public Response(int code, String message){
        this.code = code;
        this.message = message;
    }

    public Response(int code, String message, String data){
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
