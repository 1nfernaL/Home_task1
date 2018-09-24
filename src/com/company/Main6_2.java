package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import static java.util.Collections.*;

public class Main6_2 {

    public static void main(String[] args) {
        System.out.println("Введите кол-во чисел и нажмите <Enter>:");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        if(size ==0){
            System.out.println("Программа завершена");
            System.exit(0);
        }
        System.out.println("Введите ряд чисел через пробел: ");
        Integer [] nums =new  Integer[size];
        for (int i = 0; i < size; i++) {
            nums[i]=scan.nextInt();
        }
        List<Integer> numbers = Arrays.asList(nums);
        System.out.println();
        System.out.println("Наибольшее число: " + max(numbers));
        System.out.println("Наименьшее число: " + min(numbers));
        }
    }

