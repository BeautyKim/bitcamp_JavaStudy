package com.example.demo.controller;

import com.example.demo.calc.CalcDemo;

import java.util.Scanner;

/**
 * packageName:  com.example.demo.controller
 * fileName     : DemoController
 * author       : ahreum
 * date         : 2022-01-27
 * desc         :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-01-27      ahreum        최초 생성
 */
public class DemoController {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        CalcDemo calcDemo = new CalcDemo();
        while (true){
            System.out.println("메뉴 선택");
            String menu = "0.Exit 1.BMI 2.CALC 3.SEARCH 4.GRADE 5.LOGIN";
            System.out.println(menu);
            String select = scanner.next();
            String res ="";

            switch (select){
                case "0":
                    System.out.println("Exit"); return;
                case "1": res = "BMI"; break;
                case "2": res = "CALC";
                    calcDemo.execute();
                    break;
                case "3": res = "SEARCH"; break;
                case "4": res = "GRADE"; break;
                case "5": res = "LOGIN"; break;
                default: res = "다시 입력해주세요.";
        }
            System.out.println(res);

        }

    }
}
