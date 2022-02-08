package com.example.demo.member.service;

import com.example.demo.member.domain.*;

/**
 * packageName:  com.example.demo.service
 * fileName     : StudentService
 * author       : ahreum
 * date         : 2022-02-07
 * desc         :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-07      ahreum        최초 생성
 */
public interface MemberService {
    String getBmi(BmiDTO bmi);
    String getCalc(CalcDTO calc);
    String getSearch(GoogleDTO google);
    String getGrade(GradeDTO grade);
    String getLogin(LoginDTO login);
}
