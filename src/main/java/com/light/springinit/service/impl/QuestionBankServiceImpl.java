package com.light.springinit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.light.springinit.domain.entity.QuestionBank;
import com.light.springinit.service.QuestionBankService;
import com.light.springinit.mapper.QuestionBankMapper;
import org.springframework.stereotype.Service;

/**
* @author Ycri
* @description 针对表【question_bank(题库)】的数据库操作Service实现
* @createDate 2024-12-18 16:24:49
*/
@Service
public class QuestionBankServiceImpl extends ServiceImpl<QuestionBankMapper, QuestionBank>
    implements QuestionBankService{

}




