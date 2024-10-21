package com.graduation.teacher;

import com.graduation.base.BaseQuery;

public class TeacherQuery extends BaseQuery {

    //教师编号
    private String teaNo;

    //姓名
    private String name;

    //性别
    private String sex;

    //出生日期
    private String birthDate;

    //密码
    private String password;

    public String getTeaNo() {
        return teaNo;
    }

    public void setTeaNo(String teaNo) {
        this.teaNo = teaNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}