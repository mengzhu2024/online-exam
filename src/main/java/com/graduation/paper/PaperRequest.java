package com.graduation.paper;

import com.graduation.base.BaseRequest;

import java.util.List;

public class PaperRequest extends BaseRequest {

    //试卷名称
    private String name;

    //试卷描述
    private String description;

    //所属学科
    private Integer disciplineId;

    //考试班级
    private List<Integer> classIdList;

    //试卷状态
    private String status;

    //所属老师
    private Integer teacherId;

    // 组卷类型
    private String createType;

    // 问题列表
    private List<Integer> questionIdList;

    // 选择题个数
    private Integer selectNum;

    // 填空题个数
    private Integer tiankongNum;

    // 判断题个数
    private Integer judgeNum;

    // 简答题个数
    private Integer jiandaNum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDisciplineId() {
        return disciplineId;
    }

    public void setDisciplineId(Integer disciplineId) {
        this.disciplineId = disciplineId;
    }

    public List<Integer> getClassIdList() {
        return classIdList;
    }

    public void setClassIdList(List<Integer> classIdList) {
        this.classIdList = classIdList;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getCreateType() {
        return createType;
    }

    public void setCreateType(String createType) {
        this.createType = createType;
    }

    public List<Integer> getQuestionIdList() {
        return questionIdList;
    }

    public void setQuestionIdList(List<Integer> questionIdList) {
        this.questionIdList = questionIdList;
    }

    public Integer getSelectNum() {
        return selectNum;
    }

    public void setSelectNum(Integer selectNum) {
        this.selectNum = selectNum;
    }

    public Integer getTiankongNum() {
        return tiankongNum;
    }

    public void setTiankongNum(Integer tiankongNum) {
        this.tiankongNum = tiankongNum;
    }

    public Integer getJudgeNum() {
        return judgeNum;
    }

    public void setJudgeNum(Integer judgeNum) {
        this.judgeNum = judgeNum;
    }

    public Integer getJiandaNum() {
        return jiandaNum;
    }

    public void setJiandaNum(Integer jiandaNum) {
        this.jiandaNum = jiandaNum;
    }
}
