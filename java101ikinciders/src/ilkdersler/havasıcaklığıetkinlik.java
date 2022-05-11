package java101ikinciders.src.ilkdersler;

import java.util.Scanner;

public class havasıcaklığıetkinlik {
    public static void main(String[] args) {

        int sıcaklık ;

        Scanner input = new Scanner(System.in);

        System.out.print("Hava sıcaklığı: ");

        sıcaklık = input.nextInt();

        if (sıcaklık<5){
            System.out.println("kayak yapabilirsiniz");
        }

        if (sıcaklık>=5 && sıcaklık<=15){
            System.out.println("sinemaya gidebilirsin");
        }
        if (sıcaklık>=10 && sıcaklık<=25) {
            System.out.println("pikniğe gidebilirsin");

        }else if (sıcaklık>25){
                System.out.println("denize gidebilirsin");
            }
        }


        




    }

