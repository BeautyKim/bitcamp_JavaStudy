package com.example.demo.algorithmHome;

import java.util.Random;

public class Dicd {
    public static void main(String[] args) {

        //플레이어(Math 랜덤값)와 컴퓨터(Random 랜덤값) 주사위 굴리기를 해 이기면
        // "You Win!", 비기면 "Draw.", 지면 "You Lose!"를 출력하세요.
        int com = new Random().nextInt(5)+1;
        int player = (int)((Math.random()*5)+1);
        String s = "Draw";
        System.out.println("플레이어 숫자:"+player+ "\n컴퓨터 숫자:"+com);
        if(player != com) s = (player > com) ? "You Win!" : "You Lose!";
            System.out.println(s);

    }




    public static void dicdUntilOddSum(){
        //홀수가 나올때까지 주사위 굴려 합하는 프로그램
        //Random random = new Random();
        Random random = new Random();
        int result = 0;
        while (true){
            int r = random.nextInt(5)+1;
            System.out.println("dice value : " + r);
            if (r % 2 != 0){
                break;
            }
            result += r;
        }
        System.out.println(result);

    }
    public static void dice5TimesSum(){
        //6면이 주사위를 5회 굴려서 나온 합계를 구하시오.
        //(int)(Math.random()*최댓값)+최솟값

        int result = 0;
        for (int i=0; i<5; i++){
            double d = Math.random();
            int temp = (int) (d*6)+1; // 랜덤 1~6 정수값
            System.out.println(temp);
        }
        System.out.println("주사위를 5회 굴려서 나온 수의 합계"+result);





        /**
         * 랜덤값을 구하는 방법은 두가지.
         * (int)(Math.random()*최댓값)+최솟값-> 클래스 메소드 사용
         * Random random = new Random(); -> 인스턴스 메소드 방식
         *
         * 자바의 타입 : 프리미티브 (소문자 int boolean double), 레퍼런스(대문자)
         * */

    }
}

