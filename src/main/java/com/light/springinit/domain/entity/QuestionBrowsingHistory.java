package com.light.springinit.domain.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 题库浏览记录
 * @TableName question_browsing_history
 */
@TableName(value ="question_browsing_history")
@Data
public class QuestionBrowsingHistory implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 题目id
     */
    private Long questionId;

    /**
     * 浏览用户 id
     */
    private Long userId;

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
}