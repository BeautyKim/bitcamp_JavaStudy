package com.example.demo.quiz.service;

import java.util.Random;
import java.util.Scanner;

/**
 * packageName:  com.example.demo.quiz.service
 * fileName     : Feb09ServiceImpl
 * author       : ahreum
 * date         : 2022-02-10
 * desc         : 버블정렬 주석 작성
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-10      ahreum        최초 생성
 */
public class Feb09ServiceImpl implements Feb09Service {
    @Override
    public void bubbleSort() {
/**
 * author       : 김아름
 * desc         : 버블정렬
 * int 타입의 arr 변수 선언, arr 는 10개의 인덱스 값을 가지고 있음
 * Math 클래스로 1~100의 정수를 구하고 arr[]변수에 넣어 랜덤으로 10개의 숫자를 구함
 *                              Math 클래스는 int로 형변환 했기 때문에 1~100까지 숫자를 구하기 위해 +1
 *
 * int j 선언 -> 정렬 회전수
 * int k 선언 -> 앞의 수와 비교하기 위한 값
 *
 * 앞의 수가 뒤의 수보다 크다면 자리를 바꿔준다
 * temp -> 바꾸기 위한 변수
 * */

        int[] arr = new int[10];
        System.out.println("정렬전: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
            System.out.println("[" + arr[i] + "]");
        }

        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < arr.length - j - 1; k++) {
                if (arr[k] > arr[k + 1]) {
                    int temp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = temp;
                }
            }
        }
        System.out.println("정렬후: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.println("[" + arr[j] + "]");
        }
    }

    @Override
    public void insertionSort() {
/**
 * author       : 김아름
 * desc         : 삽입정렬
 *
 *
 * */
        int[] arr = new int[10];

        System.out.println("정렬전: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
            System.out.println("[" + arr[i] + "]");
        }

        for (int j = 1; j < arr.length - 1; j++) {
            int insert = j;
            int temp = arr[j];
            while ((insert > 0) && (arr[insert - 1] > temp)) {
                arr[insert] = arr[insert - 1];
                insert--;
            }
            arr[insert] = temp;
        }
        System.out.println("정렬후: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.println("[" + arr[j] + "]");
        }
    }


    @Override
    public void selectionSort() {
/**
 * author       : 김아름
 * desc         : 선택정렬
 *
 *
 * */
        int[] arr = new int[10];

        System.out.println("정렬전: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
            System.out.println("[" + arr[i] + "]");
        }

        for (int j = 0; j < arr.length - 1; j++) {
            for (int k = j+1; k <arr.length; k++){
                if (arr[j]>arr[k]){
                    int temp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = temp;
                }

            }
        }

        System.out.println("정렬후: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.println("[" + arr[j] + "]");

        }
    }


    @Override
    public void quickSort() {

    }

    @Override
    public void mergeSort() {

    }

    @Override
    public void magicSquare() {

    }

    @Override
    public void zigzag() {

    }

    @Override
    public void rectangleStarPrint() {

    }

    @Override
    public void triangleStarPrint() {

    }
}
