package com.liqiang.springboot.module.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liqiang
 * @Date 2018/1/8
 **/
@Data
@NoArgsConstructor
public class UserDO {

    private Integer id;

    private String userName;

    private String pwd;

}
