package com.sumeyyessmn._2_week;

public class _13_1_MethodIsNotReturn {
    /// 1- Metotlar (Returnsüz parametresiz)
    public void metotReturnsuzParametresiz(){
        System.out.println("metot returnsuz parametresiz ");
    }
    // 2- Metotlar (Returnsuz parametreli)
    public static void metotReturnsuzParametreli(String name){
        System.out.println("metot returnsuz parametreli "+name);
    }
    //Overloading(Aşırı yüklemek)
    public static void metotReturnsuzParametreli(String name,String surname){
        System.out.println("metot returnsuz parametreli "+name+" "+surname);
    }
    // new
    // static
    public static void main(String[] args) {
        _13_1_MethodIsNotReturn data1 = new _13_1_MethodIsNotReturn();
        data1.metotReturnsuzParametresiz();
        //Instance(new) olmadan static ile cagirdim
        _13_1_MethodIsNotReturn.metotReturnsuzParametreli("Sumeyye");
        _13_1_MethodIsNotReturn.metotReturnsuzParametreli("Sumeyye","Sisman");

    }

}
