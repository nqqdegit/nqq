/**
 * Copyright (C), 2015-2019, 付临门有限公司
 * FileName: UserServiceImpl
 * Author:   user
 * Date:     2019/7/22 16:50
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.nqq.user.service.impl;

import com.nqq.user.mapper.UserMapper;
import com.nqq.user.model.bean.UserBean;
import com.nqq.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author user
 * @create 2019/7/22
 * @since 1.0.0
 */
@Service
public class UserServiceImpl implements UserService{

    private Logger logger= LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(UserBean user) throws Exception{
        UserBean userbean=new UserBean();
        int i=0;
        try {
            logger.info("添加用户传入参数:{}",userbean.toString());
           i=userMapper.addUser(userbean);
           if(i>0){
               logger.info("添加成功");
           }
        } catch (Exception e) {
            logger.error("添加异常",e);
           throw e;
        }
        return i;
    }
}
