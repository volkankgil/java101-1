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

        System.out.println("Gün Giriniz : ");
        day = input.nextInt();

        switch (month) {

            case 1:
                if (day >= 1 && day <= 31) {
                    if (day <= 21) {
                        burc = "oğlak";
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
                            burc = "balık";
                        }
                    }else{
                            iserror = true;
                        }break;

            case 3 :
                if (day>=1 && day<=31) {
                    if (day < 21) {
                        burc = "balık";
                    } else {
                        burc = "koç";
                    }
                }else{
                    iserror = true;
                }break;

            case 4 :
                if (day>=1 && day<=30) {
                    if (day < 21) {
                        burc = "koç";
                    } else {
                        burc = "boğa";
                    }
                }else{
                    iserror = true;
                }break;

            case 5 :
                if (day>=1 && day<=31) {
                    if (day < 22) {
                        burc = "boğa";
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
                        burc = "yengeç";
                    }
                }else{
                    iserror = true;
                }break;

            case 7 :
                if (day>=1 && day<=31) {
                    if (day < 23) {
                        burc = "yengeç";
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
                        burc = "başak";
                    }
                }else{
                    iserror = true;
                }break;

            case 9 :
                if (day>=1 && day<=30) {
                    if (day < 23) {
                        burc = "başak";
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
                        burc = "oğlak";
                    }
                }else{
                    iserror = true;
                }break;

            default:
                iserror=true;
        }

                    if (iserror) {
                        System.out.println("Hatalı giriş yaptınız");
                    }else {
                        System.out.println("Burcunuz: "+burc);
        }
    }
}







