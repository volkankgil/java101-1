package d�ng�ler;

import java.util.Scanner;

public class �iftsay�larab�l�nenprogram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
/*
        int a;
        int k;
        System.out.println("De�er giriniz");
        k = input.nextInt();

        for (a = 1; a <= k; a++) {
            if (a % 2 == 0) {
                System.out.println(a);
            }*/

        int say�;
        int i = 0;
        double ortalama;
        int toplam = 0;
        int sayac = 0;


        System.out.print("de�er giriniz : ");
        say� = input.nextInt();

        while (i != say�) {

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

