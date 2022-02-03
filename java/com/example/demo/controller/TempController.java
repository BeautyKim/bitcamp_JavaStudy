package com.example.demo.controller;

import com.example.demo.domain.GradeDTO;

import java.util.Scanner;

/**
 * packageName:  com.example.demo.controller
 * fileName     : TempController
 * author       : ahreum
 * date         : 2022-02-03
 * desc         :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-03      ahreum        최초 생성
 */
public class TempController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        System.out.println("학생수는 몇 명?");
        int count = scanner.nextInt();
        GradeDTO[] grades = new GradeDTO[count];
        for (int i = 0; i< grades.length; i++){
            System.out.println("수학점수 입력");
            grades[i] = new GradeDTO();
            grades[i].setMath(scanner.nextInt());
        }
        for (int i = 0; i< grades.length; i++){
            System.out.println("수학점수 : "+grades[i].getMath());
        }







    }
}
