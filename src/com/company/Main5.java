package com.company;

public class Main5 {

    public static void main(String[] args) {
        int sum=0;
        int mltpl=1;
        for (int i =0 ; i < args.length ; i++) {
            sum += Integer.parseInt(args[i]);
            mltpl *=Integer.parseInt(args[i]);
        }
        System.out.println("Сумма массива = " + sum);
        System.out.println("Произведение массива = " + mltpl);
    }
}
