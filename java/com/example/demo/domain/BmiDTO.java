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
    private double tall;
    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTall() {
        return tall;
    }

    public void setTall(double tall) {
        this.tall = tall;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
