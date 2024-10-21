package com.graduation.paper;

import com.graduation.base.BaseMapper;
import com.graduation.question.QuestionDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PaperQuestionMapper extends BaseMapper<PaperQuestionDO, PaperQuestionQuery> {

    void deleteByPaperId(Integer paperId);

    List<QuestionDO> selectByPaperId(Integer paperId);
}
