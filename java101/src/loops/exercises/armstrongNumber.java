package java101ikinciders.src.loops.exercises;

import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {

        //Basamak Say�s� Bulma ��lemi
        // 2451 / 10 = 245
        // 245 / 10 = 24
        // 24 / 10 = 2
        // 2 / 10 = 0
        // 0 / 10 = 0

        Scanner input = new Scanner(System.in);

        int a;
        int counter = 0;
        int basvalue;
        int baspow;

        System.out.print("Say� giriniz: ");
        a = input.nextInt();

        int tempnumber = a;
        int result = 0;

        while (tempnumber != 0) {
            tempnumber /= 10;  //javada bir say�y� 10'a b�ler isek son basama�� at�yoruz.
            counter++;
            System.out.println(tempnumber);
        }
        System.out.println("Basamak Say�s�:" +counter);

        System.out.println("-----");

        tempnumber = a;

        while (tempnumber != 0) {
            basvalue = tempnumber % 10;
            baspow = 1;      // baspow say�s� tekrar 1'e e�itliyoruz ki for d�ng�s� ��k���ndaki rakam� almas�n.
            for (int i = 1; i <= counter; i++) {

                baspow *= basvalue;
            }

            result += baspow;
            tempnumber /= 10;
            System.out.println(basvalue);
        }
        System.out.println(result);
    }
}
