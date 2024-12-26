package com.light.springinit.domain.entity;

import cn.hutool.crypto.digest.DigestUtil;
import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;

import com.light.springinit.constant.UserRole;
import com.light.springinit.domain.dto.user.UserRegisterRequest;
import lombok.Data;

/**
 * 用户
 *
 * @TableName user
 */
@TableName(value = "user")
@Data
public class User implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 账号
     */
    private String userAccount;

    /**
     * 密码
     */
    private String userPassword;

    /**
     * 微信开放平台id
     */
    private String unionId;

    /**
     * 公众号openId
     */
    private String mpOpenId;

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 用户头像
     */
    private String userAvatar;

    /**
     * 用户简介
     */
    private String userProfile;

    /**
     * 分享码
     */
    private String shareCode;

    /**
     * 邀请用户 id
     */
    private Long inviteUser;

    /**
     * 用户角色：user/admin/ban
     */
    private UserRole userRole;

    /**
     * 编辑时间
     */
    private Date editTime;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 是否删除
     */
    @TableLogic
    private Integer deleted;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    public User register(UserRegisterRequest userRegisterRequest) {
        this.setUserAccount(userRegisterRequest.getUserAccount());
        this.setUserName(userRegisterRequest.getUserName());
        this.setUserPassword(DigestUtil.md5Hex(userRegisterRequest.getPassword()));
        this.setShareCode(userRegisterRequest.getShareCode());
        this.setUserRole(UserRole.USER);
        return this;
    }
}