package com.strCMP.gubenkoDM;

/**
 * Created by DmitriX on 14.03.2017.
 */
public class MainClass {
    public static void main(String[] args) {
        String s1 = "Cat"; //создание строки в пуле адресов в куче
        String s2 = "Cat"; //создание строки в пуле адресов в куче будет ссылать на тот же объект что и s1
        String s3 = new String("Cat"); //создание новой строки в куче. новый объект
        String s4 = new String("Cat"); //создание новой строки в куче. новый объект
        String s5 = new String("Dog"); //создание новой строки в куче. новый объект
        // сравниваем наши строки
        System.out.println("s1 == s2 : " + ( s1 == s2 ) ); //true s1 и s2 ссылаются на один и тот же объект в куче
        System.out.println("s1 == s3 : " + ( s1 == s3 ) ); //false разные объекты
        System.out.println("s3 == s4 : " + ( s3 == s4 ) ); //false разные объекты
        System.out.println("s3 == s4 : " + ( s3.intern() == s4.intern()) ); //true. помещение объектов строк в пул строк в куче, так как строки имеют одинаковое содержимое то s3 и s4 ссылвются на один о тот же объект
        System.out.println("s3 == s5 : " + ( s3.intern() == s5.intern()) ); //обе строки перенесены в пул строк но в пуле ссылаются на разные объект
        System.out.println("s1 == s3 : " + ( s1 == s3.intern() ) ); //после интернирования обе ссылки на одну и туже строку в пуле строк

        //контанты строк по умолчанию интернированы, для получения прироста при выполнении операций сравнения строк
        //intern() принцип работы.
        // при интернировании преверяем есть ли в пуле строк объект с таким же содержимы, если есть то меняем незаметно старую ссылку на новую в пуле строк
        //если нет в пуле объекта с таким содержимым то переносим текущий интернируемый объект строки в пул и меняем старую ссылку на новую в пуле.

        char c=s1.charAt(0);
        System.out.println(c);

        int indC=s1.codePointAt(0);
        System.out.println(indC+""+(char)indC);

        int indRange=s1.codePointCount(0,2);
        System.out.println(indRange+""+(char)indRange);

        //значение 0, если аргумент является строкой лексически равной данной строке;
        // значение меньше 0, если аргумент является строкой лексически большей, чем сравниваемая строка;
        // и значение больше 0, если аргумент является строкой лексически меньшей этой строки.
        int num=s1.compareTo("CCat");
        System.out.println(num);

        System.out.println(s1.contentEquals("atC"));

        byte b[]=s1.getBytes();
        System.out.println(new String(b));

        char cA[]=new char[s1.length()];
        s1.getChars(0,s1.length(),cA,0);
        System.out.println(cA);


    }
}
