/**
 * Copyright (C), 2015-2019, 付临门有限公司
 * FileName: Application
 * Author:   user
 * Date:     2019/7/10 15:47
 * Description: 评论
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.nqq.comment;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 〈一句话功能简述〉<br> 
 * 〈评论〉
 *
 * @author user
 * @create 2019/7/10
 * @since 1.0.0
 */
@SpringCloudApplication
@ComponentScan(basePackages = "com.nqq")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
