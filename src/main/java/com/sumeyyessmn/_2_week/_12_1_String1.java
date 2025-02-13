package com.sumeyyessmn._2_week;

public class _12_1_String1 {
    public static void main(String[] args) {
        //1.yol
        //String vocabulary = new String(" Java öğreNİYOrum ");
        //2.yol
        //String vocabulary = new String();
        //3.yol
        //vocabulary = " Java öğreNİYOrum ";
        String vocabulary1 = " Java öğreNİYOrum ";
        String vocabulary2 = " Java öğreNİYOrum ";
        //length
        System.out.println("Harf sayısı: "+vocabulary1.length());

        //trim: basında veya sonundaki boşlukları alır
        System.out.println("Trim: "+vocabulary1.trim().length());
        System.out.println("Trim: "+vocabulary1.trim());

        //equals = eşit mi?
        System.out.println(vocabulary1 == vocabulary2);
        System.out.println("Equals: "+vocabulary1.equals(vocabulary2));
        System.out.println("equalsIgnoreCase: "+vocabulary1.equalsIgnoreCase(vocabulary2));

        //charAt() sıfırdan saymaya başlar, ve verdiğimiz sayı ile ilgili kelimenin harfini
        //bize verir
        System.out.println(vocabulary1.charAt(1));

        // toUpperCase() => Hepsini BÜYÜK karakter yap
        System.out.println(vocabulary1.toUpperCase());
        System.out.println(vocabulary1.toLowerCase());

        //startsWith()=>ile mi başlıyor
        //endsWith()=> ile mi bitiyor
        System.out.println(vocabulary1.startsWith("J")+" ile mi başlıyor");
        System.out.println(vocabulary1.endsWith(" ")+" ile mi bitiyor");

        //subString(): parçalama iki yöntem var
        // 1: süpürme
        // 2: Aralarında
        System.out.println(vocabulary1.trim().substring(1));
        System.out.println(vocabulary1.trim().substring(1).toLowerCase());
        System.out.println(vocabulary1.substring(1,10));//1<=VOCABUL<=10-1

        String vocabulary3 = "java";
        if(vocabulary3.length()>=10){
            //StringIndexOutOfBoundsException
            System.out.println(vocabulary3.substring(1,10));//1<=VOCABUL<=10-1
        }else {
            System.out.println("Verdiğiniz kelime en fazla "+vocabulary3.length()+" karakter vardır");
        }
        //contains
        System.out.println("Geçiyor mu? "+vocabulary1.contains("Java"));
        //split

        //Replace
        System.out.println(vocabulary1.replace("Java","Java 2025"));
        /// Birleştirme
        String concatenation = vocabulary1 + vocabulary2 + vocabulary3;
        System.out.println(concatenation);
        // Birleştirme (concat)
        System.out.println(vocabulary1.concat(" jsp").concat(" jsf"));

        //Birleştirme (StringBuilder)
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(vocabulary1).append(" jsp").append(" jsf");
        String dataToString1 = stringBuilder.toString();
        System.out.println(dataToString1);

        //Birleştirme (StringBuffer)
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(vocabulary1).append(" jsp").append(" jsf");
        String dataToString2 = stringBuilder.toString();
        System.out.println(dataToString2);

        //hashcode
        System.out.println(vocabulary1.hashCode());
        System.out.println(vocabulary2.hashCode());
        System.out.println(vocabulary3.hashCode());

    }
}
