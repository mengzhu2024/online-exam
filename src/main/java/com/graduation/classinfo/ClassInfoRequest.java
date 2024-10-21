package com.graduation.classinfo;

import com.graduation.base.BaseRequest;

public class ClassInfoRequest extends BaseRequest {

    //班级名称
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}