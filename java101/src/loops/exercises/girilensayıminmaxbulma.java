package java101ikinciders.src.loops.exercises;

import  java.util.Scanner;

public class girilensay�minmaxbulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ka� say� gireceksiniz: ");
        int n = input.nextInt();

        int min = 0;
        int max = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println(i + ".Say� Giriniz: ");
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
        System.out.println("En k���k Say� : " + max);
        System.out.println("En b�y�k Say� : " + min);

        System.exit(0);
    }
}
