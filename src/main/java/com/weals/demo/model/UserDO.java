package com.weals.demo.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDO {
    /**
     * id
     */
    private Long id;
    /**
     * 账号
     */
    private String account;
    /**
     * 密码
     */
    private String password;
    /**
     * 用户名
     */
    private String username;

}
