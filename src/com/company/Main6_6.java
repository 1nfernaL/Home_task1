package com.company;

import java.util.*;

public class Main6_6 {

    public static void main(String[] args) {
        System.out.println("Введите кол-во чисел и нажмите <Enter>:");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        if(size ==0){
            System.out.println("Программа завершена");
            System.exit(0);
        }
        System.out.println("Введите ряд чисел через пробел: ");
        List<String> nums = new ArrayList<>() ;
        for (int i = 0; i < size; i++) {
            nums.add(scan.next());
        }
        System.out.println();
        List<String> result=new ArrayList<>();
        boolean a=false;
        System.out.print("Счастливые числа: ");
        for (String number: nums) {
            if(number.length()==4&&  number.charAt(0) + number.charAt(1) == number.charAt(2)
                    + number.charAt(3)) {
                result.add(number);
                a=true;
            }
        }
        if(!a) System.out.println("таких чисел нет");
        System.out.println(result.size() > 0 ? result : " ");
        }
        }

