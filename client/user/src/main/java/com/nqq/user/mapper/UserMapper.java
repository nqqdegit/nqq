/**
 * Copyright (C), 2015-2019, 付临门有限公司
 * FileName: UserMapper
 * Author:   user
 * Date:     2019/7/22 15:00
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.nqq.user.mapper;

import com.nqq.user.model.bean.UserBean;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author user
 * @create 2019/7/22
 * @since 1.0.0
 */
public interface UserMapper {
    /**
     * 添加用户
     * @param user
     * @return
     */
    int addUser(UserBean user);
}
