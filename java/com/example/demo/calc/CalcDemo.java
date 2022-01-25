package com.example.demo.calc;

import java.util.Scanner;

public class CalcDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalcApp calcApp = new CalcApp();
        System.out.println(CalcApp.CALC_TITLE);
        System.out.println("첫번재 숫자 : ");
        int num1 = scanner.nextInt();

        System.out.println("연산자 : ");
        String opcode = scanner.next();

        System.out.println("두번재 숫자 : ");
        int num2 = scanner.nextInt();

        String res = calcApp.calc(num1, opcode, num2);
        System.out.println("연산결과 : "+ res);


    }
}
