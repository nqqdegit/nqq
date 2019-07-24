/**
 * Copyright (C), 2015-2019, 付临门有限公司
 * FileName: Redis
 * Author:   user
 * Date:     2019/7/16 9:58
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.nqq.common.redis;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author user
 * @create 2019/7/16
 * @since 1.0.0
 */
@Component
public class Redis {

    @Autowired
    private StringRedisTemplate template;

    /**
     * expire为过期时间，秒为单位
     * @param key
     * @param value
     * @param expire
     */
    public void set(String key,String value,long expire){
        template.opsForValue().set(key,value,expire, TimeUnit.SECONDS);
    }

    public void set(String key,String value){
        template.opsForValue().set(key,value);
    }

    public Object get(String key){
        return template.opsForValue().get(key);
    }

    public void delete(String key){
        template.delete(key);
    }
}
