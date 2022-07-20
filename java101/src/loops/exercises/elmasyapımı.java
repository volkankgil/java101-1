package java101ikinciders.src.loops.exercises;

import java.util.Scanner;

public class elmasyapýmý {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;

        System.out.println("sayý giriniz: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
                for (int k = 1; k <= (2 * i) - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        for(int l=n;l>0;l--) {
            for (int m = 1; m <= (n-l); m++) {
                System.out.print(" ");
            }
            for (int v = 1; v <= (2 * l)-1; v++) {
                System.out.print("*");
            }
            System.out.println();
        }
        }
    }
