package java101ikinciders.src.ilkdersler;

import java.util.Scanner;

public class kullan�c�giri�i {
    public static void main(String[] args) {

        String kullan�ad�, �ifre,yeni�ifre,a ;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullan�c� ad�n�n� giriniz : ");
        kullan�ad�=input.nextLine();

        System.out.print("�ifre Giriniz: ");
        �ifre = input.nextLine();

        if (kullan�ad�.equals("Volkan") && �ifre.equals("Marin1234"))
        {
                System.out.println("Giri� Yapt�n�z");
                }
        else {
            System.out.println("yanl�� giri� yapt�n�z");
            System.out.print("��FREN�Z� SIFIRLAMAK �STERM�S�N�Z?");
            a=input.nextLine();
            if (a.equals("evet")){

                System.out.print("YEN� ��FRE TANIMLAYINIZ : ");
            }

            else {
                System.out.println("sistemden ��k�ld�");
            }

            yeni�ifre = input.nextLine();

            if (yeni�ifre.equals ("Marin1234")){
                System.out.println("Yeni girdi�iniz �ifre eskisi ile ayn� olamaz");
            }

            else{
                System.out.println("�ifre olu�turuldu");

            }

            }

        }


    }

