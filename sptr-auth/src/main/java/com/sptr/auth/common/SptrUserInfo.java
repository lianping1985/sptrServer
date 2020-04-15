package com.sptr.auth.common;

import lombok.Data;

import java.util.Date;

@Data
public class SptrUserInfo {
    private Long id;

    private String userName;

    private String passWord;

    private String nickName;

    private String phone;

    private String openId;

    private String avatarUrl;

    private Boolean gender;

    private String country;

    private String province;

    private String city;

    private Date createTime;

    private Boolean userStatus;
}