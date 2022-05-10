package döngüler;

import java.util.Scanner;

public class çiftsayılarabölünenprogram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
/*
        int a;
        int k;
        System.out.println("Değer giriniz");
        k = input.nextInt();

        for (a = 1; a <= k; a++) {
            if (a % 2 == 0) {
                System.out.println(a);
            }*/

        int sayı;
        int i = 0;
        double ortalama;
        int toplam = 0;
        int sayac = 0;


        System.out.print("değer giriniz : ");
        sayı = input.nextInt();

        while (i != sayı) {

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

