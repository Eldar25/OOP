package com.company;

public abstract class Employee {
    private String LoginType;
    private String Login;
    private String password;

    public Employee(){}

    public Employee(String loginType, String login , String password) {
        this.LoginType = loginType;
        this.Login = login;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getLoginType() {
        return LoginType;
    }

    public void setLoginType(String loginType) {
        LoginType = loginType;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "LoginType='" + LoginType + '\'' +
                ", Login='" + Login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
