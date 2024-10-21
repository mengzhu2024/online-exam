package com.graduation.paper;

import com.graduation.base.BaseRequest;

public class PaperQuestionRequest extends BaseRequest {

    //试卷
    private Integer paperId;

    //问题
    private Integer questionId;

    public Integer getPaperId() {
        return paperId;
    }

    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

}