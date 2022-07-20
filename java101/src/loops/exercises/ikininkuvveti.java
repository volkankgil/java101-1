package java101ikinciders.src.loops.exercises;

import java.util.Scanner;
public class ikininkuvveti {
    public static void main(String[] args) {
/*
        int i, n;
        Scanner input=new Scanner(System.in);
        System.out.print("deðer giriniz: ");
        n=input.nextInt();


        for(i=1;i<n;i*=2){
            System.out.println(i);//2nin kuvvetlerini bulmak için i*=2kýsa yolunu kullanýyoruz.


        }*/

        /*int k = 1;
        int number;

        Scanner input = new Scanner(System.in);
        System.out.print("deðer giriniz: ");
        number = input.nextInt();

        while (k < number) {

            System.out.println(k);
            k *=2;
        }*/

        int i, n;
        Scanner input = new Scanner(System.in);
        System.out.print("deðer giriniz: ");
        n = input.nextInt();

        for (i = 1; i < n; i *= 4) {
            System.out.println(i + "   ");
        }

        System.out.println();

            for (i = 1; i < n; i *= 5) {

                System.out.println(i);

            }


        }
    }

