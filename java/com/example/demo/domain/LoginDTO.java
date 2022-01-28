package com.example.demo.domain;

/**
 * packageName:  com.example.demo.calc
 * fileName     : LoginApp.java
 * author       : ahreum
 * date         : 2022-01-25
 * desc         : 아이디, 비번 이름을 받아서 로그인하는 앱
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-01-25      ahreum        최초 생성
 */

public class LoginDTO {
    public static String LOGIN_APP = "로그인앱";
    String id;
        String pw;
        String name;
        public static String PASSWORD = "abc";

        public String getId(){
            return this.name;
        }
        public void setId(String id){
            this.id = id;
        }
        public  String getPw(){
            return this.pw;
        }
        public void setPw(String pw){
            this.pw = pw;
        }
        public String getName(){
            return this.name;
        }
        public void setName(String name){
            this.name = name;
        }
}
