package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.max;
import static java.util.Collections.min;

public class Main6_3 {

    public static void main(String[] args) {
        System.out.println("Введите кол-во чисел и нажмите <Enter>:");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        if(size ==0){
            System.out.println("Программа завершена");
            System.exit(0);
        }
        System.out.println("Введите ряд целых чисел, которые делятся на 3 или на 9: ");
        Integer [] nums =new  Integer[size];
        for (int i = 0; i < size; i++) {
            nums[i]=scan.nextInt();
        }
        System.out.println();
        boolean a=false;
        System.out.print("Числа: ");
        for (int i = 0; i < size; i++) {
            if((nums[i]%3==0)||(nums[i]%9==0)) {
                System.out.print(nums[i]+" ");
                a=true;
            }
        }
        if(!a) System.out.println("таких чисел нет");
        }
    }

