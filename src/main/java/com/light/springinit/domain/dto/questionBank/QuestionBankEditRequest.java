package com.light.springinit.domain.dto.questionBank;

import java.io.Serializable;

/**
 * @author null&&
 * @Date 2024/12/20 16:04
 */
public class QuestionBankEditRequest implements Serializable {
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
     * 描述
     */
    private String description;

    /**
     * 图片
     */
    private String picture;

}
