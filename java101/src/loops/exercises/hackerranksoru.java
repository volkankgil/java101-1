package java101ikinciders.src.loops.exercises;

import java.util.Scanner;

public class hackerranksoru {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("sayý giriniz: ");
        int n=input.nextInt();

        int i=0;
        int result=1;

        if(n>=2 && n<=20){
            while (i<10){
                i++;
                result=n*i;

                System.out.print(n);
                System.out.print("*");
                System.out.print(i);
                System.out.print("=");
                System.out.println(result);
            }
        }

    }
}
