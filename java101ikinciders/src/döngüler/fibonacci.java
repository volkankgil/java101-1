package java101ikinciders.src.döngüler;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Sayý giriniz: ");
        int n = input.nextInt();
        int result = 0;
        int a=0;
        int b=1;

        System.out.print(a+" "+b);

        for (int i = 2; i <= n; i++) {
                result=a+b;
                System.out.print(" "+result);
                a=b;
                b=result;
            }
        }
}
