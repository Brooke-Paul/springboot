package com.xt.api.entity;

import java.io.Serializable;

/**
 * @Author xuetao
 * @Description: 学生实体
 * @Date 2019-02-14
 * @Version 1.0
 */
public class Studtent implements Serializable {

    private String stuID;

    private String userName;

    private String className;

    public String getStuID() {
        return stuID;
    }

    public void setStuID(String stuID) {
        this.stuID = stuID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Studtent(String stuID, String userName, String className) {
        this.stuID = stuID;
        this.userName = userName;
        this.className = className;
    }

    @Override
    public String toString() {
        return "Studtent{" +
                "stuID='" + stuID + '\'' +
                ", userName='" + userName + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}
