package com.company;

public abstract class User {
    private String Login;
    private String password;
    public User(){}
    public  User(String login, String password ){
        this.Login = login;
        this.password= password;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    @Override
    public String toString() {
        return "User{" +
                "Login='" + Login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
