package com.graduation.discipline;

import com.graduation.base.BaseRequest;

public class DisciplineRequest extends BaseRequest {

    //学科名称
    private String name;

    //学科类型
    private String type;

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

}