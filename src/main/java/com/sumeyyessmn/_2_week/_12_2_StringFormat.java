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
    /*
  ⚠️ Önemli Notlar
  ❌ Eclipse gibi IDE'lerde ANSI renkleri desteklenmez.
  ✅ Terminal, IntelliJ IDEA ve VS Code Terminal'de çalışır.
  ✅ Windows 10+ veya Linux/macOS’ta desteklenir.
  ✅ Windows'ta CMD yerine PowerShell veya Windows Terminal kullanmalısınız.
   */
    public static final String RESET = "\033[0m";  // Renk sıfırlama
    public static final String RED = "\033[31m";   // Kırmızı
    public static final String GREEN = "\033[32m"; // Yeşil
    public static final String YELLOW = "\033[33m";// Sarı
    public static final String BLUE = "\033[34m";  // Mavi
    public static final String PURPLE = "\033[35m";// Mor
    public static final String CYAN = "\033[36m";  // Açık Mavi
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
    //formatter3 (Best Practice) [String.format()]
    public static void formatter3(){
        String formatterString = String.format("Merhabalar Adınız: %s, T.C.: %d, Fiyat: %f","Sumeyye",343563,44.56);
        System.out.println(formatterString);
        System.out.println(YELLOW+formatterString+RESET);

    }
    //formatter4(printf)
    public static void formatter4(){
        String name = "Sumeyye";
        int tcNumber = 343563;
        double price = 44.56;
        System.out.printf("Merhabalar Adınız: %s, T.C.: %d, Fiyat: %f",name,tcNumber,price);
        System.out.println();
        System.out.printf("Merhabalar Adınız: %10s, T.C.: %d, Fiyat: %f",name,tcNumber,price);//%10s => sagdan 10 karakter genişliğinde
        System.out.println();
        System.out.printf("%-15s %-15d %3f",name,tcNumber,price);//%-15s => sola dogru yasla
        System.out.println();
    }

    public static void main(String[] args) {
        //formatter1();
        //formatter2();
        formatter3();
        //formatter4();
    }
    
}
