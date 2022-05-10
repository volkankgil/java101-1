package döngüler;

import java.util.Scanner;

public class çiftsayýlarabölünenprogram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
/*
        int a;
        int k;
        System.out.println("Deðer giriniz");
        k = input.nextInt();

        for (a = 1; a <= k; a++) {
            if (a % 2 == 0) {
                System.out.println(a);
            }*/

        int sayý;
        int i = 0;
        double ortalama;
        int toplam = 0;
        int sayac = 0;


        System.out.print("deðer giriniz : ");
        sayý = input.nextInt();

        while (i != sayý) {

            i++;
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.print((toplam += i) + ",");

                if (i % 3 == 0 && i % 4 == 0) {
                    sayac++;
                    System.out.println(sayac + ",");

                    ortalama=toplam/sayac;
                    System.out.println(ortalama);
                    continue;

                }




            }


        }

    }
}

