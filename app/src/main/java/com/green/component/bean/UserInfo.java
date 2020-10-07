package com.green.component.bean;

import com.green.component.mvp.bean.BaseBean;

public class UserInfo  extends BaseBean {
    public String name;
    public String age;

    public UserInfo(int code, boolean flag, String msg, String name, String age) {
        super(code, flag, msg);
        this.name = name;
        this.age = age;
    }

    public UserInfo(String name, String age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
