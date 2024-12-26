package com.light.springinit.domain.dto.user;

import com.light.springinit.common.BaseRequest;
import com.light.springinit.param.UserRegisterParam;
import lombok.*;

/**
 * 用户注册请求
 *
 * @author null&&
 * @Date 2024/7/19 19:11
 */
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserRegisterRequest extends BaseRequest {
    private static final long serialVersionUID = 1L;

    /**
     * 账号
     */
    private String userAccount;

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 确认密码
     */
    private String checkPassword;

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

    public UserRegisterRequest(UserRegisterParam userRegisterParam) {
        this.userAccount = userRegisterParam.getUserAccount();
        if (userRegisterParam.getUserName() == null) {
            this.userName = "默认昵称";
        } else {
            this.userName = userRegisterParam.getUserName();
        }
        this.password = userRegisterParam.getPassword();
        this.checkPassword = userRegisterParam.getCheckPassword();
        this.phone = userRegisterParam.getPhone();
        this.email = userRegisterParam.getEmail();
        this.shareCode = userRegisterParam.getShareCode();
    }
}
