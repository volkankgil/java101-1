package java101ikinciders.src.ilkdersler;

import java.util.Scanner;

public class �inzodyak {
    public static void main(String[] args) {

        int do�umtarihi;


        Scanner input = new Scanner(System.in);

        System.out.println("do�um tarihi giriniz: ");
        do�umtarihi = input.nextInt();

       /* int kalan = do�umtarihi % 12;

        switch (kalan) {

            case 0:
                System.out.print("maymun");
                break;

            case 1:
                System.out.println("horoz");
                break;

            case 2:
                System.out.println("k�pek");
                break;

            case 3:
                System.out.println("domuz");
                break;

            case 4:
                System.out.println("fare");
                break;

            case 5:
                System.out.println("�k�z");
                break;

            case 6:
                System.out.println("kaplan");
                break;

            case 7:
                System.out.println("tav�an");
                break;

            case 8:
                System.out.println("ejdarha");
                break;

            case 9:
                System.out.println("y�lan");
                break;

            case 10:
                System.out.println("at");
                break;

            case 11:
                System.out.println("koyun");
                break;
        }*/

        int kalan;
        kalan = do�umtarihi % 12;

        if (kalan == 0) {
            System.out.println("maymun");
        } else if (kalan == 1) {
            System.out.println("horoz");
        } else if (kalan == 2) {
            System.out.println("k�pek");
        } else if (kalan == 3) {
            System.out.println("domuz");
        } else if (kalan == 4) {
            System.out.println("fare");
        } else if (kalan == 5) {
            System.out.println("�k�z");
        }else if (kalan == 6) {
            System.out.println("kaplan");
        }else if (kalan == 7) {
            System.out.println("tav�an");
        }else if (kalan == 8) {
            System.out.println("ejderha");
        }else if (kalan == 9) {
            System.out.println("y�lan");
        }else if (kalan == 10) {
            System.out.println("at");
        }else if (kalan ==11) {
            System.out.println("koyun");


                                }
                            }
                        }
