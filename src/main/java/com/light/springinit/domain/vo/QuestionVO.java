package com.light.springinit.domain.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * 题目 VO
 *
 * @author null&&
 * @Date 2024/12/20 16:28
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
public class QuestionVO implements Serializable {
    private static final long serialVersionUID = 1L;

        /**
     * id
     */
    private Long id;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 标签列表（json 数组）
     */
    private String tags;

    /**
     * 推荐答案
     */
    private String answer;

    /**
     * 创建用户
     */
    private UserVO userVO;

    /**
     * 浏览量
     */
    private Integer viewNum;

    /**
     * 点赞数
     */
    private Integer thumbNum;

    /**
     * 收藏数
     */
    private Integer favourNum;

    /**
     * 题目来源
     */
    private String source;

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

}
