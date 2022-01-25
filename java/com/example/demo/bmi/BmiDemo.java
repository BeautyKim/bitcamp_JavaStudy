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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BmiApp bmiApp = new BmiApp();
        System.out.println(BmiApp.BMI);

        System.out.println("이름 입력: ");
        String name = scanner.next();

        System.out.println("키 입력: ");
        String height = scanner.next();

        System.out.println("체중 입력: ");
        String weight = scanner.next();


        String res = bmiApp.bmi(name, height, weight);
        System.out.println(res);






    }
}
