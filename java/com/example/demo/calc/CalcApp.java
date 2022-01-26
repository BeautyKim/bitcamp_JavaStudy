package com.example.demo.calc;

import org.springframework.http.converter.json.GsonBuilderUtils;


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

public class CalcApp {
    public static String CALC_TITLE = "계산기";
    private int num1;
    private String opcode;
    private int num2;

    public String calc(int num1, String opcode, int num2){
        this.num1 = num1;
        this.num2 = num2;
        this.opcode = opcode;
        int res = 0;

        /*if(opcode.equals("+")){
            res = this.num1 + this.num2;
        } else if(opcode.equals("-")){
            res = this.num1 - this.num2;
        } else  if(opcode.equals("*")){
            res = this.num1 * this.num2;
        } else if(opcode.equals("/")){
            res = this.num1 / this.num2;
        } else {
            res = 0;
        }*/

        switch(opcode){
            case "+": res = num1 + num2; break;
            case "-": res = num1 - num2; break;
            case "*": res = num1 * num2; break;
            case "/": res = num1 / num2; break;
        }

        String result = String.format("%d %s %d = %d", this.num1, this.opcode, this.num2, res);
        return result;
    }
}
