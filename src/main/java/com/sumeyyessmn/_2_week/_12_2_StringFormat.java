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
        Formatter formatter = new Formatter();
        formatter.format("Merhabalar Adınız: %s, T.C.: %d, Fiyat: %f","Sumeyye",343563,44.56);
        System.out.println(formatter);
        formatter.close(); //Belleği serbest bırakmak için

    }
    //formatter2 (Best Practice)
    public static void formatter2(){
        //Formatter formatter = new Formatter();
        String formatterString = String.format("Merhabalar Adınız: %s, T.C.: %d, Fiyat: %f","Sumeyye",343563,44.56);
        System.out.println(formatterString);
    }

    public static void main(String[] args) {
        //formatter1();
        formatter2();
    }
    
}
