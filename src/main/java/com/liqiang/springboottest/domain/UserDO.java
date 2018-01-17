package com.liqiang.springboottest.domain;

/**
 * @author liqiang (liqiang8@xiaomi.com)
 * @Date 2018/1/8
 **/
public class UserDO {

    private Integer id;

    private String userName;

    private String pwd;

    public UserDO(String userName, String pwd) {
        this.userName = userName;
        this.pwd = pwd;
    }
    public UserDO(){}

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

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "UserDO{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
