package java101ikinciders.src.döngüler;

import java.util.Scanner;
public class groceryprogram {
    public static void main(String[] args) {

        double pear , apple, tomatoes, banana, patlıcan,calculation;
        double pricepear=2.14;
        double priceapple=3.67;
        double pricetomatoes=1.11;
        double pricebanana=0.95;
        double pricepatlıcan=5;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Pear Kg : ");
        pear=input.nextDouble();

        System.out.print("Enter Apple Kg : ");
        apple=input.nextDouble();

        System.out.print("Enter Tomatoes Kg : ");
        tomatoes=input.nextDouble();

        System.out.print("Enter Banana Kg : ");
        banana=input.nextDouble();

        System.out.print("Enter Patlıcan Kg : ");
        patlıcan=input.nextDouble();

        calculation=(pricepear*pear)+(priceapple*apple)+(pricetomatoes*tomatoes)+(pricebanana*banana)+(pricepatlıcan*patlıcan);

        System.out.println("Calculation: "+calculation);

    }
}
