package com.example.demo.algorithm.controller;

import java.util.Scanner;

/**
 * packageName:  com.example.demo.algorithm.controller
 * fileName     : AlgorithmController
 * author       : ahreum
 * date         : 2022-02-08
 * desc         :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-02-08      ahreum        최초 생성
 */
public class AlgorithmController {
    public void execute(Scanner scanner){
        while (true){
            System.out.println("[담당] 0.종료 1.강민 2.최건일 3.유재혁 4.김아름 5.장원종");
            switch (scanner.next()){
                case "0":
                    System.out.println("Exit");return;
                case "1":
                    System.out.println("0.Exit 1.DPS 2.Graph");
                    switch (scanner.next()){
                        case "0":
                            System.out.println("Exit");return;
                        case "1":
                            System.out.println("DPS");
                            break;
                        case "2":
                            System.out.println("Graph");
                            switch (scanner.next()){
                                case "0":
                                    System.out.println("Exit");return;
                                case "1":
                                    System.out.println("0.Exit 1.Binary 2.Greedy");

                            }
                    }
            }
        }
    }
}
