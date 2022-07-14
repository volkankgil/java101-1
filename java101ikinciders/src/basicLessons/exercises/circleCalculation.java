package java101ikinciders.src.basicLessons.exercises;

import java.util.Scanner;

public class circleCalculation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double r;
        double pi=3.14;
        double Area, Perimeter,alfa, formul;

        System.out.println("Enter Radius Value : ");
        r=input.nextDouble();

        System.out.print("Enter Alfa Value: ");
        alfa=input.nextDouble();

        Area = pi*r*r;
        System.out.println("Circle Area :"+ Area);
        Perimeter =2*pi*r;
        System.out.println("Circle Perimeter:"+ Perimeter);
        formul =(pi*(r*r)*alfa)/360;
        System.out.println("Circle Formul :" + formul);




    }
}
