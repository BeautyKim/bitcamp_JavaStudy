package com.example.demo.login;
/**
 * packageName:  com.example.demo.calc
 * fileName     : LoginDemo.java
 * author       : ahreum
 * date         : 2022-01-25
 * desc         : 로그인 앱을 실행하는 컨트롤러
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-01-25      ahreum        최초 생성
 */
import com.example.demo.bmi.BmiApp;

import java.util.Scanner;

public class LoginDemo {
    public String execute(String name, String id, String pw) {
        LoginApp loginApp = new LoginApp();
        return loginApp.login(id, pw, name);

    }
}