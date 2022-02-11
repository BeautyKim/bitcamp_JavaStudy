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
        int bubbleSort;
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());

        for(int i = 0; i <= 10; i++){
            int num = (random.nextInt(100)+1);
        }





        //insertionSort






        // selectionSort
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
