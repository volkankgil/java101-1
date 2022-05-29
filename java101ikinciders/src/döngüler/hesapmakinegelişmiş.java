package java101ikinciders.src.döngüler;

import java.util.Scanner;

public class hesapmakinegelişmiş {

    static int sum (int a,int b){
        int result=a+b;
        System.out.println("Toplam:" +result);
        return result;
    }

    static int eksi (int a,int b){
        int result=a-b;
        System.out.println("Çıkarma: "+result);
        return  result;
    }

    static int çarpma (int a,int b) {
        int result = a * b;
        System.out.println("Çarpma:" +result);
        return result;
    }

    static int bölme (int a,int b) {
        if (b == 0) {
            System.out.println("Sayı sıfırdan farklı olmalı");
            return 1;
        } else {
            int result = a / b;
            System.out.println("Bölme:" + result);

            return result;
        }
    }

    static int üsalma(int a,int b){
        int i;
        int result=1;
        for(i=1;i<=b;i++){
            result*=a;
        }
        System.out.println("Üssü"+result);
        return result;
    }

    static void faktoriyel(int a,int b){
        int result=1;
        for(int i=1;i<=a;i++){
            result*=i;
        }
        System.out.println("Faktoriyel: " + result);
    }

    static void modalma(int a,int b){ // void yazıp int kaldırdığım için return değeri yazmak zorunlu değil.
        int result=a%b;
        System.out.println("Mod: " +result);
    }

    static void dikdörtgenalanvecevresi(int a, int b){
        int result = a+b;
        int result2=a*b;
        System.out.println(result);
        System.out.println(result2);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String Menu = "1- Toplama İşlemi:\n "
                + "2- Çıkarma İşlemi:\n "
                + "3- Çarpma İşlemi:\n "
                + "4- Bölme işlemi:\n "
                + "5- Üslü Sayı Hesaplama:\n "
                + "6- Faktoriyel Hesaplama:\n "
                + "7- Mod Alma: \n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı:\n "
                + "0- Çıkış Yap : \n ";

        System.out.println(Menu);

        while (true) {

            System.out.println("İşlemi seçiniz: ");
            int select = input.nextInt();
            if (select == 0) {
                break;
            }

                System.out.println("Birinci Sayıyı Giriniz: ");
                int a = input.nextInt();

                System.out.println("İkinci Sayıyı Giriniz: ");
                int b = input.nextInt();


            switch (select) {
                case 1 :
                    sum(a,b);
                    break;
                case 2 :
                    eksi(a,b);
                    break;
                case 3:
                    çarpma(a,b);
                    break;
                case 4:
                    if (a==0) {
                        System.out.println("0");
                    }else {
                        bölme(a,b);
                    }
                    break;
                case 5:
                    üsalma(a,b);
                    break;
                case 6:
                    faktoriyel(a,b);
                    break;
                case 7:
                    modalma(a,b);
                    break;
                case 8:
                    dikdörtgenalanvecevresi(a,b);
                    break;
            }

        }
        System.out.println("GÜLE GÜLE");
    }
}
