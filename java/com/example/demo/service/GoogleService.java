package com.example.demo.service;

import com.example.demo.domain.GoogleDTO;

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
public class GoogleService {
    public String getSearch(GoogleDTO google) {
        return String.format("검색 결과는 %s 입니다.",google.getSearch());

    }
}
