package java101ikinciders.src.ilkdersler;

import  java.util.Scanner;

public class u�akbiletihesap {
    public static void main(String[] args) {

        int km;
        double kmperprice;
        int ya�;
        int y�n;
        kmperprice = 0.10;

        double toplam = 0, toplamoniki, toplamyasl�, toplamaral�k, toplamoniki�ift, toplamaral�k�ift, toplamyasl��ift;


        Scanner input = new Scanner(System.in);
        System.out.print("Gidilecek Km:");
        km = input.nextInt();

        System.out.print("Yolcu Ya��: ");
        ya� = input.nextInt();

        System.out.print("gidi� tipi: ");
        y�n = input.nextInt();
        boolean ko�ul = (y�n == 1 || y�n == 2);

        if (ko�ul) {
        } else {
            System.out.println("hatal� giri�");
        }

        toplam = kmperprice * km;
        toplamoniki = (toplam / 2);
        toplamoniki�ift=2*(toplamoniki-(toplamoniki*0.2));
        toplamaral�k = toplam - (toplam * 0.10);
        toplamaral�k�ift=2*(toplamaral�k-(toplamaral�k*0.2));
        toplamyasl� = toplam - (toplam * 0.3);
        toplamyasl��ift=2*(toplamyasl�-(toplamyasl�*0.2));

        switch (y�n) {
            case 1:
                if(ya�>0 && km>0) {
                    if (ya� < 12) {
                        System.out.println("bilet fiyat�:"+toplamoniki);
                    } else if (ya� > 65) {
                        System.out.println("bilet fiyat�:"+toplamyasl�);
                    } else if (ya� > 11 && ya� < 25) {
                        System.out.println("bilet fiyat�:"+toplamaral�k);
                    } else if (ya� > 24 && ya� < 66)
                        System.out.println("bilet fiyat�:"+toplam);
                }else System.out.println("hatal� giri�");
                break;

            case 2:
                if(ya�>0 && km>0) {
                    if (ya� < 12) {
                        System.out.println("bilet fiyat�:"+toplamoniki�ift);
                    } else if (ya� > 65) {
                        System.out.println("bilet fiyat�:"+toplamyasl��ift);
                    } else if (ya� > 11 && ya� < 25) {
                        System.out.println("bilet fiyat�:"+toplamaral�k�ift);
                    } else if (ya� > 24 && ya� < 66)
                        System.out.println("bilet fiyat�:"+2*toplam);
                }else System.out.println("hatal� giri�");
                break;

            }

        }
/*
        if (y�n == 1) {
            if (ya� < 12) {
                toplam = toplam / 2;

            } else if (ya� > 11 && ya� < 25) {
                System.out.println(toplamaral�k);

            } else if (ya� > 65) {
                System.out.println(toplamyasl�);
            } else {
                System.out.println(toplam);
            }

        }else if(y�n==2){
            System.out.println(2*toplam);
        }
        else {
            System.out.println("hatal� ");
        }*/

    }



