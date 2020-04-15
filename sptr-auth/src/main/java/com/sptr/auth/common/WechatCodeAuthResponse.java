package com.sptr.auth.common;

import lombok.Data;

/**
 * @author：lianp
 * @description：
 * @date：12:14 2020/4/9
 */
@Data
public class WechatCodeAuthResponse {
    String openid;
    String sessionKey;
    String errcode;
    String errmsg;
}
