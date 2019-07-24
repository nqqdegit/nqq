/**
 * Copyright (C), 2015-2019, 付临门有限公司
 * FileName: RSAResponse
 * Author:   user
 * Date:     2019/7/16 16:36
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.nqq.index.response;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author user
 * @create 2019/7/16
 * @since 1.0.0
 */
public class RSAResponse extends BaseResponse {

    private String serverPublicKey;

    private String serverPrivateKey;

    public static class Builder{
        private String serverPublicKey;

        private String serverPrivateKey;

        public Builder setServerPublicKey(String serverPublicKey){
            this.serverPublicKey = serverPublicKey;
            return this;
        }

        public Builder setServerPrivateKey(String serverPrivateKey){
            this.serverPrivateKey = serverPrivateKey;
            return this;
        }

        public RSAResponse build(){
            return new RSAResponse(this);
        }

    }

    public static Builder options(){
        return new Builder();
    }

    public RSAResponse(Builder builder){
        this.serverPrivateKey = builder.serverPrivateKey;
        this.serverPublicKey = builder.serverPublicKey;
    }

    public String getServerPrivateKey() {
        return serverPrivateKey;
    }

    public String getServerPublicKey() {
        return serverPublicKey;
    }
}
