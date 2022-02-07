package com.example.demo.controller;

import com.example.demo.domain.BmiDTO;
import com.example.demo.service.*;
import com.example.demo.domain.CalcDTO;
import com.example.demo.domain.GoogleDTO;
import com.example.demo.domain.GradeDTO;
import com.example.demo.domain.LoginDTO;

import java.util.Scanner;

/**
 * packageName:  com.example.demo.controller
 * fileName     : DemoController
 * author       : ahreum
 * date         : 2022-01-27
 * desc         :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-01-27      ahreum        최초 생성
 */
public class StudentController {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        CalcDTO calc = new CalcDTO();
        BmiDTO bmi = new BmiDTO();
        GoogleDTO google = new GoogleDTO();
        GradeDTO grade = new GradeDTO();
        LoginDTO login = new LoginDTO();
        StudentService service = new StudentServiceImpl();
        while (true){
            System.out.println("메뉴 선택");
            String menu = "0.Exit 1.BMI 2.CALC 3.SEARCH 4.GRADE 5.LOGIN";
            System.out.println(menu);
            String select = scanner.next();
            String res ="";

            switch (select){
                case "0":
                    System.out.println("Exit"); return;
                case "1":
                    System.out.println(BmiDTO.BMI+"\n이름, 키, 몸무게");
                    bmi.setName(scanner.next());
                    bmi.setTall(scanner.nextInt());
                    bmi.setWeight(scanner.nextInt());
                    res = service.getBmi(bmi);
                break;
                case "2":
                    System.out.println(CalcDTO.CALC_TITLE+"\n숫자1, 연산자, 숫자2 입력");
                    calc.setNum1(scanner.nextInt());
                    calc.setOpcode(scanner.next());
                    calc.setNum2(scanner.nextInt());
                    res = service.getCalc(calc);
                    break;
                case "3":
                    System.out.println(GoogleDTO.GOOGLE_TITLE +"\n검색");
                    google.setSearch(scanner.next());
                    res = service.getSearch(google);
                    break;
                case "4":
                    System.out.println(GradeDTO.GRADE_TITLE +"\n이름, 국어, 영어, 수학");
                    grade.setName(scanner.next());
                    grade.setKor(scanner.nextInt());
                    grade.setEng(scanner.nextInt());
                    grade.setMath(scanner.nextInt());
                    res = service.getGrade(grade);
                    break;
                case "5":
                    System.out.println(LoginDTO.LOGIN_APP +"\n이름, 아이디, 비번");
                    login.setId(scanner.next());
                    login.setPw(scanner.next());
                    login.setName(scanner.next());
                    res = service.getLogin(login);
                    break;
                default: res = "다시 입력해주세요.";
        }
            System.out.println(res);


        }

    }
}