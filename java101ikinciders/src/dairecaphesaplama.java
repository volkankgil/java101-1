package java101ikinciders.src;

import java.util.Scanner;

public class dairecaphesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double r;
        double pi=3.14;
        double alan, �evre,alfa,form�l;

        System.out.println("yari �ap giriniz : ");
        r=input.nextDouble();

        System.out.print("alfa de�erini giriniz: ");
        alfa=input.nextDouble();

        alan = pi*r*r;
        System.out.println("daire alan� :"+alan);
        �evre =2*pi*r;
        System.out.println("daire �evresi:"+�evre);
        form�l =(pi*(r*r)*alfa)/360;
        System.out.println("daire form�l :" +form�l);




    }
}
