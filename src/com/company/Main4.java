package com.company;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        String pattern="LFC_888";
        System.out.println("Введите пароль: ");
        Scanner scan = new Scanner(System.in);
        String name=scan.next();
        if(name.equals(pattern))
            System.out.println("true");
        else System.out.println("false");
        scan.close();
    }
}
