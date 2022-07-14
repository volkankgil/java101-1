package java101ikinciders.src.basicLessons.exercises;

import  java.util.Scanner;

public class PlaneticketCalculation {
    public static void main(String[] args) {

        int km;
        double kmperprice;
        int age;
        int wayType;
        kmperprice = 0.10;

        double toplam = 0, toplamoniki, toplamyaslı, toplamaralık, toplamonikiçift, toplamaralıkçift, toplamyaslıçift;


        Scanner input = new Scanner(System.in);
        System.out.print("Gidilecek Km:");
        km = input.nextInt();

        System.out.print("Yolcu Yaşı: ");
        age = input.nextInt();

        System.out.print("Gidiş Tipi: ");
        wayType = input.nextInt();

        toplam = kmperprice * km;

        toplamoniki = (toplam / 2);
        toplamonikiçift=2*(toplamoniki-(toplamoniki*0.2));

        toplamaralık = toplam - (toplam * 0.10);
        toplamaralıkçift=2*(toplamaralık-(toplamaralık*0.2));

        toplamyaslı = toplam - (toplam * 0.3);
        toplamyaslıçift=2*(toplamyaslı-(toplamyaslı*0.2));

        switch (wayType) {
            case 1:
                if(age >0 && km>0) {
                    if (age < 12) {
                        System.out.println("Bilet fiyatı:"+toplamoniki);
                    } else if (age > 65) {
                        System.out.println("Bilet fiyatı:"+toplamyaslı);
                    } else if (age > 11 && age < 25) {
                        System.out.println("Bilet fiyatı:"+toplamaralık);
                    } else if (age > 24 && age < 66)
                        System.out.println("Bilet fiyatı:"+toplam);
                }else System.out.println("Hatalı Giriş");
                break;

            case 2:
                if(age >0 && km>0) {
                    if (age < 12) {
                        System.out.println("Bilet fiyatı:"+toplamonikiçift);
                    } else if (age > 65) {
                        System.out.println("Bilet fiyatı:"+toplamyaslıçift);
                    } else if (age > 11 && age < 25) {
                        System.out.println("Bilet fiyatı:"+toplamaralıkçift);
                    } else if (age > 24 && age < 66)
                        System.out.println("bilet fiyatı:"+2*toplam);
                }else System.out.println("Hatalı Giriş");
                break;
            default:
                System.out.println("Hatalı Giriş");
            }

        }
    }



