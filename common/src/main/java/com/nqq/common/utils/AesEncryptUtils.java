/**
 * Copyright (C), 2015-2019, 付临门有限公司
 * FileName: AesEncryptUtils
 * Author:   user
 * Date:     2019/7/16 10:54
 * Description: 加密解密工具
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.nqq.common.utils;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;

/**
 * 〈一句话功能简述〉<br> 
 * 〈加密解密工具〉
 *
 * @author user
 * @create 2019/7/16
 * @since 1.0.0
 */
public class AesEncryptUtils {

    private static final String KEY = "d7585fde114abcda";
    private static final String ALGORITHMSTR = "AES/CBC/NoPadding";
    public static String base64Encode(byte[] bytes) {
        return Base64.encodeBase64String(bytes);
    }
    public static byte[] base64Decode(String base64Code) throws Exception {
        return Base64.decodeBase64(base64Code);
    }
    public static byte[] aesEncryptToBytes(String content, String encryptKey) throws Exception {
        KeyGenerator kgen = KeyGenerator.getInstance("AES");
        kgen.init(128);
        Cipher cipher = Cipher.getInstance(ALGORITHMSTR);
        cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(encryptKey.getBytes(), "AES"));
        return cipher.doFinal(content.getBytes("utf-8"));
    }
    public static String aesEncrypt(String content, String encryptKey) throws Exception {
        return base64Encode(aesEncryptToBytes(content, encryptKey));
    }
    public static String aesDecryptByBytes(byte[] encryptBytes, String decryptKey) throws Exception {
        KeyGenerator kgen = KeyGenerator.getInstance("AES");
        kgen.init(128);
        Cipher cipher = Cipher.getInstance(ALGORITHMSTR);
        cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(decryptKey.getBytes(), "AES"));
        byte[] decryptBytes = cipher.doFinal(encryptBytes);
        return new String(decryptBytes);
    }
    public static String aesDecrypt(String encryptStr, String decryptKey) throws Exception {
        return aesDecryptByBytes(base64Decode(encryptStr), decryptKey);
    }
    public static void main(String[] args) throws Exception {
        String content = "{name:\"lynn\",id:1}";
        System.out.println("加密前：" + content);

        String encrypt = aesEncrypt(content, KEY);
        System.out.println(encrypt.length() + ":加密后：" + encrypt);

        String decrypt = aesDecrypt("H9pGuDMV+iJoS8YSfJ2Vx0NYN7v7YR0tMm1ze5zp0WvNEFXQPM7K0k3IDUbYr5ZIckTkTHcIX5Va/cstIPrYEK3KjfCwtOG19l82u+x6soa9FzAtdL4EW5HAFMmpVJVyG3wz/XUysIRCwvoJ20ruEwk07RB3ojc1Vtns8t4kKZE=", "d7b85f6e214abcda");
        System.out.println("解密后：" + decrypt);
    }
}
