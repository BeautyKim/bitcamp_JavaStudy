package com.example.demo.algorithm.service;

/**
 * packageName:  com.example.demo.algorithm.service
 * fileName     : DPSService
 * author       : ahreum
 * date         : 2022-02-08
 * desc         :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-08      ahreum        최초 생성
 */
public interface DpsService {
    int showN(int N, int number);                // N 으로 표현
    int intTri(int[][] triangle);                // 정수 삼각형
    int goSchool(int m, int n, int[][] puddles); // 등교길
    int thief(int[] money);                     // 도둑질
}
