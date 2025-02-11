package com.sumeyyessmn._2_week;

import java.util.Scanner;

public class Week2_Examples_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("LÜtfen pozitif bir sayı giriniz: ");
        int number = scanner.nextInt();
        //Validation
        // 1-) Kullanıcı pozitif bir sayı girmezse?
        // 2-) Kullanıcı harf girerse
        // 3-) Sıfır(Çift)
        if (number < 0){
            System.out.println("Negatif bir sayı girdiniz");
            //number = Math.abs(number);
            number = number * (-1);
        }
        if(number % 2 == 0){
            System.out.println(number +"sayı çift bir sayıdır");
        }else {
            System.out.println(number +"sayı tek bir sayıdır");
        }
        scanner.close();
    }
}
