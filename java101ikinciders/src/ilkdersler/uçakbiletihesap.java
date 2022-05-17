package java101ikinciders.src.ilkdersler;

import  java.util.Scanner;

public class uçakbiletihesap {
    public static void main(String[] args) {

        int km;
        double kmperprice;
        int yaþ;
        int yön;
        kmperprice = 0.10;

        double toplam = 0, toplamoniki, toplamyaslý, toplamaralýk, toplamonikiçift, toplamaralýkçift, toplamyaslýçift;


        Scanner input = new Scanner(System.in);
        System.out.print("Gidilecek Km:");
        km = input.nextInt();

        System.out.print("Yolcu Yaþý: ");
        yaþ = input.nextInt();

        System.out.print("gidiþ tipi: ");
        yön = input.nextInt();
        boolean koþul = (yön == 1 || yön == 2);

        if (koþul) {
        } else {
            System.out.println("hatalý giriþ");
        }

        toplam = kmperprice * km;
        toplamoniki = (toplam / 2);
        toplamonikiçift=2*(toplamoniki-(toplamoniki*0.2));
        toplamaralýk = toplam - (toplam * 0.10);
        toplamaralýkçift=2*(toplamaralýk-(toplamaralýk*0.2));
        toplamyaslý = toplam - (toplam * 0.3);
        toplamyaslýçift=2*(toplamyaslý-(toplamyaslý*0.2));

        switch (yön) {
            case 1:
                if(yaþ>0 && km>0) {
                    if (yaþ < 12) {
                        System.out.println("bilet fiyatý:"+toplamoniki);
                    } else if (yaþ > 65) {
                        System.out.println("bilet fiyatý:"+toplamyaslý);
                    } else if (yaþ > 11 && yaþ < 25) {
                        System.out.println("bilet fiyatý:"+toplamaralýk);
                    } else if (yaþ > 24 && yaþ < 66)
                        System.out.println("bilet fiyatý:"+toplam);
                }else System.out.println("hatalý giriþ");
                break;

            case 2:
                if(yaþ>0 && km>0) {
                    if (yaþ < 12) {
                        System.out.println("bilet fiyatý:"+toplamonikiçift);
                    } else if (yaþ > 65) {
                        System.out.println("bilet fiyatý:"+toplamyaslýçift);
                    } else if (yaþ > 11 && yaþ < 25) {
                        System.out.println("bilet fiyatý:"+toplamaralýkçift);
                    } else if (yaþ > 24 && yaþ < 66)
                        System.out.println("bilet fiyatý:"+2*toplam);
                }else System.out.println("hatalý giriþ");
                break;

            }

        }
/*
        if (yön == 1) {
            if (yaþ < 12) {
                toplam = toplam / 2;

            } else if (yaþ > 11 && yaþ < 25) {
                System.out.println(toplamaralýk);

            } else if (yaþ > 65) {
                System.out.println(toplamyaslý);
            } else {
                System.out.println(toplam);
            }

        }else if(yön==2){
            System.out.println(2*toplam);
        }
        else {
            System.out.println("hatalý ");
        }*/

    }



