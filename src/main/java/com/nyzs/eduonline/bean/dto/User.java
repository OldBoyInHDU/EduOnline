package com.nyzs.eduonline.bean.dto;

/**
 * @author ：RukiHuang
 * @description：User
 * @date ：2022/9/20 8:20
 */
public class User {
    private int id;
    private String account;
    private String password;
    private String username;

    public User(int id, String account, String username) {
        this.id = id;
        this.account = account;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
