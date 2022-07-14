package java101ikinciders.src.basicLessons.exercises;

import java.util.Scanner;

public class userLogin {
    public static void main(String[] args) {

        String kullanýcýadý, þifre, yeniþifre;
        String a = "";


        Scanner input = new Scanner(System.in);
        System.out.print("Kullanýcý adýný giriniz : ");
        kullanýcýadý = input.nextLine();

        System.out.print("Þifre Giriniz: ");
        þifre = input.nextLine();

        if (kullanýcýadý.equals("Volkan") && þifre.equals("Marin1234")) {
            System.out.println("Giriþ Yaptýnýz");
        } else {
            System.out.println("Yanlýþ Giriþ Yaptýnýz");
            System.out.print("ÞÝFRENÝZÝ SIFIRLAMAK ÝSTERMÝSÝNÝZ?");
            a = input.nextLine();
            if (a.equals("evet")) {
                System.out.print("YENÝ ÞÝFRE TANIMLAYINIZ : ");

                yeniþifre = input.nextLine();
                if (yeniþifre.equals("Marin1234")) {
                    System.out.println("Yeni girdiðiniz þifre eskisi ile ayný olamaz");
                } else {
                    System.out.println("þifre oluþturuldu");
                }
            } else {
                System.out.println("Sistemden Çýkýldý");
            }
        }
    }
}

