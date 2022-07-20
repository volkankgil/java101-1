package java101ikinciders.src.basicLessons.exercises;

import java.util.Scanner;
public class findHipotenus {
    public static void main(String[] args) {
        double a,b,c;
        double u ;
        double Area;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter A Value: ");
        a=input.nextInt();

        System.out.println("Enter B Value: ");
        b=input.nextInt();

        c=Math.sqrt((a*a)+(b*b));
        System.out.println("C Value: "+c);

        u=(a+b+c)/2;

        Area = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Circle Perimeter: " +2*u);
        System.out.println("Circle Area: " + Area);

    }
}
