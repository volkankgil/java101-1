package java101ikinciders.src.arraysAndArraysClass.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class dizideenkucukenbuyuksayý {
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

        int girilensayý;
        System.out.println("Girilen Sayý: ");
        girilensayý = input.nextInt();

        int maxsayý = list2[0];
        int minsayý = list2[0];

        for (int a : list2) {
            if (a < girilensayý) {
                minsayý = a;
            }
            if (a > girilensayý) {
                maxsayý = a;
                break;  // sayýlarý buldumu durmasý için break komutu veriyoruz.
            }
        }
        System.out.println(minsayý);
        System.out.println(maxsayý);
    }
}