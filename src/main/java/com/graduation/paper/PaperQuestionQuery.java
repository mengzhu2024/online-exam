package com.graduation.paper;

import com.graduation.base.BaseQuery;

public class PaperQuestionQuery extends BaseQuery {

    //试卷
    private Integer paperId;

    //试卷
    private String paperName;

    //问题
    private Integer questionId;

    //问题
    private String questionName;

    public Integer getPaperId() {
        return paperId;
    }

    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
    }

    public String getPaperName() {
        return paperName;
    }

    public void setPaperName(String paperName) {
        this.paperName = paperName;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getQuestionName() {
        return questionName;
    }

    public void setQuestionName(String questionName) {
        this.questionName = questionName;
    }

}