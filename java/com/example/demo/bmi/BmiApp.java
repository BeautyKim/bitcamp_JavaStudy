package com.example.demo.bmi;

/**
 * packageName:  com.example.demo.bmi
 * fileName     : BmiApp
 * author       : ahreum
 * date         : 2022-01-25
 * desc         : bmi 측정 화면 출력 앱
 * 클래스 변수    : "BMI 지수"
 * 파리미터, 인스턴스변수 : int height, int weight
 * 로컬변수 :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-01-25      ahreum        최초 생성
 */
public class BmiApp {
    public static String BMI = "BMI 지수";
    private String name;
    private String height;
    private String weight;

    public String getBMI(String name, String height, String weight){
        this.name = name;
        this.height = height;
        this.weight = weight;

        String res = String.format("%s 정상", name);
        return res;


    }
}
