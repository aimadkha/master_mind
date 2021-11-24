package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of combination : ");
        int n = sc.nextInt();
        System.out.println("enter the max value of combination : ");
        int m = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            arr.add(1 + (int)(Math.random() * m)) ;
        }

        String correct_pos_ans = "O";
        String correct_ans = "#";

        for (int x : arr) {
            System.out.print(x);
        }

        System.out.println("");

        for (int i = 0; i < 3; i++) {
            ArrayList<String> result = new ArrayList<>();
            ArrayList<Integer> guess = new ArrayList<>(n);
            System.out.println(i+1 +" tentative : ");
            for (int j = 0; j < n ; j++) {
                    int z = sc.nextInt();
                    guess.add(z);
            }
            for (int j = 0; j < n; j++) {
                if (arr.get(j).equals(guess.get(j))) {
                    result.add(correct_pos_ans);
                }
                else if (arr.contains(guess.get(j))){
                    result.add(correct_ans);
                }
            }

            for (Integer integer : guess) {
                System.out.print(integer);
            }
            System.out.println("");
            for (String s : result) {
                System.out.print(s);
            }
            System.out.println("");
        }
    }
}
