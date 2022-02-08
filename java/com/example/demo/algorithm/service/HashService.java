package com.example.demo.algorithm.service;

/**
 * packageName:  com.example.demo.algorithm.service
 * fileName     : HashService
 * author       : ahreum
 * date         : 2022-02-08
 * desc         :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-08      ahreum        최초 생성
 */
public interface HashService {
    String retire(String[] participant, String[] completion);
    boolean phoneNum(String[] phone_book);
    int cover(String[][] clothes);
    int[] album(String[] genres, int[] plays);
    }
