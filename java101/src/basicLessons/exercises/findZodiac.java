package java101ikinciders.src.basicLessons.exercises;

import java.util.Scanner;

public class findZodiac {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int day, month;
        String burc = ("");

        boolean iserror = false;


        System.out.println("Ay Giriniz : ");
        month = input.nextInt();

        System.out.println("G�n Giriniz : ");
        day = input.nextInt();

        switch (month) {

            case 1:
                if (day >= 1 && day <= 31) {
                    if (day <= 21) {
                        burc = "o�lak";
                    } else {
                        burc = "kova";
                    }
                }
                else  {iserror=true;
                }
                    break;
            case 2 :
                    if (day>=1 && day<=28) {
                        if (day < 20) {
                            burc = "kova";
                        } else {
                            burc = "bal�k";
                        }
                    }else{
                            iserror = true;
                        }break;

            case 3 :
                if (day>=1 && day<=31) {
                    if (day < 21) {
                        burc = "bal�k";
                    } else {
                        burc = "ko�";
                    }
                }else{
                    iserror = true;
                }break;

            case 4 :
                if (day>=1 && day<=30) {
                    if (day < 21) {
                        burc = "ko�";
                    } else {
                        burc = "bo�a";
                    }
                }else{
                    iserror = true;
                }break;

            case 5 :
                if (day>=1 && day<=31) {
                    if (day < 22) {
                        burc = "bo�a";
                    } else {
                        burc = "ikizler";
                    }
                }else{
                    iserror = true;
                }break;

            case 6 :
                if (day>=1 && day<=30) {
                    if (day < 23) {
                        burc = "ikizler";
                    } else {
                        burc = "yenge�";
                    }
                }else{
                    iserror = true;
                }break;

            case 7 :
                if (day>=1 && day<=31) {
                    if (day < 23) {
                        burc = "yenge�";
                    } else {
                        burc = "aslan";
                    }
                }else{
                    iserror = true;
                }break;

            case 8 :
                if (day>=1 && day<=31) {
                    if (day < 23) {
                        burc = "aslan";
                    } else {
                        burc = "ba�ak";
                    }
                }else{
                    iserror = true;
                }break;

            case 9 :
                if (day>=1 && day<=30) {
                    if (day < 23) {
                        burc = "ba�ak";
                    } else {
                        burc = "terazi";
                    }
                }else{
                    iserror = true;
                }break;

            case 10 :
                if (day>=1 && day<=31) {
                    if (day < 23) {
                        burc = "terazi";
                    } else {
                        burc = "akrep";
                    }
                }else{
                    iserror = true;
                }break;
            case 11 :
                if (day>=1 && day<=30) {
                    if (day < 22) {
                        burc = "akrep";
                    } else {
                        burc = "yay";
                    }
                }else{
                    iserror = true;
                }break;
            case 12 :
                if (day>=1 && day<=31) {
                    if (day < 22) {
                        burc = "yay";
                    } else {
                        burc = "o�lak";
                    }
                }else{
                    iserror = true;
                }break;

            default:
                iserror=true;
        }

                    if (iserror) {
                        System.out.println("Hatal� giri� yapt�n�z");
                    }else {
                        System.out.println("Burcunuz: "+burc);
        }
    }
}







