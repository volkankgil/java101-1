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
            System.out.println("Kullan�c� Ad�n� Giriniz: ");
            username = input.nextLine();
            System.out.println("�ifre Giriniz: ");
            password = input.nextLine();
            if (username.equals("Marin") && password.equals("T�may")) {
                System.out.println("Sisteme Giri� Yapt�n�z.");
                do {
                    System.out.println("1-Para yat�rma\n" +
                            "2-Para �ekme\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-��k�� Yap");
                    System.out.println("��lem Se�iniz: ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.println("Para miktar�n� giriniz: ");
                            addmoney = input.nextInt();
                            balance += addmoney;
                            System.out.println(balance);
                            break;
                        case 2:
                            System.out.println("�ekilecek para miktar�:");
                            pull = input.nextInt();
                            if (pull > balance) {
                                System.out.println("Bakiyeniz yetersiz");
                            } else {
                                balance -= pull;

                            }
                            break;
                        case 3:
                            System.out.println("G�ncel bakiyeniz:" + balance);
                            break;

                    }
                }
                while (select != 4);
                System.out.println("Tekrar G�r��mek �zere");
                break;

            } else {
                right--;
                System.out.println("Hatal� Giri� Yapt�n�z, Tekrar Deneyiz.");
                if (right == 0) {
                    System.out.println("Bankan�z ile ileti�eme ge�iniz");
                } else {
                    System.out.println("Kalan Hakk�n�z: " + right);
                }
            }
        }
    }
}



