package com.sumeyyessmn._1_part_javatypes;

import java.util.Scanner;

public class Week1_examples_1 {
    public static void main(String[] args) {
        //1.Dereceden 1 bilinmeyenli denklemi çözme
        //Soru: Kullanıcıdan ax+b=0 denklemindeki a ve b değerlerini alıp x'i hesaplayan
        //programı yazınız

        //variable
        double aValue,bValue,result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen a değerini giriniz: ");
        aValue = scanner.nextDouble();
        System.out.println("Lütfen b değerini giriniz: ");
        bValue = scanner.nextDouble();

        //ax+b=0 x=-b/a
        result = (-bValue/aValue);
        System.out.println("a degeri: "+aValue+"\nb degeri: "+bValue+"\nSonuç: "+result);
        scanner.close();

    }
}
