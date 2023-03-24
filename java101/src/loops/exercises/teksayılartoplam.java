package java101ikinciders.src.loops.exercises;

import java.util.Scanner;

public class teksayýlartoplam {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int a;

        int total=0;

        do {
            System.out.print("deðer giriniz");
            a = input.nextInt();
            if (a % 2 == 1)
                total += a;


        }while (a%2==1);
        System.out.println(total);
        }

    }
