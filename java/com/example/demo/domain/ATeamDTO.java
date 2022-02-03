package com.example.demo.domain;

/**
 * packageName:  com.example.demo.domain
 * fileName     : ATeamDTO
 * author       : ahreum
 * date         : 2022-02-03
 * desc         :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-03      ahreum        최초 생성
 */
public class ATeamDTO {
    private String aTeamNames;
    private String aTeamSubjects;

    public String getaTeamNames(){
        return this.aTeamNames;
    }
    public void setATeamNames(String aTeamNames){
        this.aTeamNames = aTeamNames;
    }
    public String getaTeamSubjects(){
        return this.aTeamSubjects;
    }
    public void setaTeamSubjects(String aTeamSubjects){
        this.aTeamSubjects = aTeamSubjects;
    }


}
