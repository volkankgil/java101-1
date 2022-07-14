package java101ikinciders.src.loops.exercises;

import java.util.Scanner;

public class atmprojesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password;
        int right = 3;
        int balance = 2000;
        int select;
        int addmoney;
        int pull;

        while (right > 0) {
            System.out.println("Kullanýcý Adýný Giriniz: ");
            username = input.nextLine();
            System.out.println("Þifre Giriniz: ");
            password = input.nextLine();
            if (username.equals("Marin") && password.equals("Tümay")) {
                System.out.println("Sisteme Giriþ Yaptýnýz.");
                do {
                    System.out.println("1-Para yatýrma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-Çýkýþ Yap");
                    System.out.println("Ýþlem Seçiniz: ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.println("Para miktarýný giriniz: ");
                            addmoney = input.nextInt();
                            balance += addmoney;
                            System.out.println(balance);
                            break;
                        case 2:
                            System.out.println("Çekilecek para miktarý:");
                            pull = input.nextInt();
                            if (pull > balance) {
                                System.out.println("Bakiyeniz yetersiz");
                            } else {
                                balance -= pull;

                            }
                            break;
                        case 3:
                            System.out.println("Güncel bakiyeniz:" + balance);
                            break;

                    }
                }
                while (select != 4);
                System.out.println("Tekrar Görüþmek üzere");
                break;

            } else {
                right--;
                System.out.println("Hatalý Giriþ Yaptýnýz, Tekrar Deneyiz.");
                if (right == 0) {
                    System.out.println("Bankanýz ile iletiþeme geçiniz");
                } else {
                    System.out.println("Kalan Hakkýnýz: " + right);
                }
            }
        }
    }
}



