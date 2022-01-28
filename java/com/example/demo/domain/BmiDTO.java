package com.example.demo.domain;

/**
 * packageName:  com.example.demo.bmi
 * fileName     : BmiApp
 * author       : ahreum
 * date         : 2022-01-25
 * desc         : bmi 측정 화면 출력 앱
 * 클래스 변수    : "BMI 지수"
 * 파리미터, 인스턴스변수 : String name, String height, String weight
 * 로컬변수 :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-01-25      ahreum        최초 생성
 */
public class BmiDTO {
    public static String BMI = "BMI 지수";
    private String name;
    private String height;
    private String weight;


    public  String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public  String getHeight(){

        return this.height;
    }
    public void setHeight(String height){
        this.height = height;
    }
    public String getWeight(){
        return this.weight;
    }
    public void setWeight(String weight){
        this.weight = weight;
    }


    }
