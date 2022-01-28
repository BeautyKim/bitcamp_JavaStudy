package com.example.demo.service;


import com.example.demo.domain.CalcDTO;

/**
 * packageName:  com.example.demo.calc
 * fileName     : CalcDemo.java
 * author       : ahreum
 * date         : 2022-01-25
 * desc         : 계산기 앱을 실행하는 데모
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-01-25      ahreum        최초 생성
 */

public class CalcService {
    public String getCalc(CalcDTO calc) {
        int res = 0;
        switch (calc.getOpcode()) {
            case "+":
                res = calc.getNum1() + calc.getNum2();
                break;
            case "-":
                res = calc.getNum1() - calc.getNum2();
                break;
            case "*":
                res = calc.getNum1() * calc.getNum2();
                break;
            case "/":
                res = calc.getNum1() / calc.getNum2();
                break;
        }
        return String.format("%d %s %d = %d", calc.getNum1(), calc.getOpcode(), calc.getNum2(), res);
    }
}
