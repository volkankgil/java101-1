package java101ikinciders.src.basicLessons.exercises;

import java.util.Scanner;
public class groceryprogram {
    public static void main(String[] args) {

        double pear , apple, tomatoes, banana, patl�can,calculation;
        double pricepear=2.14;
        double priceapple=3.67;
        double pricetomatoes=1.11;
        double pricebanana=0.95;
        double pricepatl�can=5;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Pear Kg : ");
        pear=input.nextDouble();

        System.out.print("Enter Apple Kg : ");
        apple=input.nextDouble();

        System.out.print("Enter Tomatoes Kg : ");
        tomatoes=input.nextDouble();

        System.out.print("Enter Banana Kg : ");
        banana=input.nextDouble();

        System.out.print("Enter Patl�can Kg : ");
        patl�can=input.nextDouble();

        calculation=(pricepear*pear)+(priceapple*apple)+(pricetomatoes*tomatoes)+(pricebanana*banana)+(pricepatl�can*patl�can);

        System.out.println("Calculation: "+calculation);

    }
}
