package com.company;

import java.util.Scanner;

public class Main6_4 {

    public static void main(String[] args) {
        System.out.println("Введите кол-во чисел и нажмите <Enter>:");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        if(size ==0){
            System.out.println("Программа завершена");
            System.exit(0);
        }
        System.out.println("Введите ряд целых чисел, которые делятся на 5 и на 7: ");
        Integer [] nums =new  Integer[size];
        for (int i = 0; i < size; i++) {
            nums[i]=scan.nextInt();
        }
        System.out.println();
        boolean a=false;
        System.out.print("Числа: ");
        for (int i = 0; i < size; i++) {
            if((nums[i]%5==0)&&(nums[i]%7==0)) {
                System.out.print(nums[i]+" ");
                a=true;
            }
        }
        if(!a) System.out.println("таких чисел нет");
        }
    }

