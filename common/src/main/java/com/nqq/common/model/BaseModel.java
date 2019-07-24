/**
 * Copyright (C), 2015-2019, 付临门有限公司
 * FileName: BaseModel
 * Author:   user
 * Date:     2019/7/17 14:50
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.nqq.common.model;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author user
 * @create 2019/7/17
 * @since 1.0.0
 */
public abstract class BaseModel {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
