package com.example.demo.algorithm.service;

/**
 * packageName:  com.example.demo.algorithm.service
 * fileName     : sortService
 * author       : ahreum
 * date         : 2022-02-08
 * desc         :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-08      ahreum        최초 생성
 */
public interface SortService {
    int[] kNum(int[] array, int[][] commands);
    String bigNum(int[] numbers);
    int hIndex(int[] citations);
}
