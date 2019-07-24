/**
 * Copyright (C), 2015-2019, 付临门有限公司
 * FileName: KeyRequest
 * Author:   user
 * Date:     2019/7/16 16:27
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.nqq.index.request;

import com.esotericsoftware.kryo.NotNull;

/**
 * 〈一句话功能简述〉<br> 
 * 〈私钥输入参数（其实就是客户端通过服务端返回的公钥加密后的客户端自己生成的公钥）〉
 *
 * @author user
 * @create 2019/7/16
 * @since 1.0.0
 */
public class KeyRequest {
    /**
     * 客户端自己生成的加密后公钥
     */
    @NotNull
    private String clientEncryptPublicKey;
    public String getClientEncryptPublicKey() {
        return clientEncryptPublicKey;
    }
    public void setClientEncryptPublicKey(String clientEncryptPublicKey) {
        this.clientEncryptPublicKey = clientEncryptPublicKey;
    }
}
