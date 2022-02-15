package com.example.demo.algorithmHome;

public class Rps {
    public static void main(String[] args) {
        System.out.println("###가위바위보 게임###\n 0.종료 1.가위 2.바위 3.보");

        String[] arr = {"가위", "바위", "보", "Draw", "Win", "Lose"};
        int[] arr2 = new int[2];
        for (int i = 0; i<arr2.length; i++) arr2[i] = (int)(Math.random()*3)+1;
        int p = arr2[0], c = arr2[1];
        //System.out.println("플레이어: %s %d\n", arr[p-1], p);
        //System.out.println("컴퓨터: %s %d\n", arr[c-1], c);
        int i = 3;

        String s = "Draw";

        //if(player != com) s = (player>com) ? "Win" : "Lose";
        System.out.println(s);
    }

}
