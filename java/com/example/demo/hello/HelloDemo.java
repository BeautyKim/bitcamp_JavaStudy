package com.example.demo.hello;

import com.example.demo.quiz.controller.QuizController;

import java.util.Scanner;

/**
 * packageName:  com.example.demo.hello
 * fileName     : HelloDemo
 * author       : ahreum
 * date         : 2022-02-14
 * desc         :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-14      ahreum        최초 생성
 */
public class HelloDemo {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("테스트");
                QuizController quizController = new QuizController();
                quizController.execute(scanner);
            }

        }
