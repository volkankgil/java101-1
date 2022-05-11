package java101ikinciders.src.ilkdersler;

import java.util.Scanner;

public class sýnýfgecmedurumu {
    public static void main(String[] args) {

        int Matematik, Fizik, Türkçe, Kimya, Müzik;
        int toplam = 0;
        int sayac = 0;
        int ortalama;


        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notu : ");
        Matematik = input.nextInt();
        if (Matematik >= 0 && Matematik <= 100) {
            toplam += Matematik;
            sayac++;
        }

        System.out.print("fÝZÝK notunuz :");
        Fizik = input.nextInt();
        if (Fizik >= 0 && Fizik <= 100) {
            toplam += Fizik;
            sayac++;
        }

        System.out.print("Türkçe notunuz :");
        Türkçe = input.nextInt();
        if (Türkçe >= 0 && Türkçe <= 100) {
            toplam += Türkçe;
            sayac++;
        }

        System.out.print("Kimya Notunuz:");
        Kimya = input.nextInt();
        if (Kimya >= 0 && Kimya <= 100) {
            toplam += Kimya;
            sayac++;
        }

        System.out.print("Müzik notunuz :");
        Müzik = input.nextInt();
        if (Müzik >= 0 && Müzik <= 100) {
            toplam += Müzik;
            sayac++;
        }

        if (sayac == 0) {
            System.out.println("HATALI ÝÞLEM");
        } else {
            ortalama = (toplam / sayac);

            System.out.println("ortalama Notu: "+ ortalama);

            if (ortalama < 55) {
                System.out.println("kaldý");
            }else{
                System.out.println("geçti");

            }


        }
    }
}

