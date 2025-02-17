package com.sumeyyessmn._2_week;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class _15_1_Date {
    //Date (Get)
    public static void dateGetMethod(){
        Date now = new Date();
        System.out.println("Şuanki zaman: "+now);
        System.out.println("1 Ocak 1970 yılından şimdiki zamana kadar gecen sürenin milisaniye cinsinden: "+now.getTime());
        System.out.println("Date: "+now.getDate());
        System.out.println("Day: "+now.getDay());
        System.out.println("Month: "+now.getMonth()); //Saymaya 0'dan başlar 0=Ocak, 1= Şubat
        System.out.println("Year: "+(1900+now.getYear())); //1900 ekle veya çıkar
        System.out.println("Date yıl: "+(2025-now.getYear()));
        System.out.println("Hours: "+now.getHours());
        System.out.println("Minutes: "+now.getMinutes());
        System.out.println("Seconds: "+now.getSeconds());
    }
    //1.yöntem
    public static String nowFormat1() throws NullPointerException{
        Date now = new Date();
        String specialFormat = "Şimdiki zaman: "
                .concat(String.valueOf(now.getHours()))
                .concat(":")
                .concat(String.valueOf(now.getMinutes()))
                .concat(":")
                .concat(String.valueOf(now.getSeconds()))
                .toString();
        return specialFormat;
    }
    //2.yöntem
    public static String nowFormat2() throws NullPointerException{
        Date now = new Date();
        // %s = String
        // %d = Decimal
        // %f = Float
        return String.format("Şimdiki Zaman: %02d:%02d:%02d",now.getHours(),now.getMinutes(),now.getSeconds());
    }
    //3.yöntem
    public static String nowFormat3() throws NullPointerException{
        Date now = new Date();
        Locale locale = new Locale("tr","TR");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMM/yyyy hh:mm:ss",locale);
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss",locale);
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MMM-dd HH:mm:ss",locale);
        //SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss",locale);
        //SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss zzzz",locale);
        String formatedDate = String.format("Şimdiki zaman: %s",sdf.format(now));
        return new Date().toString()+" - "+formatedDate;
    }
    //PSVM
    public static void main(String[] args) {
        dateGetMethod();
        String nowDate2 = nowFormat2();
        System.out.println(nowDate2);

        String nowDate3 = nowFormat3();
        System.out.println(nowDate3);
    }
}
