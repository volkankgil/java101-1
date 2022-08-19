package java101ikinciders.src.loops.exercises;

import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {

        //Basamak Sayýsý Bulma Ýþlemi
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

        System.out.print("Sayý giriniz: ");
        a = input.nextInt();

        int tempnumber = a;
        int result = 0;

        while (tempnumber != 0) {
            tempnumber /= 10;  //javada bir sayýyý 10'a böler isek son basamaðý atýyoruz.
            counter++;
            System.out.println(tempnumber);
        }
        System.out.println("Basamak Sayýsý:" +counter);

        System.out.println("-----");

        tempnumber = a;

        while (tempnumber != 0) {
            basvalue = tempnumber % 10;
            baspow = 1;      // baspow sayýsý tekrar 1'e eþitliyoruz ki for döngüsü çýkýþýndaki rakamý almasýn.
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
