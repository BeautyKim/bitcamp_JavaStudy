package com.example.demo.controller;

import com.example.demo.service.QuizService;
import com.example.demo.service.QuizServiceImpl;

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
public class QuizController {
    public static void main(String[] args) {
        QuizService service = new QuizServiceImpl();
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
                    service.quiz1(arr);
                    break;
                case "2":
                    service.quiz2(arr);
                    break;
                case "3":
                    service.quiz3(arr);
                    break;
                case "4":
                    service.quiz4(arr);
                    break;
                default: s = "다시 입력해주세요.";

            }
            System.out.println(s);
        }


    }


}
