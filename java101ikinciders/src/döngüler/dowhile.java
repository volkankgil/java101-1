package java101ikinciders.src.d�ng�ler;

import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int pass;
        boolean askpaswoord = true;

        do {
            System.out.println("�ifre giriniz : ");
            pass = input.nextInt();
            if (pass == 123) {
                System.out.println("do�ru");
                askpaswoord = false;
            } else {
                System.out.println("yanl��");
            }
        } while (askpaswoord);
    }
}

