package com.graduation.question;

import com.graduation.base.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface QuestionItemMapper extends BaseMapper<QuestionItemDO, QuestionItemQuery> {

    void deleteByQuestionId(Integer questionId);

}
