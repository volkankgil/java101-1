package java101ikinciders.src.basicLessons.exercises;

import java.util.Scanner;

public class kullan�c�giri�i {
    public static void main(String[] args) {

        String kullan�c�ad�, �ifre, yeni�ifre;
        String a = "";


        Scanner input = new Scanner(System.in);
        System.out.print("Kullan�c� ad�n� giriniz : ");
        kullan�c�ad� = input.nextLine();

        System.out.print("�ifre Giriniz: ");
        �ifre = input.nextLine();

        if (kullan�c�ad�.equals("Volkan") && �ifre.equals("Marin1234")) {
            System.out.println("Giri� Yapt�n�z");
        } else {
            System.out.println("yanl�� giri� yapt�n�z");
            System.out.print("��FREN�Z� SIFIRLAMAK �STERM�S�N�Z?");
            a = input.nextLine();
            if (a.equals("evet")) {
                System.out.print("YEN� ��FRE TANIMLAYINIZ : ");
                yeni�ifre = input.nextLine();

                if (yeni�ifre.equals("Marin1234")) {
                    System.out.println("Yeni girdi�iniz �ifre eskisi ile ayn� olamaz");
                } else {
                    System.out.println("�ifre olu�turuldu");
                }
            } else {
                System.out.println("sistemden ��k�ld�");
            }

        }
    }
}

