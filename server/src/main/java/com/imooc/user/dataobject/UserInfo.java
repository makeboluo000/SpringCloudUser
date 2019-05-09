package com.imooc.user.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class UserInfo {

    @Id
    private String id;
    private String username;
    private String password;

    // 微信openid
    private String openid;

    // 角色
    private Integer role;


}
