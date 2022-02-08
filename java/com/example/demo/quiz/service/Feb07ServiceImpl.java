package com.example.demo.quiz.service;

import com.example.demo.quiz.service.Feb07Service;

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
public class Feb07ServiceImpl implements Feb07Service {
    @Override
    public void dice(Scanner scanner) {String res = " ";
        int start = 0;
        int dice1 = (int) (Math.random() * 6 + 1);
        int dice2 = (int) (Math.random() * 6 + 1);

        System.out.println("숫자 0을 입력하면 게임이 시작합니다.");
        if(start == scanner.nextInt()) {
            System.out.println("사용자가 주사위를 던집니다.");
            System.out.println(dice1);
            System.out.println("컴퓨터가 주사위를 던집니다.");
            System.out.println(dice2);}

        if(dice1>dice2) {
            res = "사용자가 이겼습니다.";
        }else if(dice1 == dice2){
            res = "비겼습니다.";
        } else res = "컴퓨터가 이겼습니다.";
        System.out.println(res);

    }

    @Override
    public void rps(Scanner scanner) {
        while (true){
            System.out.println("###가위바위보 게임###\n" +
                    "0.종료 1.가위 2.바위 3.보");
            int user = scanner.nextInt();
            int com = (int)(Math.random() * 3);
            String s = "";
            String[] arrrps = new String[3];
            arrrps[0] = "가위";
            arrrps[1] = "바위";
            arrrps[2] = "보";
            switch (user){
                case 0: System.out.println("가위바위보 종료"); return;
                case 1:
                    System.out.println("유저는"+arrrps[user-1]+", 컴퓨터는"+arrrps[com]+"을(를)냈습니다.");
                    if (com ==0){
                        s = "비겼습니다.";
                    } else if(com == 1){
                        s = "컴퓨터가 이겼습니다.";
                    } else {
                        s = "유져가 이겼습니다.";
                    } break;
                case 2:
                    System.out.println("유저는"+arrrps[user-1]+", 컴퓨터는"+arrrps[com]+"을(를)냈습니다.");
                    if (com ==0){
                        s = "유져가 이겼습니다.";
                    } else if(com == 1){
                        s = "비겼습니다.";
                    } else {
                        s = "컴퓨터가 이겼습니다.";
                    }break;
                case 3:
                    System.out.println("유저는"+arrrps[user-1]+", 컴퓨터는"+arrrps[com]+"을(를)냈습니다.");
                    if (com ==0){
                        s = "컴퓨터가 이겼습니다.";
                    } else if(com == 1){
                        s = "유져가 이겼습니다.";
                    } else {
                        s = "비겼습니다.";
                    }break;
                default:
                    s = "잘못 입력하셨습니다."; break;
            }

            System.out.println(s);
        }
    }

    @Override
    public void gerPrime(Scanner scanner) {
        int count=0;
        System.out.println("100이하의 숫자를 입력(소수 구하기) : ");
        int number = scanner.nextInt();

        for (int i = 2; i < number; i++) {
            for(int j=2; j<=i;j++){
                if(i%j ==0){
                    count++;
                }
            }
            if(count==1){
                System.out.print(i+"\t");
            }
            count =0;
        }
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