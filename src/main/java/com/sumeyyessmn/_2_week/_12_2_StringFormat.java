package com.sumeyyessmn._2_week;
//formatter
// s
// d
// f

/**
 * Garbarage Collectors:
 * Yalnızca ama yalnızca kapalı olmayan dosya, scanner, formatter vb.
 * yapılarda otomatik kapanmaz. Eğer biz bunu manuel olarak kapatmazsak
 * bu kapatılmayan nesneyi temizleyebilir ancak açık olan dosyayı
 * kapatmazsak cache belleği kullanmaya devam eder.
 */
import java.util.Formatter;

public class _12_2_StringFormat {
    //formatter1
    public static void formatter1(){
        //Eğer new formatter yazarsak close() ile manuel kapatmak zorundayız.
        Formatter formatter = new Formatter();
        formatter.format("Merhabalar Adınız: %s, T.C.: %d, Fiyat: %f","Sumeyye",343563,44.56);
        System.out.println(formatter);
        formatter.close(); //Belleği serbest bırakmak için

    }
    //formatter2 (Best Practice)
    public static void formatter2(){
        //Eğer String.format yazarsak kapatmak zorunda değiliz GC(Garbage Collector) otomatik çalışır
        String formatterString = String.format("Merhabalar Adınız: %s, T.C.: %d, Fiyat: %f","Sumeyye",343563,44.56);
        System.out.println(formatterString);
    }
    //formatter3 (Best Practice)
    public static void formatter3(){

    }
    //formatter4
    public static void formatter4(){
        System.out.printf("Merhabalar Adınız: %s, T.C.: %d, Fiyat: %f","Sumeyye",343563,44.56);
    }

    public static void main(String[] args) {
        //formatter1();
        //formatter2();
        formatter3();
        //formatter4();
    }
    
}
