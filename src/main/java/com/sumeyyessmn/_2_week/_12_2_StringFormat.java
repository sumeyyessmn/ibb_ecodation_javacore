package com.sumeyyessmn._2_week;
//formatter
// s
// d
// f

import java.util.Formatter;

public class _12_2_StringFormat {
    //formatter1
    public static void formatter1(){
        Formatter formatter = new Formatter();
        formatter.format("Merhabalar Adınız: %s, T.C.: %d, Fiyat: %f","Sumeyye",343563,44.56);
        System.out.println(formatter);
        formatter.close(); //Belleği serbest bırakmak için
    }

    public static void main(String[] args) {
        formatter1();
    }
    
}
