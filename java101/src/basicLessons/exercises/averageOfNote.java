package java101ikinciders.src.basicLessons.exercises;

import  java.util.Scanner;

public class averageOfNote {
    public static void main(String[] args) {

        double matematik, t�rk�e, fizik,kimya,m�zik,tarih ;




        System.out.print("Matematik notunu giriniz :" );
        Scanner input = new Scanner(System.in);
        matematik= input.nextDouble();

        System.out.print("t�rk�e notunu giriniz: " );
        t�rk�e = input.nextDouble();

        System.out.print("fizik notunu giriniz: " );
        fizik = input.nextDouble();

        System.out.print("kimya notunu giriniz: " );
        kimya = input.nextDouble();

        System.out.print("m�zik notunu giriniz: " );
        m�zik = input.nextDouble();

        System.out.print("tarih notunu giriniz: " );
        tarih = input.nextDouble();



        double ortalaman�z = (matematik+t�rk�e+fizik+kimya+m�zik+tarih)/6;
        System.out.println("ortalaman�z ortalaman�z :" + ortalaman�z);



        boolean kosul = ortalaman�z >60;
        String str = kosul ? "ge�ti" : "kald�";
        System.out.println(str);



    }
}
