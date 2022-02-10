package com.example.demo.quiz.service;

import java.util.Random;
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

        int[] comNum = new int[6];
        String s = "번호: ";
        while (true){
            System.out.println("### 로또 ###\n" +
                    "0.종료 1.무작위 로또번호 받기 2.로또게임");
            switch (scanner.next()){
                case "0" :
                    System.out.println("EXIT"); return;
                case "1":
                    for (int i = 0; i < 6; i++){
                        comNum[i] = (int)(Math.random()*45)+1;
                        for (int j = 0; j < i; j++){
                            if (comNum[i] == comNum[j]){
                                i--; break;
                            }
                        }
                    }
                    for (int i = 0; i < 6 ; i++){
                        s += comNum[i]+" ";
                    }
                    System.out.println(s); break;
                case "2":
                    for (int i = 0; i < 6; i++){
                        comNum[i] = (int)(Math.random()*45)+1;
                        for (int j = 0; j < i; j++){
                            if (comNum[i] == comNum[j]){
                                i--; break;
                            }
                        }
                    }
                    for (int i = 0; i < 6 ; i++){
                        s += comNum[i]+" ";
                    }
                    System.out.println("1~45 사이의 번호를 중복없이 6번 입력하세요");
                    int[] userNum = new int[6];
                    String u = "입력한 번호: ";
                    for (int m = 0; m < 6; m++){
                        userNum[m] = scanner.nextInt();
                        u += userNum[m] + " ";
                    }
                    int hit = 0;
                    for (int n = 0; n < 6; n++)
                        for (int p = 0; p < 6; p++)
                            if (comNum[n] == userNum[p]){
                                hit++; break;
                            }
                    String rank = "";
                    if (hit == 6){
                        rank = "축하합니다! 1등입니다!";
                    } else if (hit == 5){
                        rank = "축하합니다! 2등입니다!";
                    } else if (hit == 4){
                        rank = "축하합니다! 3등입니다!";
                    } else {
                        rank = "아쉽게도 꽝입니다.";
                    }
                    System.out.println(u+"\n"+s+"\n"+"맞춘 갯수: "+hit+"\n"+rank);
                    break;
                default:
                    System.out.println("WRONG"); break;
            }
        }

    }

    @Override

    /**숫자야구의 조건
     1 ~ 9 사이의 랜덤 숫자 3개 생성 (중복 X, 음수 X)
     1 ~ 9 사이의 사용자 입력 숫자 3개 생성 (중복 X, 음수 X)
     랜덤 숫자와 사용자 입력 숫자의 위치와 숫자가 모두 같은 경우 -> strike
     랜덤 숫자와 사용자 입력 숫자의 위치는 다르고 숫자가 같은 경우 -> ball
     하나의 랜덤 숫자당 기회 총 10번
     기회를 모두 소진하거나 정답을 입력 시 replay 여부 체크
     'Y' 또는 'y' 입력 시 랜덤 숫자 생성부터 다시 실행
     'N' 또는 'n' 이나 다른 문자 입력 시 게임 종료
     *
     */
    public void baseball(Scanner scanner) {

        int com[] = new int[3]; // 컴퓨터가 제공하는 숫자
        int user[] = new int[3]; // 사용자가 입력할 숫자
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int count = 0; // 게임 횟수
        // 랜덤 숫자 생성
        while(com[0]==0) {
            com[0] = random.nextInt(10);
        }
        while(com[0]==com[1] || com[1]==0) {
            com[1] = random.nextInt(10);
        }
        while(com[1]==com[2] || com[2]==0) {
            com[2] = random.nextInt(10);
        }
        while(true) {
            int strike = 0;
            int ball = 0;
            for(int i=0; i<user.length; i++) {
                System.out.print((i+1)+"번째 수: ");
                user[i] = sc.nextInt();
                if(user[i] > 9 || user[i] <= 0) {
                    System.out.println("숫자 범위는 1~9 입니다.");
                }
            }
            for(int i=0; i<com.length; i++) {
                for(int j=0; j<user.length; j++) {
                    if(com[i] == user[j] && i==j) { // 숫자와 위치가 일치
                        strike++;
                    } else if(com[i] ==user[j] && i!=j) { // 위치는 다르나 숫자는 일치
                        ball++;
                    }
                }
            }
            System.out.println(strike+" 스트라이크 "+ball+" 볼 ");
            count++;
            if(strike == 3) {
                System.out.println("게임 끝\n" + count + "번째 시도 성공");
                break;


            }

        }


    }

    @Override
    public void booking(Scanner scanner) {
        int seat[] = new int[22];
        int reserved;
        String s = "";
        while (true){
            System.out.println("Q3. 좌석예약\n 자석 예약 시스템 입니다.\n 원하시는 메뉴를 입력해주세요\n 0.종료 1.예약 2.예약확인");
            switch (scanner.next()){
                case "0":
                    System.out.println("예약을 종료하겠습니다.");return;
                case "1":
                    System.out.println("예약자의 이름을 입력해주세요");
                    String name = scanner.next();
                    System.out.println("현재 좌석 상태");
                    for(int i = 0; i<seat.length; i++){
                        s += i+1+"\t";
                    }
                    System.out.println(s);

                    for (int i : seat)
                        System.out.print(i+"\t");
                        System.out.println("\n좌석선택");
                        reserved = scanner.nextInt();

                    System.out.println(name+"님 "+reserved+" 번 자리에 예약되었습니다.");
                    break;
                case "2":
                    System.out.println("예약확인");

                    break;
                default:
                    System.out.println("메뉴를 다시 선택해주세요");
            }
        }
            }

    @Override
    public void bank(Scanner scanner) {
        int jango = 0;
        int money =0;

        while (true){
            System.out.printf("은행 잔고는 : %d 원 입니다.",jango);
            System.out.print("선택 (0.종료 1. 입금  2.출금) : ");
            switch (scanner.nextInt()){
                case 0:
                    System.out.println("===소메뉴 종료===");
                    return;
                case 1:
                    System.out.println("입금액을 입력하세요 : ");
                    money = scanner.nextInt();
                    jango +=money;
                    System.out.printf("%d 원을 입금하였습니다. 잔고는 %d 원 입니다.",money,jango);
                    break;
                case 2:
                    money = scanner.nextInt();
                    jango -=money;
                    System.out.printf("%d 원을 출금하였습니다. 잔고는 %d 원 입니다.",money,jango);
                    break;
                default:
                    break;
            }
            System.out.println();
        }

    }

    @Override
    public void gugudan(Scanner scanner) {
        System.out.println("5. 구구단");
        for (int i = 1; i < 10; i++) {
            System.out.println(" ### " + i + "단 ###");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
        }
    }

    }
