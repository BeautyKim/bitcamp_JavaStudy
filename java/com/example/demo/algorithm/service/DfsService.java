package com.example.demo.algorithm.service;

/**
 * packageName:  com.example.demo.algorithm.service
 * fileName     : DFSService
 * author       : ahreum
 * date         : 2022-02-08
 * desc         :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-08      ahreum        최초 생성
 */
public interface DfsService {
    int tarnum(int[] numbers, int target);
    String[] tripway(String[][] tickets);
}
