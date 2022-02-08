package com.example.demo.algorithm.service;

/**
 * packageName:  com.example.demo.algorithm.service
 * fileName     : GraphService
 * author       : ahreum
 * date         : 2022-02-08
 * desc         :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-08      ahreum        최초 생성
 */
public interface GraphService {
    int farNode(int n, int[][] edge);
    int rank(int n, int[][] results);
    int numRoom(int[] arrows);
}
