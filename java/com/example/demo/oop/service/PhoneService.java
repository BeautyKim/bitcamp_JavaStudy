package com.example.demo.oop.service;

import com.example.demo.oop.domain.CelPhone;
import com.example.demo.oop.domain.GalPhone;
import com.example.demo.oop.domain.IPhone;
import com.example.demo.oop.domain.Phone;

/**
 * packageName:  com.example.demo.oop.service
 * fileName     : PhoneService
 * author       : ahreum
 * date         : 2022-02-09
 * desc         :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-09      ahreum        최초 생성
 */
public interface PhoneService {
    void usePhone(Phone phone);
    void useCelPhone(CelPhone celPhone);
    void useIPhone(IPhone iPhone);
    void useGalPhone(GalPhone galPhone);
}
