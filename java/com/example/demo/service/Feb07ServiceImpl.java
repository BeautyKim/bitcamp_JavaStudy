package com.example.demo.service;

import java.util.Scanner;

/**
 * packageName:  com.example.demo.service
 * fileName     : Feb07Service
 * author       : ahreum
 * date         : 2022-02-07
 * desc         :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-07      ahreum        최초 생성
 */
public class Feb07ServiceImpl implements Feb07Service{
    @Override
    public void dice(Scanner scanner) {

    }

    @Override
    public void rps(Scanner scanner) {

    }

    @Override
    public void gerPrime(Scanner scanner) {

    }

    @Override
    public void leapYear(Scanner scanner) {

    }

    @Override
    public void numberGolf(Scanner scanner) {
        System.out.println("5. 임의로 입력받은 숫자 맞추기");
        int count = 0;
        int num = (int)(Math.random() * 100)+1;

        Scanner res = new Scanner(System.in);

        int num_enter = 0;

        while (num != num_enter){
            System.out.println("1~100 숫자 입력");
            num_enter = res.nextInt();
            if(num > num_enter){
                System.out.println("UP");
                count++;
            }else if(num < num_enter){
                System.out.println("DOWN");
                count++;
            }
        }
        System.out.println("정답입니다" + count +"회 만에 맞췄어요.");
        res.close();

    }
}