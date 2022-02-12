package com.example.demo.quiz.service;

import java.util.Random;
import java.util.Scanner;

/**
 * packageName:  com.example.demo.quiz.service
 * fileName     : Feb09ServiceImpl
 * author       : ahreum
 * date         : 2022-02-10
 * desc         :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-10      ahreum        최초 생성
 */
public class Feb09ServiceImpl implements Feb09Service{
    @Override
    public void sort1(Scanner scanner) {
        //bubbleSort
        System.out.println("#### 버블 정렬 ####");

        for(int i = 0; i < 10; i++){
            int num = (int)(Math.random()*100)+1;
            System.out.println("["+num+"]");
        }






        //insertionSort
        System.out.println("### 삽입 정렬 ###");






        // selectionSort
        System.out.println("### 선택 정렬 ###");
    }

    @Override
    public void sort2(Scanner scanner) {

    }

    @Override
    public void magicSquare(Scanner scanner) {

    }

    @Override
    public void zigzag(Scanner scanner) {

    }

    @Override
    public void print(Scanner scanner) {

    }
}
