package java101ikinciders.src.d�ng�ler;

import java.util.Scanner;

public class teksay�lartoplam {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int a;

        int total=1;

        do {
            System.out.print("de�er giriniz");
            a = input.nextInt();
            if (a % 2 == 1)
                total += a;


        }while (a>0);
        System.out.println(total);
        }

    }
