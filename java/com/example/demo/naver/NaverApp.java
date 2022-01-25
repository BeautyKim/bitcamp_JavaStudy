package com.example.demo.naver;

/**
 * packageName:  com.example.demo.naver
 * fileName     : NaverApp
 * author       : ahreum
 * date         : 2022-01-25
 * desc         : 네이버 로그인 화면 출력
 * 클래스 변수    :
 * 파리미터, 인스턴스변수 :
 * 로컬변수 :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-01-25      ahreum        최초 생성
 */
public class NaverApp {
    public static String NAVER_TITLE = "NAVER";
    private String id;
    private String pw;

    public String naver(String id, String pw){
        this.id = id;
        this.pw = pw;
        String res ="";
        return String.format("로그인에 성공하셨습니다.");
    }
}
