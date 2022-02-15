package com.example.demo.algorithmHome;

public class Rps2 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 6 + 1);
        int b = (int) (Math.random() * 6 + 1);
        System.out.println("플레이어: "+a+"컴퓨터: "+b);
        System.out.println((a == b) ? "Draw" : (b > (a+1)%3) ? "Win" : "lose");
    }
}
