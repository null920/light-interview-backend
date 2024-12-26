package com.light.springinit.domain.dto.questionRelQuestionBank;

import java.io.Serializable;

/**
 * @author null&&
 * @Date 2024/12/20 16:23
 */
public class QRelQBUpdateRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Long id;

    /**
     * 题库 id
     */
    private Long questionBankId;

    /**
     * 题目 id
     */
    private Long questionId;
}
