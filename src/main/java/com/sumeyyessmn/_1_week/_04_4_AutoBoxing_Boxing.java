package com.sumeyyessmn._1_week;

public class _04_4_AutoBoxing_Boxing {
    public static void main(String[] args) {
        //Autoboxing:Primitive => Wrapper type dönüştürmek
        int primitiveValue = 100;
        Integer wrapperValue = primitiveValue;
        //wrapperValue=null;
        System.out.println("primitive type: "+primitiveValue+" wrapper type: "+wrapperValue);

        //Unboxing : Wrapper Type => Primitive type dönüştürmek
        Integer wrapperValue2 = 200;
        int primitiveValue2 = wrapperValue2; //unboxing
        System.out.println("Wrapper type2: "+wrapperValue2+" Primitive type2: "+primitiveValue2);

    }
}
