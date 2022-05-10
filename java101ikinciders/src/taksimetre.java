package java101ikinciders.src;

import  java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double perkm=2.20;
        double tutar;
        double startingprice=10;
        double km,a,b;



        System.out.print("gidilen km: ");
        km=input.nextDouble();
        tutar=km*perkm;
        a=tutar+startingprice;

        boolean kosul1 = a<20;
        b = kosul1 ? 20 :a;

        System.out.print("Toplam tutar: "+b);




    }
}
