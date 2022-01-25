package com.example.demo.google;

/**
 * packageName:  com.example.demo.google
 * fileName     : GoogleApp
 * author       : ahreum
 * date         : 2022-01-25
 * desc         : 구글 검색 출력 어플
 * 클래스 변수    : "Google"
 * 파리미터, 인스턴스변수 : String search
 * 로컬변수 :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-01-25      ahreum        최초 생성
 */
public class GoogleApp {
    public static String GOOGLE_TITLE = "Google";
    private String search;

    public String google(String search){
        this.search = search;
        String res = "";
        return String.format("검색 결과는 %s 입니다.", this.search);
    }


}
