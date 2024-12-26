package com.light.springinit.domain.dto.question;

import com.light.springinit.common.BaseRequest;
import lombok.*;

import java.util.List;

/**
 * 题目查询请求
 *
 * @author null&&
 * @Date 2024/12/18 17:30
 */
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class QuestionQueryRequest extends BaseRequest {

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
     * 搜索词
     */
    private String searchText;

    /**
     * 标签列表（json 数组）
     */
    private List<String> tags;

    /**
     * 创建用户id
     */
    private Long userId;

}
