package java101ikinciders.src.basicLessons.exercises;

import java.util.Scanner;
public class bmýcalculating {
    public static void main(String[] args) {

        double height , weight ;
        double calculate;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Height:");
        height=input.nextDouble();


        System.out.print("Enter Your Weight:");
        weight=input.nextDouble();


        calculate= weight/(height*height);
        System.out.println("BMI Index:" +calculate);




    }
}
