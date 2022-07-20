package java101ikinciders.src.loops.exercises;

import java.util.Scanner;

public class teksayýgirilenekadarcalýstýr {
    public static void main(String[] args) {

        int i, number,a;
        int total = 0;

        System.out.print("sayý giriniz: ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        boolean kosul = (number % 2 == 0);

        while (kosul) {

            if (number % 4 == 0 && number % 2 == 0) {
                total += number;
                number = input.nextInt();
            }else if (number%2==1){
                kosul=false;
            }else {  number = input.nextInt();

            }
        }System.out.println(total);
    }
}
