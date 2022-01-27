package com.example.demo.bmi;

import java.util.Scanner;

/**
 * packageName:  com.example.demo.bmi
 * fileName     : BmiDemo
 * author       : ahreum
 * date         : 2022-01-25
 * desc         : bmi 측정 앱 실행 컨트롤러
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-01-25      ahreum        최초 생성
 */
public class BmiDemo {
    public String execute(String name, String height, String weight) {
        BmiApp bmiApp = new BmiApp();
        return bmiApp.getBMI(name, height, weight);





    }
}
