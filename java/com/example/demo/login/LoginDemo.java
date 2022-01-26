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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoginApp loginApp = new LoginApp();
        System.out.println(LoginApp.LOGIN_APP);

        System.out.println("이름: ");
        String name = scanner.next();

        System.out.println("아이디: ");
        String id = scanner.next();

        System.out.println("비밀번호: ");
        String pw = scanner.next();

        String res = loginApp.login(id, pw, name);
        System.out.println(res);


    }
}