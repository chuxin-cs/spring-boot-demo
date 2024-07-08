package com.chuxin.democrud.entity;

public class User {
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * 主键id
     */
    private Integer id;
    /**
     * 用户名
     */
    private String userName;
    /**
     * password
     */
    private String password;
}
