package com.graduation.teacher;

import com.graduation.base.BaseEntity;

import java.time.LocalDate;

public class TeacherDO extends BaseEntity {

    //教师编号
    private String teaNo;

    //姓名
    private String name;

    //性别
    private String sex;

    //出生日期
    private LocalDate birthDate;

    //密码
    private String password;

    private String role = "老师";

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
