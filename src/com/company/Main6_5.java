package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.max;
import static java.util.Collections.min;

public class Main6_5 {

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
        System.out.println();
        String number;
        List<Integer> result=new ArrayList<>();
        boolean a=false;
        System.out.print("Все трехзначные числа, в десятичной записи, которых нет одинаковых цифр: ");
        for (int i = 0; i < size; i++) {
            number =nums[i].toString();
            if(number.length()==3&& number.charAt(0)!= number.charAt(1)
            && number.charAt(1)!= number.charAt(2)
            && number.charAt(0)!= number.charAt(2)) {
                result.add(nums[i]);
            a=true;
            }
        }
        if(!a) System.out.println("таких чисел нет");
        System.out.println(result.size() > 0 ? result : " ");
        }
        }

