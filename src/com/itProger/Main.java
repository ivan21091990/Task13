package com.itProger;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую строку: " );
        String str1 = scanner.nextLine();

        System.out.println("Введите вторую строку: ");
        String str2 = scanner.nextLine();

        if (str1.length() > str2.length()){
            System.out.println("Длина 1-ой строки больше длины 2-ой строки");
        }
        else if (str1.length() < str2.length()){
            System.out.println("Длина 1-ой строки меньше длины 2-ой строки");
        }
        else{
            System.out.println("Длина 1-ой строки равна длине 2-ой строки");
        }
    }

}
