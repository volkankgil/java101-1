package java101ikinciders.src.d�ng�ler;

import java.util.Scanner;

public class teksay�girilenekadarcal�st�r {
    public static void main(String[] args) {

        int i, number;
        int total = 0;

        System.out.print("say� giriniz: ");

        do {
            Scanner input = new Scanner(System.in);
            number = input.nextInt();
            if (number % 4 == 0 && number%2==0)
                total += number;



        } while (number % 2 == 0) ;
        System.out.println(total);
        }
    }
