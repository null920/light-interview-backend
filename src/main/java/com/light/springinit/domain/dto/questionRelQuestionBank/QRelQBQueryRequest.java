package com.light.springinit.domain.dto.questionRelQuestionBank;

import java.io.Serializable;

/**
 * @author null&&
 * @Date 2024/12/20 16:18
 */
public class QRelQBQueryRequest implements Serializable {

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

    /**
     * 创建用户 id
     */
    private Long userId;
}
