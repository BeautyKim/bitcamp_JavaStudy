package com.example.demo.member.domain;

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
public class GoogleDTO {
    public static String GOOGLE_TITLE = "Google";
    private final static GoogleDTO googleDTO = new GoogleDTO();
    private GoogleDTO(){}
    public static GoogleDTO getInstance(){return googleDTO;}

    private String search;

    public String getSearch(){
        return this.search;
    }
    public void setSearch(String search){
        this.search = search;
    }

}
