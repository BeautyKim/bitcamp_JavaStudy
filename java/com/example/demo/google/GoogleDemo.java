package com.example.demo.google;

import java.util.Scanner;

/**
 * packageName:  com.example.demo.google
 * fileName     : GoogleDemo
 * author       : ahreum
 * date         : 2022-01-25
 * desc         : 구글 검색 출력 실행 컨트롤러
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-01-25      ahreum        최초 생성
 */
public class GoogleDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GoogleApp googleApp = new GoogleApp();
        System.out.println(GoogleApp.GOOGLE_TITLE);
        System.out.println("검색하시오: ");
        String search = scanner.next();

        String res = googleApp.google(search);
        System.out.println(res);

    }
}
