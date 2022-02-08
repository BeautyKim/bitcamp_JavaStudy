package com.example.demo.algorithm.service;

/**
 * packageName:  com.example.demo.algorithm.service
 * fileName     : GreedyService
 * author       : ahreum
 * date         : 2022-02-08
 * desc         :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-08      ahreum        최초 생성
 */
public interface GreedyService {
    int clothes(int n, int[] lost, int[] reserve);
    int joyStick(String name);
    String bigNum(String number, int k);
    int lifeBoat(int[] people, int limit);
    int connection(int n, int[][] costs);
    int camera(int[][] routes);
}
