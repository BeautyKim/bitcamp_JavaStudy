package com.example.demo.controller;

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
        for(int i = 0; i < 2; i++){
            System.out.println("메뉴 선택");
            String menu = "1.BMI 2.CALC 3.SEARCH 4.GRADE 5.LOGIN";
            System.out.println(menu);
            String select = scanner.next();

            String res = select;

        /*if(select.equals("1")){
            res = "BMI";
        } else if(select.equals("2")){
            res = "CALC";
        } else if (select.equals("3")){
            res = "SEARCH";
        } else if (select.equals("4")){
            res = "GRADE";
        } else {
            res = "LOGIN";
        }
         */

            switch (select){
                case "1": res = "BMI"; break;
                case "2": res = "CALC"; break;
                case "3": res = "SEARCH"; break;
                case "4": res = "GRADE"; break;
                case "5": res = "LOGIN"; break;
                default: res = "다시 입력해주세요.";
        }
            System.out.println(res);

        }

    }
}
