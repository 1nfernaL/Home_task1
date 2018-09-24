package com.company;

import java.util.Random;

public class Main3 {

    public static void main(String[] args) {
        int nums = Integer.parseInt(args[0]);
        Random r = new Random();
        for (int i = 0; i <nums; i++) {
            System.out.println(r.nextInt(100));
        }
        for (int i = 0; i <nums; i++) {
            System.out.print(r.nextInt(100)+" ");
        }
    }
}
