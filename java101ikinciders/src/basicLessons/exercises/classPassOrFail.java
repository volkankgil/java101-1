package java101ikinciders.src.basicLessons.exercises;

import java.util.Scanner;

public class classPassOrFail {
    public static void main(String[] args) {

        int Matematik, Fizik, T�rk�e, Kimya, M�zik;
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

        System.out.print("f�Z�K notunuz :");
        Fizik = input.nextInt();
        if (Fizik >= 0 && Fizik <= 100) {
            toplam += Fizik;
            sayac++;
        }

        System.out.print("T�rk�e notunuz :");
        T�rk�e = input.nextInt();
        if (T�rk�e >= 0 && T�rk�e <= 100) {
            toplam += T�rk�e;
            sayac++;
        }

        System.out.print("Kimya Notunuz:");
        Kimya = input.nextInt();
        if (Kimya >= 0 && Kimya <= 100) {
            toplam += Kimya;
            sayac++;
        }

        System.out.print("M�zik notunuz :");
        M�zik = input.nextInt();
        if (M�zik >= 0 && M�zik <= 100) {
            toplam += M�zik;
            sayac++;
        }

        /*int sum=0;   // diziler ile sonuc bulma

        int result[]={Matematik,Fizik,T�rk�e,Kimya,M�zik};

        for (int i=0;i<result.length;i++) {
            sum+=result[i];
        }
        System.out.println("Ortalama: " +sum/result.length);*/

        if (sayac == 0) {
            System.out.println("HATALI ��LEM");
        } else {
            ortalama = (toplam / sayac);

            System.out.println("ortalama Notu: "+ ortalama);

            /*boolean sonuc=ortalama>55 ;

            String resulttt=sonuc ?"ge�ti":"kadl�";
            System.out.println(resulttt);*/   //boolean ile yazd�rma hali.

            if (ortalama < 55) {
                System.out.println("kald�");
            }else{
                System.out.println("ge�ti");

            }
        }
    }
}

