package com.example.demo.oop.domain;

/**
 * packageName:  com.example.demo.phone.domain
 * fileName     : IPhone
 * author       : ahreum
 * date         : 2022-02-09
 * desc         :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-09      ahreum        최초 생성
 */
public class IPhone extends CelPhone{
    public final static String KIND = "아이폰";
    protected String search;

    public IPhone(String company){
        super(KIND,company);
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    @Override
    public String toString() {
        return String.format("%s이 만든 %s을 사용해서 %s중에 %s를 검색한다 ", super.getCompany(), KIND, super.getMove(), search);
    }
}
