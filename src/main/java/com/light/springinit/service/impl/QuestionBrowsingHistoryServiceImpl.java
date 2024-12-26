package com.light.springinit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.light.springinit.domain.entity.QuestionBrowsingHistory;
import com.light.springinit.service.QuestionBrowsingHistoryService;
import com.light.springinit.mapper.QuestionBrowsingHistoryMapper;
import org.springframework.stereotype.Service;

/**
* @author Ycri
* @description 针对表【question_browsing_history(题库浏览记录)】的数据库操作Service实现
* @createDate 2024-12-18 16:24:49
*/
@Service
public class QuestionBrowsingHistoryServiceImpl extends ServiceImpl<QuestionBrowsingHistoryMapper, QuestionBrowsingHistory>
    implements QuestionBrowsingHistoryService{

}




