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

        String name = scanner.next();
        int kor = scanner.nextInt();
        int eng = scanner.nextInt();
        int math = scanner.nextInt();

        String grade = gradeApp.getGrade(name, kor, eng, math);
        System.out.println(grade);
    }
}