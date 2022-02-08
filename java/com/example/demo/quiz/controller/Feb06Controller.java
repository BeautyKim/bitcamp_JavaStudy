package com.example.demo.quiz.controller;

import com.example.demo.quiz.service.QuizService;
import com.example.demo.quiz.service.QuizServiceImpl;

import java.util.Scanner;

/**
 * packageName:  com.example.demo.quiz.controller
 * fileName     : Feb06Controller
 * author       : ahreum
 * date         : 2022-02-08
 * desc         :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-08      ahreum        최초 생성
 */
public class Feb06Controller {
    public void execute(Scanner scanner) {

        String[] arr = {"김아름", "유재혁", "장원종", "강민", "최건일",
                "스택", "해시", "Brute Force", "DP", "Bin",
                "큐", "sort", "DFS", "그래프",
                "힙", "BFS", "Greedy"};
        QuizService service = new QuizServiceImpl();

        while (true) {
            System.out.println("0: 종료 1: quiz1 2: quiz2 3: quiz3 4:quiz4 \t");
            Scanner cho = new Scanner(System.in);
            String s = "";
            switch (cho.next()) {
                case "0":
                    System.out.println("시스템 종료");
                    return;
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
                default:
                    s = "다시 입력해주세요.";

            }
            System.out.println(s);
        }
    }
}