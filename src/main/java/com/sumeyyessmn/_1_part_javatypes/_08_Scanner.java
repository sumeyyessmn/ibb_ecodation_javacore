package com.sumeyyessmn._1_part_javatypes;

import java.util.Scanner;

public class _08_Scanner {
    public static void main(String[] args) {
        //Field
        String name, surname;
        int language;
        //kullanıcıdan veri almak istiyorsak
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen adınızı giriniz: ");
        name = scanner.nextLine();
        System.out.println("Lütfen soyadınızı giriniz: ");
        surname = scanner.next();
        System.out.println("Bildiğiniz dil sayısı: ");
        language = scanner.nextInt();

        System.out.println("Adınız: "+name+" Soyadınız: "+surname+"\nBildiğiniz dil sayısı: "+language);
        //kullanmadığım scanner nesnesini kapatıyorum
        scanner.close();


    }
}
