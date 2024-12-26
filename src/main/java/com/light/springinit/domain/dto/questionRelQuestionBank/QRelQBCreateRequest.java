package com.light.springinit.domain.dto.questionRelQuestionBank;

import java.io.Serializable;

/**
 * @author null&&
 * @Date 2024/12/20 16:12
 */
public class QRelQBCreateRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 题库 id
     */
    private Long questionBankId;

    /**
     * 题目 id
     */
    private Long questionId;

    /**
     * 题目顺序（题号）
     */
    private Integer questionOrder;
}
