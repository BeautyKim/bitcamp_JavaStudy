package com.example.demo.kakao;
/**
 * 전화번호와 메시지를 받아서 전송하는 어플을 만드시오
 * String telno, String message
 * */
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
