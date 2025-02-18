package com.sumeyyessmn._2_week;

import com.sumeyyessmn.utils.SpecialColor;

import java.util.Scanner;

public class Week2_Examples_2 {
/*
   Kullanıcıdan Girilen Sayının Faktoriyelini Bulma
   Soru:
   Kullanıcıdan bir tam sayı alarak faktöriyelini hesaplayan iterative ve recursive metota göre  programı yazınız.
   Validation-1:Kullanıcı Sıfırdan küçük bir sayı verene kadar hesaplama yapsın ?
   Validation-2: Kullanıcı Sıfırdan küçük sayı verirse döngü dursun(break)
   Validation-3: Kullanıcı eğer virgüllü sayı verirse, kullanıcıya tekrardan sayı girilmesi beklensin, Eğer kullanıcı 3 kere virgülü sayı girerse kullanıcın hakkı kalmadığından sistemden atsın(System.exit(0)).
   Çözüm:
*/

    public class Week2_Examples_3 {

        public static void main(String[] args) {

            // Iterative
            // Variables
            // result:1 vermeliyiz ki, 1 sayısı çarpmada etkisizdir ve başlangıç değerimizdir.
            long number, result = 1;
            byte doubleRemainingRight = 3;

            // Scanner
            Scanner scanner = new Scanner(System.in);

            // Sonsuz Döngü
            while (true) {
                System.out.println("\nLütfen pozitif bir sayı giriniz");

                // Kullanıcıdan ondalıklı sayı girip girmediğini kontrol edelim
                if (scanner.hasNextInt()) {
                    number = scanner.nextLong();
                    if (number < 0) {
                        System.out.println(SpecialColor.RED + "Sıfırdan küçük bir sayı girdiniz sistem kapatılıyor" + SpecialColor.RESET);
                        //number = Math.abs(number);
                        break;             // 1.YOL(Yalnızca bulunduğu döngü veya switch bloğu etkiliyor)
                        //System.exit(0); // 2.YOL (JVM'yi kapatarak programı tamamem sonlandırıyor.)
                    } else if (number == 0) {
                        System.out.println(number + SpecialColor.BLUE + " sayısının faktöriyeli= 1");
                        result = 1;
                    } else {
                        result = 1;
                        for (int i = 1; i <= number; i++) {
                            //result=result*i;
                            result *= i;
                        }
                        System.out.println(number + SpecialColor.YELLOW + " sayısının " + number + "!=" + result + SpecialColor.RESET);
                    }
                } else if (scanner.hasNextDouble()) {
                    System.out.println(SpecialColor.RED + "Ondalıklı bir sayı girdiniz" + SpecialColor.RESET);
                    break;
                } else {
                    System.out.println(SpecialColor.RED + "Harf girdiniz." + SpecialColor.RESET);
                    break;
                } //end harf
            } //end while
        }
    }
}
