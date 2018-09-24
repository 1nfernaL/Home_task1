package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите ваше имя и нажмите <Enter>:");
        Scanner scan = new Scanner(System.in);
        String name=scan.next();
        System.out.println("Привет, " + name+"!");
        scan.close();
    }
}
