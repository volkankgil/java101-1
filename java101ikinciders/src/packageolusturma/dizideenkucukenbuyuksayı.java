package java101ikinciders.src.packageolusturma;

import java.util.Arrays;
import java.util.Scanner;

public class dizideenkucukenbuyuksay� {
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

        int girilensay�;
        System.out.println("Girilen Say�: ");
        girilensay� = input.nextInt();

        int maxsay� = list2[0];
        int minsay� = list2[0];

        for (int a : list2) {
            if (a < girilensay�) {
                minsay� = a;
            }
            if (a > girilensay�) {
                maxsay� = a;
                break;  // say�lar� buldumu durmas� i�in break komutu veriyoruz.
            }
        }
        System.out.println(minsay�);
        System.out.println(maxsay�);
    }
}