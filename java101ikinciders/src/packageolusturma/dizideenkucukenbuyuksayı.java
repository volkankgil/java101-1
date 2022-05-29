package java101ikinciders.src.packageolusturma;

import java.util.Arrays;
import java.util.Scanner;

public class dizideenkucukenbuyuksayı {
    public static void main(String[] args) {

        int[] list = {56, 34, 1, 8, 101, -2, -33};

        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max);
        System.out.println(min);


        int[] list2 = {15, 12, 788, 1, -1, -778, 2, 0};
        Arrays.sort(list2);

        Scanner input = new Scanner(System.in);

        int girilensayı;
        System.out.println("Girilen Sayı: ");
        girilensayı = input.nextInt();

        int maxsayı = list2[0];
        int minsayı = list2[0];

        for (int a : list2) {
            if (a < girilensayı) {
                minsayı = a;
            }
            if (a > girilensayı) {
                maxsayı = a;
                break;  // sayıları buldumu durması için break komutu veriyoruz.
            }
        }
        System.out.println(minsayı);
        System.out.println(maxsayı);
    }
}