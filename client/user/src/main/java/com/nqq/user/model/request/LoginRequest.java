/**
 * Copyright (C), 2015-2019, 付临门有限公司
 * FileName: LoginRequest
 * Author:   user
 * Date:     2019/7/17 16:29
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.nqq.user.model.request;

import com.esotericsoftware.kryo.NotNull;
import com.nqq.common.model.BaseModel;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author user
 * @create 2019/7/17
 * @since 1.0.0
 */
public class LoginRequest extends BaseModel{

    @NotNull
    private String mobile;

    @NotNull
    private String password;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
