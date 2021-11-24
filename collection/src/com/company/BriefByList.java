package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BriefByList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n , max;
        n = sc.nextInt();
        max = sc.nextInt();

        // generate combination number
        List<Integer> arr = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++) {
            arr.add(1 + (int)(Math.random() * max)) ;
        }

        String correct_pos_ans = "O";
        String correct_ans = "#";

        arr.forEach(x->System.out.print(x));
        System.out.println("");
        boolean over = false;
        int y = 0;
        while (y < 10){
            List<Integer> guess = new ArrayList<>(n);
            List<String> result = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                guess.add(sc.nextInt());
            }

            for (int i = 0; i < n; i++) {
                if (arr.get(i).equals(guess.get(i))){
                    result.add(correct_pos_ans);
                } else if (arr.contains(guess.get(i))){
                    result.add(correct_ans);
                }
            }
            result.forEach(x->System.out.println(x));
        }

    }
}
