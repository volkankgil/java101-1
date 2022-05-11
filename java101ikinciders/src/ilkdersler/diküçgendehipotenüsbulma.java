package java101ikinciders.src.ilkdersler;

import java.util.Scanner;
public class diküçgendehipotenüsbulma {
    public static void main(String[] args) {
        double a,b,c;
        double u ;
        double alan;

        Scanner input = new Scanner(System.in);

        System.out.println("a deðerini giriniz: ");
        a=input.nextInt();

        System.out.println("b deðerini giriniz: ");
        b=input.nextInt();


        c=Math.sqrt((a*a)+(b*b));
        System.out.println("c deðeri: "+c);

        u=(a+b+c)/2;

        alan= Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("üçgenin çevresi: " +2*u);
        System.out.println("üçgenin alaný: " + alan);





    }
}
