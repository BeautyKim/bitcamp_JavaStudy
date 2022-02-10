package com.example.demo.member.domain;


import jdk.jshell.Snippet;

/**
 * packageName:  com.example.demo.calc
 * fileName     : CalcApp.java
 * author       : ahreum
 * date         : 2022-01-25
 * desc         : 숫자2개와 연산자 받아서 결과를 리턴하는 앱
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-01-25      ahreum        최초 생성
 */

public class CalcDTO {
    public static String CALC_TITLE = "계산기";

    private final static CalcDTO calcDTO = new CalcDTO();
    private CalcDTO(){}
    public static CalcDTO getInstance(){return calcDTO;}


    private int num1;
    private String opcode;
    private int num2;


    public int getNum1(){
        return this.num1;
    }
    public void setNum1(int num1){
        this.num1 = num1;
    }
    public String getOpcode(){
        return this.opcode;
    }
    public void setOpcode(String opcode){
        this.opcode = opcode;
    }
    public int getNum2(){
        return this.num2;
    }
    public void setNum2(int num2){
        this.num2 = num2;
    }

    }



