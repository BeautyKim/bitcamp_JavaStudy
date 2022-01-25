package com.example.demo.kakao;

/**
 * packageName:  com.example.demo.calc
 * fileName     : KakaoApp.java
 * author       : ahreum
 * date         : 2022-01-25
 * desc         : 전화번호와 메시지를 받아서 전송하는 앱
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-01-25      ahreum        최초 생성
 */

public class KakaoApp {
    static String KAKAO_APP = "카카오 앱";
    String telon;
    String message;

    public String kakao(String telno, String message){
        this.telon = telno;
        this.message = message;
        return String.format("전화번호: %s 메세지: %s", this.telon, this.message);

    }
}
