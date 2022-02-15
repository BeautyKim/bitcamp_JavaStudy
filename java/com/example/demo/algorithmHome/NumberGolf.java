package com.example.demo.algorithmHome;

import java.util.Scanner;

public class NumberGolf {
    public static void main(String[] args) {
        System.out.println("5. 임의로 입력받은 숫자 맞추기\n" + "1~100 숫자 입력");
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int com = (int) (Math.random() * 100) + 1;
        int player = 0;
        player = scanner.nextInt();
        String s = "정답입니다";


    }
}