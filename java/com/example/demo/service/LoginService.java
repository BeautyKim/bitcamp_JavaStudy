package com.example.demo.service;

import com.example.demo.domain.LoginDTO;

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

public class LoginService {
    public String getLogin(LoginDTO login) {
        return (login.getPw().equals(LoginDTO.PASSWORD)) ? String.format("%s 님의 비번 %s 가 맞습니다. 로그인 성공", login.getName(), login.getPw())
                : String.format("%s 의 ID 는 맞고, 비번 %s 가 틀립니다. 로그인 실패 ", login.getName(), login.getPw());


    }
}