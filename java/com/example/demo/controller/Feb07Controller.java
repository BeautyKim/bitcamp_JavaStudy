package com.example.demo.controller;

/**
 * packageName:  com.example.demo.controller
 * fileName     : Feb07Controller
 * author       : ahreum
 * date         : 2022-02-07
 * desc         :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-07      ahreum        최초 생성
 */

import com.example.demo.service.Feb07Service;
import com.example.demo.service.Feb07ServiceImpl;

import java.util.Scanner;

/**
 * 1. 주사위(dice)
 * 2. 가위바위보(RPS)
 * 3. 입력받은 두 수 사이에 있는 소수 구하기(gerPrime)
 * 4. 자바로 입력받은 연도가 윤년인지 평년인지 판단하기(leapYear)
 * 5. 임의로 입력받은 숫자 맞추기(numberGolf)
 * */
public class Feb07Controller {
    public static void main(String[] args) {
        Feb07Service service = new Feb07ServiceImpl();
        System.out.println("1. 주사위 \n"+"2. 가위바위보 \n"+"3. 입력받은 두 수 사이에 있는 소수 구하기 \n"+"4. 자바로 입력받은 연도가 윤년인지 평년인지 판단하기 \n"+"5. 임의로 입력받은 숫자 맞추기(numberGolf)");
        while (true){
            Scanner scanner = new Scanner(System.in);
            String res = "";
            switch (scanner.next()){
                case "0":
                    System.out.println("시스템 종료"); return;
                case "1":
                    service.dice(scanner);
                    break;
                case "2":
                    service.rps(scanner);
                    break;
                case "3":
                    service.gerPrime(scanner);
                    break;
                case "4":
                    service.leapYear(scanner);
                    break;
                case "5":
                    service.numberGolf(scanner);
                    break;
                default: res = "다시 입력";
            }
            System.out.println(res);

        }
    }


}
