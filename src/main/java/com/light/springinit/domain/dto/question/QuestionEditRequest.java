package com.light.springinit.domain.dto.question;

import lombok.*;

import java.io.Serializable;
import java.util.List;

/**
 * 题目编辑请求
 *
 * @author null&&
 * @Date 2024/12/18 17:35
 */
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class QuestionEditRequest implements Serializable {

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
    private List<String> tags;

    /**
     * 推荐答案
     */
    private String answer;

    /**
     * 状态：0-待审核, 1-通过, 2-拒绝
     */
    private Integer reviewStatus;

    /**
     * 审核信息
     */
    private String reviewMessage;

    /**
     * 优先级
     */
    private Integer priority;

    /**
     * 题目来源
     */
    private String source;
}
