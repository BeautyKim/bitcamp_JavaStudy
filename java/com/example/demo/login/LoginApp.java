package com.example.demo.login;
/**
 * 아이디, 비번, 이름을 받아서 계산하는 계산기를 코딩하시오
 * String,String,String
 */
public class LoginApp {
    String id;
    String pw;
    String name;

    public String login(String id, String pw, String name){
        this.id = id;
        this.pw = pw;
        this.name = name;
        return String.format(" ID : %s, PW : %s, Name : %s ", this.id, this.pw, this.name);

    }


}
