/**
 * Copyright (C), 2015-2019, 付临门有限公司
 * FileName: BaseService
 * Author:   user
 * Date:     2019/7/18 11:24
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.nqq.common.service;

import com.nqq.common.encryption.Algorithm;
import com.nqq.common.encryption.MessageDigestUtils;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author user
 * @create 2019/7/18
 * @since 1.0.0
 */
public class BaseService {

    /**
     * 密码加密算法
     * @param password
     * @return
     */
    protected String encryptPassword(String password){
        return MessageDigestUtils.encrypt(password, Algorithm.SHA1);
    }

    /**
     * 生成API鉴权的Token
     * @param mobile
     * @param password
     * @return
     */
    protected String getToken(String mobile,String password){
        return MessageDigestUtils.encrypt(mobile+password, Algorithm.SHA1);
    }
}
