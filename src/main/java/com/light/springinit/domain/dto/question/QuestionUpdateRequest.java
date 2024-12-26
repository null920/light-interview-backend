package com.light.springinit.domain.dto.question;

import lombok.*;

import java.io.Serializable;
import java.util.List;

/**
 * @author null&&
 * @Date 2024/12/20 15:53
 */
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class QuestionUpdateRequest implements Serializable {
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
}
