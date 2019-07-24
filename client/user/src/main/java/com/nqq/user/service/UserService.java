package com.nqq.user.service;

import com.nqq.user.model.bean.UserBean;

public interface UserService {
    /**
     * 添加用户
     * @param user
     * @return
     */
    int addUser(UserBean user) throws Exception;
}
