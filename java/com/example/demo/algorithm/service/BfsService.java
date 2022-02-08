package com.example.demo.algorithm.service;

import java.util.Scanner;

/**
 * packageName:  com.example.demo.algorithm.service
 * fileName     : BfsService
 * author       : ahreum
 * date         : 2022-02-08
 * desc         :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-08      ahreum        최초 생성
 */
public interface BfsService {
    int net(int n, int[][] computers);
    int changeword(String begin, String target, String[] words);
}
