package java101ikinciders.src.loops.lecture;

import java.util.Scanner;

public class forvewhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sayi, i;
/*
        for (boolean run = true; run == true; ) {  // burdaki gibi 3 adet deðer atayýp 2. deðer sonunu ";" ile kapatabiliriz.
            System.out.print("sayý giriniz : ");
            sayi = input.nextInt();
            if (sayi < 0) {
                run = false;
            }
        } */

        /*System.out.println("Sayý giriniz: ");
        sayi = input.nextInt();

        while (sayi >0) {
            System.out.println("Sayý giriniz: ");
            sayi = input.nextInt();
        }*/

/*
        do {
            System.out.print("sayý giriniz: ");
            sayi = input.nextInt();
        } while (sayi > 0);

 */

        int a,b;

        System.out.print("sayý giriniz : ");
        b=input.nextInt();

        for (a=b-1 ; a < 20; a += 4) {
            System.out.println(a);
        }
/*
        int k=2;

        while (k<20){
            System.out.println(k);
            k+=4;

        }*/


    }
}


