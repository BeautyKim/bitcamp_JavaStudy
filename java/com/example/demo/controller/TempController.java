package com.example.demo.controller;

import com.example.demo.domain.GradeDTO;

import java.util.Scanner;

/**
 * packageName:  com.example.demo.controller
 * fileName     : TempController
 * author       : ahreum
 * date         : 2022-02-03
 * desc         :
 * ATemd        :
 *     김아름 : 스택, 큐, 힙
 *     유재혁 : 해시, sort
 *     장원종 : Brute Force, DFS, BFS
 *     강민 : DP, 그래프
 *     최건일 : Bin, Greedy
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-03      ahreum        최초 생성
 */
public class TempController {
    public static void main(String[] args) {
        System.out.println("0: 종료 1: quiz1 2: quiz2 3: quiz3 4:quiz4 \t");

        while (true){
            String[] arr = {"김아름", "유재혁", "장원종", "강민", "최건일",
                    "스택", "해시", "Brute Force", "DP", "Bin",
                    "큐", "sort", "DFS", "그래프",
                    "힙",           "BFS",             "Greedy"};
            Scanner scanner = new Scanner(System.in);
            String s = "";
            switch (scanner.next()){
                case "0":
                    System.out.println("시스템 종료"); return;
                case "1":
                    quiz1(arr);
                    break;
                case "2":
                    quiz2(arr);
                    break;
                case "3":
                    quiz3(arr);
                    break;
                case "4":
                    quiz4(arr);
                    break;
                default: s = "다시 입력해주세요.";

            }
            System.out.println(s);
        }


    }

    private static void quiz4(String[] arr) {
        System.out.println("Q4. 팀원별 과제 수를 출력하세요 ");
        int count = 0;
        String countManager = "";
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int[] intArr = new int[5];

        for(int i=0; i<arr.length; i++){
            if(arr[i].equals(arr[11])){
                count0++;
            }if(arr[i].equals(arr[6])){
                count1++;
            }if(arr[i].equals(arr[14])){
                count2++;
            }if(arr[i].equals(arr[7])){
                count3++;
            }if(arr[i].equals(arr[8])){
                count4++;
            }
        }

        System.out.println(arr[0]+"의 카운트는 " + count0);
        System.out.println(arr[1]+"의 카운트는 " + count1);
        System.out.println(arr[2]+"의 카운트는 " + count2);
        System.out.println(arr[3]+"의 카운트는 " + count3);
        System.out.println(arr[4]+"의 카운트는 " + count4);

    }

    private static void quiz3(String[] arr) {

        System.out.println("Q3. 큐를 담당한 사람을 출력하세요 ");
        String s;
        s = "";
        String q = "큐";
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(q)){
                s += arr[i] +"를 담당한 사람: " + arr[i%5];
            }
        }
        System.out.println(s+"\n");
    }

    private static void quiz2(String[] arr) {
        System.out.println("Q2. 팀장이 맡은 과제만 출력하세요 ");
        String zzang = "";
        String name = "강민";
        for(int i = 0; i < arr.length; i++){

            if(arr[i].equals(name)){
                for(int j= 0; j<3; j++){
                    zzang += arr[i+j*5]+"," ;
                }
                if(i==17){break;}
                }
            }
        System.out.println(zzang+"\n");
    }

    private static void quiz1(String[] arr) {
        System.out.println(" Q1. 팀별 과제를 출력하세요 ");
        String s = "";
        for(int i = 0; i < arr.length; i++){
            if(i%5==0){
                s += "\n";
            }
            s += arr[i]+"\t";
        }

        System.out.println(s+"\n");
    }

}
