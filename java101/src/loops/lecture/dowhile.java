package java101ikinciders.src.loops.lecture;

import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int pass;
        boolean askpaswoord = true;

        do {
            System.out.println("þifre giriniz : ");
            pass = input.nextInt();
            if (pass == 123) {
                System.out.println("doðru");
                askpaswoord = false;
            } else {
                System.out.println("yanlýþ");
                askpaswoord=true;
            }
        } while (askpaswoord);
    }
}

