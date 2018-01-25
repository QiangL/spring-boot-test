package com.liqiang.springboot.web.domain;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Pattern;

/**
 * @author liqiang
 * @Date 2018/1/25
 **/
@Data
public class UserVO {

    @NotBlank(message="user name not illegal")
    @Pattern(regexp = "[a-zA-Z0-9]{6,}")
    private String userName;

    @NotBlank(message="user name not illegal")
    @Pattern(regexp = "[a-zA-Z0-9]{6,}",message = "password not illegal")
    private String password;
}
