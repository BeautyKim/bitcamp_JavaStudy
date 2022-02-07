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
        System.out.println("주사위 문제");
        String res = " ";
        int num = (int)(Math.random() * 6 +1);
        if(num==1){
            res = "1번이 나왔습니다.";
        }else if(num==2){
            res = "2번이 나왔습니다.";
        }else if(num==3){
            res = "3번이 나왔습니다.";
        }else if(num==4){
            res = "4번이 나왔습니다.";
        }else if(num==5){
            res = "5번이 나왔습니다.";
        }if(num==6){
            res = "6번이 나왔습니다.";
        }
        System.out.println(res);

    }

    @Override
    public void rps(Scanner scanner) {

    }

    @Override
    public void gerPrime(Scanner scanner) {


    }

    @Override
    public void leapYear(Scanner scanner) {
        System.out.println("자바로 입력받은 연도가 윤년인지 평년인지 판단하기");
        System.out.println("연도를 입력하시오");
        int a = scanner.nextInt();

        if(a%4==0 && a%100!=0 || a%400==0){
            System.out.println(a +"는 윤년입니다");
        }else{
            System.out.println(a +"는 평년입니다");
        }

    }

    @Override
    public void numberGolf(Scanner scanner) {
        System.out.println("5. 임의로 입력받은 숫자 맞추기\n"+"1~100 숫자 입력");
        int count = 0;
        int num = (int)(Math.random() * 100)+1;
        int num_enter = 0;

        Scanner cho = new Scanner(System.in);

        while (num != num_enter){
            num_enter = cho.nextInt();
            if(num_enter >= 101){
                System.out.println("숫자를 1부터 100까지 입력해주세요.");}
            else if(num > num_enter){
                System.out.println("UP");
                count++;
            }else if(num < num_enter){
                System.out.println("DOWN");
                count++;
            }
        }
        System.out.println("정답입니다 " + count +"회 만에 맞췄어요.");
    }
}