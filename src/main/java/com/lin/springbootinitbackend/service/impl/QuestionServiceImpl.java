package com.lin.springbootinitbackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lin.springbootinitbackend.model.entity.Question;
import com.lin.springbootinitbackend.service.QuestionService;
import com.lin.springbootinitbackend.mapper.QuestionMapper;
import org.springframework.stereotype.Service;

/**
* @author kingjames
* @description 针对表【question(题目)】的数据库操作Service实现
* @createDate 2023-08-25 19:43:22
*/
@Service
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question>
    implements QuestionService{

}




