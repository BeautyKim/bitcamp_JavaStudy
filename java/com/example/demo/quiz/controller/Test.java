package com.example.demo.quiz.controller;

import com.example.demo.oop.controller.OopController;
import com.example.demo.oop.domain.CelPhone;
import com.example.demo.oop.domain.GalPhone;
import com.example.demo.oop.domain.IPhone;
import com.example.demo.oop.domain.Phone;
import com.example.demo.oop.service.PhoneService;
import com.example.demo.oop.service.PhoneServiceImpl;

import java.util.Scanner;

/**
 * packageName:  com.example.demo.phone.repository
 * fileName     : Test
 * author       : ahreum
 * date         : 2022-02-09
 * desc         :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-09      ahreum        최초 생성
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("테스트");
        QuizController quizController = new QuizController();
        quizController.execute(scanner);
    }
}

