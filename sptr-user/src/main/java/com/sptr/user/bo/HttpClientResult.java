package com.sptr.user.bo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author：lianp
 * @description：
 * @date：15:45 2020/4/2
 */
@Data
public class HttpClientResult implements Serializable {

    /**
     * 响应状态码
     */
    private int code;

    /**
     * 响应数据
     */
    private String content;

    public HttpClientResult(int code){
        this.code = code;
    }

    public HttpClientResult(int code,String content){
        this.code = code;
        this.content = content;
    }

}