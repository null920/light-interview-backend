package com.light.springinit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.light.springinit.domain.entity.Question;
import com.light.springinit.service.QuestionService;
import com.light.springinit.mapper.QuestionMapper;
import org.springframework.stereotype.Service;

/**
* @author Ycri
* @description 针对表【question(题目)】的数据库操作Service实现
* @createDate 2024-12-18 16:24:49
*/
@Service
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question>
    implements QuestionService{

}




