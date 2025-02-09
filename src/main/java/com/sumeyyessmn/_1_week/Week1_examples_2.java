package com.sumeyyessmn._1_week;

import java.util.Scanner;

public class Week1_examples_2 {
    public static void main(String[] args) {
        /*
        2. Santigrat (Celsius) - Fahrenheit Dönüştürücü (Scanner kullanlalım)
       Soru:
       Kullanıcıdan Santigrat (Celsius) cinsinden sıcaklık alıp Fahrenheit'e çeviren programı yazınız.
       Formül: F = (C * 9/5) + 32
       Çözüm:
        */
        double fahrenheitValue,celsiusValue;
        //scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Santigrat(Celsius) cinsinden sıcaklık değeri giriniz: ");
        celsiusValue = scanner.nextDouble();
        fahrenheitValue = (celsiusValue * 9)/5+32;
        System.out.println("Celsius değeri: "+celsiusValue+"\nFahrenheit değeri: "+fahrenheitValue);
    }
}
