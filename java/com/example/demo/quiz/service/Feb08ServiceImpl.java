package com.example.demo.quiz.service;

import java.util.Scanner;

/**
 * packageName:  com.example.demo.quiz.service
 * fileName     : Feb08ServiceImpl
 * author       : ahreum
 * date         : 2022-02-08
 * desc         :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-08      ahreum        최초 생성
 */
public class Feb08ServiceImpl implements Feb08Service{
    @Override
    public void lotto(Scanner scanner) {

    }

    @Override
    public void baseball(Scanner scanner) {

    }

    @Override
    public void booking(Scanner scanner) {
        int seat[] = new int[22];
        int reserved;
        String s = "";
        while (true){
            System.out.println("Q3. 좌석예약\n 자석 예약 시스템 입니다.\n 원하시는 메뉴를 입력해주세요\n 0.종료 1.예약");
            switch (scanner.next()){
                case "0":
                    System.out.println("예약을 종료하겠습니다.");return;
                case "1":
                    System.out.println("예약자의 이름을 입력해주세요");
                    String name = scanner.next();
                    System.out.println("현재 좌석 상태");
                    for(int i = 0; i<22; i++){
                        s += i+1+"\t";
                    }
                    System.out.println(s);

                    for (int i : seat)
                        System.out.print(i+"\t");
                        System.out.println("\n좌석선택");
                        reserved = scanner.nextInt();

                    System.out.println(name+"님 "+reserved+" 번 자리에 예약되었습니다.");
                    break;
                default:
                    System.out.println("메뉴를 다시 선택해주세요");
            }
        }
            }

    @Override
    public void bank(Scanner scanner) {

    }

    @Override
    public void gugudan(Scanner scanner) {

    }
}
