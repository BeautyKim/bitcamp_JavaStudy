package com.example.demo.quiz.controller;

import com.example.demo.quiz.service.Feb09Service;
import com.example.demo.quiz.service.Feb09ServiceImpl;

import java.util.Scanner;

/**
 * packageName:  com.example.demo.quiz.controller
 * fileName     : Feb09Controller
 * author       : ahreum
 * date         : 2022-02-08
 * desc         :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-08      ahreum        최초 생성
 */
public class Feb09Controller {
    public void execute(Scanner scanner){
        Feb09Service service = new Feb09ServiceImpl();

        while (true){
            System.out.println("0. 종료 \n" +
                    "1. bubbleSort, insertionSort, selectionSort\n"+
                    "2. quickSort, mergeSort\n"+
                    "3. magicSquare\n"+
                    "4. zigzag\n"+
                    "5. rectangleStarPrint, triangleStarPrint");
            switch (scanner.next()){
                case "0":
                    System.out.println("종료");return;
                case "1":
                    service.sort1("bubbleSort, insertionSort, selectionSort");break;
                case "2":
                    service.sort2("quickSort, mergeSort");break;
                case "3":
                    service.sort3("magicSquare");break;
                case "4":
                    service.sort3("zigzag");break;
                case "5":
                    service.sort5("rectangleStarPrint, triangleStarPrint");break;


            }
        }


    }
}
