package com.light.springinit.param;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

/**
 * 用户注册参数
 *
 * @author null&&
 * @Date 2024/7/19 19:16
 */
@Setter
@Getter
public class UserRegisterParam {
    /**
     * 账号
     */
    @NotBlank(message = "账号不能为空")
    private String userAccount;

    /**
     * 密码
     */
    @NotBlank(message = "密码不能为空")
    private String password;

    /**
     * 确认密码
     */
    @NotBlank(message = "确认密码不能为空")
    private String checkPassword;

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 电话
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 邀请码
     */
    private String shareCode;
}
