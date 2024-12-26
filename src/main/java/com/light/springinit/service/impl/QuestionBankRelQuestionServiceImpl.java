package com.light.springinit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.light.springinit.domain.entity.QuestionBankRelQuestion;
import com.light.springinit.service.QuestionBankRelQuestionService;
import com.light.springinit.mapper.QuestionBankRelQuestionMapper;
import org.springframework.stereotype.Service;

/**
* @author Ycri
* @description 针对表【question_bank_rel_question(题库题目关系表)】的数据库操作Service实现
* @createDate 2024-12-18 16:24:49
*/
@Service
public class QuestionBankRelQuestionServiceImpl extends ServiceImpl<QuestionBankRelQuestionMapper, QuestionBankRelQuestion>
    implements QuestionBankRelQuestionService{

}




