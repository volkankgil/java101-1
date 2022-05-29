package java101ikinciders.src.döngüler;

import java.util.Scanner;

public class üçgenyýldýzyapýmý {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;

        System.out.println("sayý giriniz: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

