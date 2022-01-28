package com.example.demo.service;

import com.example.demo.domain.BmiDTO;

/**
 * packageName:  com.example.demo.bmi
 * fileName     : BmiDemo
 * author       : ahreum
 * date         : 2022-01-25
 * desc         : bmi 측정 앱 실행 컨트롤러
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-01-25      ahreum        최초 생성
 */
public class BmiService {
    public String getBmi(BmiDTO bmi) {

            return String.format("%s 정상", bmi.getName());





    }

}
