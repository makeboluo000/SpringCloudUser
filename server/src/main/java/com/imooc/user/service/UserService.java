package com.imooc.user.service;

import com.imooc.user.dataobject.UserInfo;

public interface UserService {

    /**
     * 通过openid查询卖家端信息
     * @param openid
     * @return
     */
    UserInfo findUserInfoByOpenid(String openid);

}
