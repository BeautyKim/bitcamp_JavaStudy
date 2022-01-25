package com.example.demo.kakao;
/**
 * packageName:  com.example.demo.calc
 * fileName     : KakaoDemo.java
 * author       : ahreum
 * date         : 2022-01-25
 * desc         : 카카오앱을 실행하는 컨트롤러
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-01-25      ahreum        최초 생성
 */
import java.util.Scanner;


public class KakaoDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KakaoApp kakaoApp = new KakaoApp();
        System.out.println(KakaoApp.KAKAO_APP);


    }
}
