

package java101ikinciders.src.basicLessons.exercises;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Year: ");
        int x = input.nextInt();

        boolean condition1 = x % 4 == 0;
        boolean condition2 = x % 400 == 0;

        if (condition2 && x % 100 == 0) {
            System.out.println("Leap Year");
        } else if (x % 100 != 0) {
            if (condition1) {
                System.out.println("Leap Year");
            } else{
                    System.out.println("Not Leap Year");
                }
            } else System.out.println("Not Leap Year");
    }
    }