package com.light.springinit.domain.dto.question;

import lombok.*;

import java.io.Serializable;
import java.util.List;

/**
 * 题目创建请求
 *
 * @author null&&
 * @Date 2024/12/18 17:25
 */
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class QuestionCreateRequest implements Serializable {

    private static final long serialVersionUID = 1L;
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
     * 题目来源
     */
    private String source;
}
