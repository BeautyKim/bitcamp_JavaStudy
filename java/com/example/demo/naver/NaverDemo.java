package com.example.demo.naver;

import java.util.Scanner;

/**
 * packageName:  com.example.demo.naver
 * fileName     : NaverDemo
 * author       : ahreum
 * date         : 2022-01-25
 * desc         : 네이버 로그인 앱 실행 컨트롤러
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-01-25      ahreum        최초 생성
 */
public class NaverDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NaverApp naverApp = new NaverApp();
        System.out.println(NaverApp.NAVER_TITLE);
        System.out.println("아이디 입력: ");
        String id = scanner.next();

        System.out.println("비밀번호 입력: ");
        String pw = scanner.next();

        String res = naverApp.naver(id,pw);
        System.out.println(res);


    }
}
