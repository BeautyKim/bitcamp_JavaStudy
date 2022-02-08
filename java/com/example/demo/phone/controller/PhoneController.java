package com.example.demo.phone.controller;

import com.example.demo.phone.service.PhoneService;
import com.example.demo.phone.service.PhoneServiceImpl;

import java.util.Scanner;

/**
 * packageName:  com.example.demo.controller
 * fileName     : PhoneController
 * author       : ahreum
 * date         : 2022-02-08
 * desc         :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-08      ahreum        최초 생성
 */
public class PhoneController {
    public void execute(Scanner scanner) {
        PhoneService service = new PhoneServiceImpl();

        while (true){
            System.out.println("0: 종료 \n1:집전화 \n2: 휴대폰 \n3: 아이폰 \n4: 갤럭시노트");
            switch (scanner.next()){
                case "0":
                    System.out.println("종료"); return;
                case "1":
                    System.out.println("집전화");
                    service.usePhone(scanner); break;
                case "2":
                    System.out.println("휴대폰");
                    service.useCelPhone(scanner);break;
                case "3":
                    System.out.println("아이폰");
                    service.useIPhone(scanner);break;
                case "4":
                    System.out.println("갤럭시노트");
                    service.useGalPhone(scanner);break;
                default:
                    System.out.println("다시입력");;break;

            }
        }
    }
}
