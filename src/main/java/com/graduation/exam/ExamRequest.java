package com.graduation.exam;

import com.graduation.base.BaseRequest;

public class ExamRequest extends BaseRequest {

    //试卷名称
    private String name;

    //考试学生
    private Integer stuId;

    //考试试卷
    private Integer paperId;

    //考试状态
    private String status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public Integer getPaperId() {
        return paperId;
    }

    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}