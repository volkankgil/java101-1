package java101ikinciders.src.basicLessons.exercises;

import  java.util.Scanner;

public class PlaneticketCalculation {
    public static void main(String[] args) {

        int km;
        double kmperprice;
        int age;
        int wayType;
        kmperprice = 0.10;

        double toplam = 0, toplamoniki, toplamyasl�, toplamaral�k, toplamoniki�ift, toplamaral�k�ift, toplamyasl��ift;


        Scanner input = new Scanner(System.in);
        System.out.print("Gidilecek Km:");
        km = input.nextInt();

        System.out.print("Yolcu Ya��: ");
        age = input.nextInt();

        System.out.print("Gidi� Tipi: ");
        wayType = input.nextInt();

        toplam = kmperprice * km;

        toplamoniki = (toplam / 2);
        toplamoniki�ift=2*(toplamoniki-(toplamoniki*0.2));

        toplamaral�k = toplam - (toplam * 0.10);
        toplamaral�k�ift=2*(toplamaral�k-(toplamaral�k*0.2));

        toplamyasl� = toplam - (toplam * 0.3);
        toplamyasl��ift=2*(toplamyasl�-(toplamyasl�*0.2));

        switch (wayType) {
            case 1:
                if(age >0 && km>0) {
                    if (age < 12) {
                        System.out.println("Bilet fiyat�:"+toplamoniki);
                    } else if (age > 65) {
                        System.out.println("Bilet fiyat�:"+toplamyasl�);
                    } else if (age > 11 && age < 25) {
                        System.out.println("Bilet fiyat�:"+toplamaral�k);
                    } else if (age > 24 && age < 66)
                        System.out.println("Bilet fiyat�:"+toplam);
                }else System.out.println("Hatal� Giri�");
                break;

            case 2:
                if(age >0 && km>0) {
                    if (age < 12) {
                        System.out.println("Bilet fiyat�:"+toplamoniki�ift);
                    } else if (age > 65) {
                        System.out.println("Bilet fiyat�:"+toplamyasl��ift);
                    } else if (age > 11 && age < 25) {
                        System.out.println("Bilet fiyat�:"+toplamaral�k�ift);
                    } else if (age > 24 && age < 66)
                        System.out.println("bilet fiyat�:"+2*toplam);
                }else System.out.println("Hatal� Giri�");
                break;
            default:
                System.out.println("Hatal� Giri�");
            }

        }
    }



