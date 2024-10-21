package com.graduation.question;

import com.graduation.base.BaseVO;
import com.graduation.exam.ExamAnswerDO;

import java.util.List;

public class QuestionVO extends BaseVO {

    //试题名称
    private String name;

    //试题类型
    private String type;

    //分值
    private Integer score;

    //正确答案
    private String answer;

    //学科
    private Integer disciplineId;

    //学科
    private String disciplineName;

    //所属老师
    private Integer teacherId;

    //所属老师
    private String teacherName;

    // 选项
    private List<QuestionItemDO> questionItemList;

    // 学生答案
    private ExamAnswerDO stuAnswer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Integer getDisciplineId() {
        return disciplineId;
    }

    public void setDisciplineId(Integer disciplineId) {
        this.disciplineId = disciplineId;
    }

    public String getDisciplineName() {
        return disciplineName;
    }

    public void setDisciplineName(String disciplineName) {
        this.disciplineName = disciplineName;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public List<QuestionItemDO> getQuestionItemList() {
        return questionItemList;
    }

    public void setQuestionItemList(List<QuestionItemDO> questionItemList) {
        this.questionItemList = questionItemList;
    }

    public ExamAnswerDO getStuAnswer() {
        return stuAnswer;
    }

    public void setStuAnswer(ExamAnswerDO stuAnswer) {
        this.stuAnswer = stuAnswer;
    }
}
