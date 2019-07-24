/**
 * Copyright (C), 2015-2019, 付临门有限公司
 * FileName: UserController
 * Author:   user
 * Date:     2019/7/23 16:32
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.nqq.user.controller;

import com.nqq.user.model.bean.UserBean;
import com.nqq.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author user
 * @create 2019/7/23
 * @since 1.0.0
 */
@Controller
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value="/addUser")
    @ResponseBody
    public String addUser(HttpServletRequest request, HttpServletResponse response){
        String mobile=request.getParameter("mobile");
        String password=request.getParameter("password");
        String msg="添加失败";
        logger.info("添加用户传入参数 手机号：{}，密码：{}",mobile,password);
        UserBean userbean=new UserBean();
        int i=0;
        try {
            userbean.setMobile(mobile);
            userbean.setPassword(password);
            i=userService.addUser(userbean);
            if(i>0){
                msg="添加成功";
                return msg;
            }
        } catch (Exception e) {
            msg="添加异常";
           logger.error("添加用户异常",e);
        }
        return msg;
    }
}
