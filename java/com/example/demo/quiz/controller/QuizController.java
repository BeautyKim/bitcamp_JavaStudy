package com.example.demo.quiz.controller;

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
    public void execute(Scanner scanner) {
        Feb06Controller feb06Controller = new Feb06Controller();
        Feb07Controller feb07Controller = new Feb07Controller();
        Feb08Controller feb08Controller = new Feb08Controller();
        Feb09Controller feb09Controller = new Feb09Controller();

        while (true){
            System.out.println("0)Exit 1)2월6일 2)2월7일 3)2월8일 ");
            switch (scanner.next()){
                case "0":
                    System.out.println(("### Exit ###"));
                    return;
                case "1": feb06Controller.execute(scanner);break;
                case "2": feb07Controller.execute(scanner);break;
                case "3": feb08Controller.execute(scanner);break;
                case "4": feb09Controller.execute(scanner);break;
                default:
                    System.out.println("Wrong Number");break;

            }
        }



    }


}
