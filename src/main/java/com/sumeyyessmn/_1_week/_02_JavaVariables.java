package com.sumeyyessmn._1_week;

public class _02_JavaVariables {
    /** Veri Değiken isimlerini yazarken;
            veri isimlendirmeleri;
            1-) isim, sıfat, zamir kullanmamiz lazim
            2-) _ veya $ ile başlayabilirsin
            3-) sayı ile bitebilir
            4-) _ veya $ dışında özel simgelerle başlanmaz
            5-) sayı ile başlanmaz
            6-) camel case kuralına göre yazılır
    */
    public static void main(String[] args) {
        int schoolNumber = 35;
        System.out.println(schoolNumber);
        schoolNumber = 57;
        System.out.println(schoolNumber);
        int _schoolNumber = 59; //aynı isimle başlanamaz
        System.out.println(_schoolNumber);
        int $schoolNumber = 68;
        System.out.println($schoolNumber);
        //int 44schoolNumber =45; sayı ile başlayamazsin

        //SABİT
        final int MAX_STUDENTS = 100;
    }

}
