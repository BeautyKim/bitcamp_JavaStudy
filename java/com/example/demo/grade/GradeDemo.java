package com.example.demo.grade;

import java.util.Scanner;

/**
 * packageName:  com.example.demo.grade
 * fileName     : GradeDemo
 * author       : ahreum
 * date         : 2022-01-26
 * desc         : 서
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-01-26      ahreum        최초 생성
 */
public class GradeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeApp gradeApp = new GradeApp();

        for(int i=1; i<=2; i++){
            System.out.println(i+"번 학생 \n 이름: ");
            String name = scanner.next();
            System.out.println("국어: ");
            int kor = scanner.nextInt();
            System.out.println("영어: ");
            int eng = scanner.nextInt();
            System.out.println("수학: ");
            int math = scanner.nextInt();

            String grade = gradeApp.getGrade(name, kor, eng, math);
            System.out.println(grade);
        }
    }
}
