package java101ikinciders.src.d�ng�ler;

import java.util.Scanner;

public class ��geny�ld�zyap�m� {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;

        System.out.println("say� giriniz: ");
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

