package com.jf.databindingdemo.bean;

public class UserBean {
    private String name;//姓名
    private int age;//年龄
    private String picUrl;

    public UserBean(String picUrl,String name, int age){
        this.name = name;
        this.age = age;
        this.picUrl = picUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }
}
