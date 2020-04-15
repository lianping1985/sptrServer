package com.sptr.auth.utils;

import java.util.UUID;

/**
 * @author：lianp
 * @description：
 * @date：15:12 2019/9/10
 */
public class Uuid {
    public static String genUuid(){
        return UUID.randomUUID().toString();
    }

}