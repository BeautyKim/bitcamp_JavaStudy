package com.example.demo.login;

/**
 * packageName:  com.example.demo.calc
 * fileName     : LoginApp.java
 * author       : ahreum
 * date         : 2022-01-25
 * desc         : 아이디, 비번 이름을 받아서 로그인하는 앱
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-01-25      ahreum        최초 생성
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
