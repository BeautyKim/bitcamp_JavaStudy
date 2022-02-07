package com.example.demo.service;

/**
 * packageName:  com.example.demo.service
 * fileName     : QuizService
 * author       : ahreum
 * date         : 2022-02-07
 * desc         :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-07      ahreum        최초 생성
 */
public class QuizServiceImpl implements QuizService{
    @Override
    public void quiz1(String[] arr) {
        System.out.println(" Q1. 팀별 과제를 출력하세요 ");
        String s = "";
        for(int i = 0; i < arr.length; i++){
            if(i%5==0){
                s += "\n";
            }
            s += arr[i]+"\t";
        }

        System.out.println(s+"\n");

    }

    @Override
    public void quiz2(String[] arr) {
        System.out.println("Q2. 팀장이 맡은 과제만 출력하세요 ");
        String zzang = "";
        String name = "강민";
        for(int i = 0; i < arr.length; i++){

            if(arr[i].equals(name)){
                for(int j= 0; j<3; j++){
                    zzang += arr[i+j*5]+"," ;
                }
                if(i==17){break;}
            }
        }
        System.out.println(zzang+"\n");

    }

    @Override
    public void quiz3(String[] arr) {
        System.out.println("Q3. 큐를 담당한 사람을 출력하세요 ");
        String s;
        s = "";
        String q = "큐";
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(q)){
                s += arr[i] +"를 담당한 사람: " + arr[i%5];
            }
        }
        System.out.println(s+"\n");

    }

    @Override
    public void quiz4(String[] arr) {
        System.out.println("Q4. 팀원별 과제 수를 출력하세요 ");

        int[] intArr = new int[5];
        int[] resArr = new int[5];

        for(int i=5; i<arr.length; i++){
            int a = i % 5;
            for(int j = 0; j < 5; j++){
                if (a == j){
                    intArr[j]++;
                }
                resArr = intArr;
            }
        }
        for (int i = 0; i<5; i++){
            System.out.println(arr[i]+"의 과제 수 ("+intArr[i]+"),");
        }

    }
}
