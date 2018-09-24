package com.company;

import java.util.Scanner;

public class Main6_1 {

    public static void main(String[] args) {
        System.out.println("Введите кол-во чисел и нажмите <Enter>:");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        if(size ==0){
            System.out.println("Программа завершена");
            System.exit(0);
        }
        System.out.println("Введите ряд чисел через пробел: ");
        int [] nums =new  int[size];
        for (int i = 0; i < size; i++) {
            nums[i]=scan.nextInt();
        }
        System.out.println();
        System.out.print("Нечетные числа: ");
        for (int i = 0; i < size; i++) {
            if(nums[i]%2!=0) {
                System.out.print(nums[i]+" ");
            }
        }
        System.out.println();
        System.out.print("Четные числа: ");
        for (int i = 0; i < size; i++) {
            if(nums[i]%2==0) {
                System.out.print(nums[i]+" ");
            }
        }
    }
}
