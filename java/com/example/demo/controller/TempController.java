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
        System.out.println("학생수 입력");
        int count = scanner.nextInt();
        GradeDTO[] grades = new GradeDTO[count];


        for (int i = 0; i < grades.length; i++){
            System.out.println("이름, 국어, 영어, 수학 점수입력");
            grades[i] = new GradeDTO();
            grades[i].setName(scanner.next());
            grades[i].setMath(scanner.nextInt());
            grades[i].setKor(scanner.nextInt());
            grades[i].setEng(scanner.nextInt());
            System.out.println("---------------------------------");
        }
        for(int i = 0; i<grades.length; i++){
            System.out.println("학생이름 "+grades[i].getName()+"\n수학점수 "+grades[i].getMath()+"\n영어점수 "+grades[i].getEng()+"\n국어점수 "+grades[i].getKor()+"\n--------------------------");
        }

    }
}
