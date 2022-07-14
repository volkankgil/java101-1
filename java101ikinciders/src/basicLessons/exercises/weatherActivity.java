package java101ikinciders.src.basicLessons.exercises;

import java.util.Scanner;

public class weatherActivity {
    public static void main(String[] args) {

        int degree;

        Scanner input = new Scanner(System.in);

        System.out.print("Temperature: ");

        degree = input.nextInt();

        if (degree <5){
            System.out.println("Go Skiing");
        }

        if (degree >=5 && degree <=15){
            System.out.println("Go cinema");
        }

        if (degree >=10 && degree <=25) {
            System.out.println("Go picnic");

        }else if (degree >25){
                System.out.println("Go to sea");
            }
        }
    }

