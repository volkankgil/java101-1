package java101ikinciders.src.basicLessons.exercises;

import  java.util.Scanner;

public class taximetre {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double perkm=2.20;
        double tutar;
        double startingprice=10;
        double km, totalprice, taxiFee;



        System.out.print("Gidilen km: ");
        km=input.nextDouble();
        tutar=km*perkm;
        totalprice =(int)(tutar)+startingprice;

        boolean kosul1 = totalprice <20;
        taxiFee = kosul1 ? 20 : totalprice;

        System.out.print("Total Amount: "+ taxiFee);




    }
}
