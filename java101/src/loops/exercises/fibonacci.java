package java101ikinciders.src.loops.exercises;

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

        System.out.println();

        String first = "First sentence";
        String second = "Second sentence";
        String third = "Third sentence";
        String fourth = "Fourth sentence";
        String fifth = "Fifth sentence";

        StringBuilder sb = new StringBuilder();  //String Builder sýnýfý ile kelime birlieþtirme

        sb.append(first).append(" ").append(second).append(third).append(fourth).append(fifth);

        System.out.println(sb.toString());

        }
}
