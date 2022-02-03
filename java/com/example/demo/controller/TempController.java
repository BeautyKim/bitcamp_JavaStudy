package com.example.demo.controller;

import com.example.demo.domain.GradeDTO;

import java.util.Scanner;

/**
 * packageName:  com.example.demo.controller
 * fileName     : TempController
 * author       : ahreum
 * date         : 2022-02-03
 * desc         :
 * ATemd        :
 *     김아름 : 스택, 큐, 힙
 *     유재혁 : 해시, sort
 *     장원종 : Brute Force, DFS, BFS
 *     강민 : DP, 그래프
 *     최건일 : Bin, Greedy
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-03      ahreum        최초 생성
 */
public class TempController {
    public static void main(String[] args) {
        String[] arr = {"김아름", "유재혁", "장원종",     "강민", "최건일",
                          "스택", "해시", "Brute Force",  "DP",   "Bin",
                          "큐",  "sort", "DFC",         "그래프", "",
                          "힙",   "",    "BFS",          "",   "Greedy"};

        for (int i=0; i < 5; i++){
            System.out.println(arr[i]+": "+arr[i + 5]+", "+arr[i + 10]+ ", "+arr[i+15]);

        }



    }
}
