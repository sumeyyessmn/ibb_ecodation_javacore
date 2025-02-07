package com.sumeyyessmn._1_part_javatypes;

public class _06_Math {
    public static void main(String[] args) {
        //NaN : Not A Number
        System.out.println("En küçük: "+Math.min(3,10));
        System.out.println("En büyük: "+Math.max(-300,10));

        System.out.println("Mutlak: "+Math.abs(-7));

        System.out.println("Karekök: "+Math.sqrt(25));
        System.out.println("Karekök: "+Math.sqrt(Math.abs(-25)));

        System.out.println("Üslü: "+Math.pow(2,5));

        System.out.println("Karekök: "+Math.sqrt(25));

        System.out.println("Alt yuvarla: "+Math.floor(2.9));
        System.out.println("Üste yuvarla: "+Math.ceil(2.1));
        System.out.println("Ortalama yuvarla: "+Math.round(3.4)); //x>=4 aşağı yuvarla
        System.out.println("Ortalama yuvarla: "+Math.round(3.5)); //x>=5 ve yukarıysa yukarı yuvarla

        System.out.println("PI sayısı: "+Math.PI);
        System.out.println("E sayısı: "+Math.E);

        System.out.println("Trigonometrik Sinüs: "+Math.sin(1));
        System.out.println("Trigonometrik Sinüs: "+Math.asin(1));

        System.out.println("Trigonometrik Kosinüs: "+Math.cos(1));
        System.out.println("Trigonometrik Tanjant: "+Math.tan(1));
    }
}
