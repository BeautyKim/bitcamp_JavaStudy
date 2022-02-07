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
        System.out.println(" Q1. 팀별 과제를 출력하세요 ");

        String[] arr = {"김아름", "유재혁", "장원종", "강민", "최건일",
                          "스택", "해시", "Brute Force", "DP", "Bin",
                           "큐", "sort", "DFS", "그래프",
                          "힙",           "BFS",             "Greedy"};
        String s = "";
        for(int i = 0; i < arr.length; i++){
            if(i%5==0){
                s += "\n";
            }
            s += arr[i]+"\t";
        }
        System.out.println(s+"\n");


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

        s = "";
        String q = "큐";
        System.out.println("Q3. 큐를 담당한 사람을 출력하세요 ");
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(q)){
                s += arr[i] +"를 담당한 사람: " + arr[i%5];
            }
        }
        System.out.println(s+"\n");



        System.out.println("Q4. 팀원별 과제 수를 출력하세요 ");
        int count = 0;
        String countManager = "";

    }

    }
