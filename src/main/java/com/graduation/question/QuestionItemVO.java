package com.graduation.question;

import com.graduation.base.BaseVO;

public class QuestionItemVO extends BaseVO {

    //选项内容
    private String name;

    //选项标识
    private String flag;

    //所属问题
    private Integer questionId;

    //所属问题
    private String questionName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
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