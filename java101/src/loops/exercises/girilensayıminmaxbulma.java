package java101ikinciders.src.loops.exercises;

import  java.util.Scanner;

public class girilensayýminmaxbulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Kaç sayý gireceksiniz: ");
        int n = input.nextInt();

        int min = 0;
        int max = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println(i + ".Sayý Giriniz: ");
            int a = input.nextInt();
            if (i == 1) {
                min = a;
                max = a;
            } else {
                if (min < a) {
                    min = a;
                } else if (max > a) {
                    max = a;
                }
            }
        }
        System.out.println("En küçük Sayý : " + max);
        System.out.println("En büyük Sayý : " + min);

        System.exit(0);
    }
}
