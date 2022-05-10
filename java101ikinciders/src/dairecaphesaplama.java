package java101ikinciders.src;

import java.util.Scanner;

public class dairecaphesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double r;
        double pi=3.14;
        double alan, çevre,alfa,formül;

        System.out.println("yari çap giriniz : ");
        r=input.nextDouble();

        System.out.print("alfa deðerini giriniz: ");
        alfa=input.nextDouble();

        alan = pi*r*r;
        System.out.println("daire alaný :"+alan);
        çevre =2*pi*r;
        System.out.println("daire çevresi:"+çevre);
        formül =(pi*(r*r)*alfa)/360;
        System.out.println("daire formül :" +formül);




    }
}
