package com.graduation.exam;

import com.graduation.base.BaseEntity;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ExamAnswerDO extends BaseEntity {

    //试卷
    private Integer examId;

    //试卷
    private String examName;

    //问题
    private Integer questionId;

    //问题
    private String questionName;

    //学生答案
    private String answer;

    //回答结果
    private String result;

    //老师批注
    private String remark;

    //得分
    private Integer score;

    public Integer getExamId() {
        return examId;
    }

    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
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

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

}