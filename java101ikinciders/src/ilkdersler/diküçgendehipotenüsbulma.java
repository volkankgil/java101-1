package java101ikinciders.src.ilkdersler;

import java.util.Scanner;
public class dik��gendehipoten�sbulma {
    public static void main(String[] args) {
        double a,b,c;
        double u ;
        double alan;

        Scanner input = new Scanner(System.in);

        System.out.println("a de�erini giriniz: ");
        a=input.nextInt();

        System.out.println("b de�erini giriniz: ");
        b=input.nextInt();


        c=Math.sqrt((a*a)+(b*b));
        System.out.println("c de�eri: "+c);

        u=(a+b+c)/2;

        alan= Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("��genin �evresi: " +2*u);
        System.out.println("��genin alan�: " + alan);





    }
}
