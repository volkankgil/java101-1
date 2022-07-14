package java101ikinciders.src.finalproject;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    String[][] mayinlar;
    String[][] girilen;
    private int rowNumber, colNumber, mayinSayisi;

    public MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        mayinSayisi = (rowNumber * colNumber) / 4;

        mayinlar = new String[rowNumber][colNumber];
        girilen = new String[rowNumber][colNumber];

        mayinDoldur(mayinlar, rowNumber, colNumber, mayinSayisi);
        print(mayinlar);

        game(mayinlar, girilen, rowNumber, colNumber, mayinSayisi);
        print(girilen);
    }

    public String[][] mayinDoldur(String[][] mayinlar, int rowNumber, int colNumber, int mayinSayisi) {
        int randomX, randomY;
        Random random = new Random();
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                mayinlar[i][j] = "-";
            }
        }
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                randomX = random.nextInt(rowNumber);
                randomY = random.nextInt(colNumber);
                if (!mayinlar[randomX][randomY].equals("*") && mayinSayisi != 0) {
                    mayinlar[randomX][randomY] = "*";
                    mayinSayisi--;
                }
            }
        }
        return mayinlar;
    }

    public String[][] boslukDoldur(String[][] girilen, int rowNumber, int colNumber) {
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                girilen[i][j] = "-";
            }
        }
        return girilen;
    }

    public void print(String[][] mayinlar) {
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                System.out.print(mayinlar[i][j] + "   ");
            }
            System.out.println();
        }
        System.out.println("============================================");
    }

    public void game(String[][] mayinlar, String[][] girilen, int rowNumber, int colNumber, int mayinSayisi) {
        girilen = boslukDoldur(girilen, rowNumber, colNumber);

        int satir, sutun;
        int mayinliIsaret = 0;
        int kalanBosluk = (rowNumber * colNumber) - mayinSayisi;
        Scanner scanner = new Scanner(System.in);
        while (kalanBosluk > 0) {
            System.out.print("Satir numarasini giriniz: ");
            satir = scanner.nextInt();
            satir -= 1;
            if (satir < 0 || satir > (rowNumber - 1)) {
                System.out.println("Gecersiz bir satir girdiniz.");
                continue;
            }

            System.out.print("Sutun numarasini giriniz: ");
            sutun = scanner.nextInt();
            sutun -= 1;
            if (sutun < 0 || sutun > (rowNumber - 1)) {
                System.out.println("Gecersiz bir sutun girdiniz.");
                continue;
            }
            if(!(girilen[satir][sutun].equals("-"))){
                System.out.println("Daha once girilen alan!..");
                continue;
            }

            if (satir == 0) {
                if (sutun == 0) {
                    if (mayinlar[satir][sutun].equals("*")) {
                        System.out.println("Oyunu kaybettiniz");
                        break;
                    }
                    if (mayinlar[satir][sutun + 1].equals("*")) {
                        mayinliIsaret++;
                    }
                    if (mayinlar[satir + 1][sutun].equals("*")) {
                        mayinliIsaret++;
                    }
                    if (mayinlar[satir + 1][sutun + 1].equals("*")) {
                        mayinliIsaret++;
                    }
                    girilen[satir][sutun] = String.valueOf(mayinliIsaret);
                    print(girilen);
                    mayinliIsaret = 0;
                    kalanBosluk--;
                    continue;
                } else if (sutun == (colNumber - 1)) {
                    if (mayinlar[satir][sutun].equals("*")) {
                        System.out.println("Oyunu kaybettiniz");
                        break;
                    }
                    if (mayinlar[satir][sutun - 1].equals("*")) {
                        mayinliIsaret++;
                    }
                    if (mayinlar[satir + 1][sutun - 1].equals("*")) {
                        mayinliIsaret++;
                    }
                    if (mayinlar[satir + 1][sutun].equals("*")) {
                        mayinliIsaret++;
                    }
                    girilen[satir][sutun] = String.valueOf(mayinliIsaret);
                    print(girilen);
                    mayinliIsaret = 0;
                    kalanBosluk--;
                    continue;
                } else if (sutun > 0 && sutun < (colNumber - 1)) {
                    if (mayinlar[satir][sutun].equals("*")) {
                        System.out.println("Oyunu kaybettiniz");
                        break;
                    }
                    if (mayinlar[satir][sutun - 1].equals("*")) {
                        mayinliIsaret++;
                    }
                    if (mayinlar[satir + 1][sutun - 1].equals("*")) {
                        mayinliIsaret++;
                    }
                    if (mayinlar[satir + 1][sutun].equals("*")) {
                        mayinliIsaret++;
                    }
                    if (mayinlar[satir + 1][sutun + 1].equals("*")) {
                        mayinliIsaret++;
                    }
                    if (mayinlar[satir][sutun + 1].equals("*")) {
                        mayinliIsaret++;
                    }
                    girilen[satir][sutun] = String.valueOf(mayinliIsaret);
                    print(girilen);
                    mayinliIsaret = 0;
                    kalanBosluk--;
                    continue;
                }
            } else if (satir == (rowNumber - 1)) {
                if (sutun == 0) {
                    if (mayinlar[satir][sutun].equals("*")) {
                        System.out.println("Oyunu kaybettiniz");
                        break;
                    }
                    if (mayinlar[satir - 1][sutun].equals("*")) {
                        mayinliIsaret++;
                    }
                    if (mayinlar[satir - 1][sutun + 1].equals("*")) {
                        mayinliIsaret++;
                    }
                    if (mayinlar[satir][sutun + 1].equals("*")) {
                        mayinliIsaret++;
                    }
                    girilen[satir][sutun] = String.valueOf(mayinliIsaret);
                    print(girilen);
                    mayinliIsaret = 0;
                    kalanBosluk--;
                    continue;
                } else if (sutun == (colNumber - 1)) {
                    if (mayinlar[satir][sutun].equals("*")) {
                        System.out.println("Oyunu kaybettiniz");
                        break;
                    }
                    if (mayinlar[satir][sutun - 1].equals("*")) {
                        mayinliIsaret++;
                    }
                    if (mayinlar[satir - 1][sutun - 1].equals("*")) {
                        mayinliIsaret++;
                    }
                    if (mayinlar[satir - 1][sutun].equals("*")) {
                        mayinliIsaret++;
                    }
                    girilen[satir][sutun] = String.valueOf(mayinliIsaret);
                    print(girilen);
                    mayinliIsaret = 0;
                    kalanBosluk--;
                    continue;
                } else if (sutun > 0 && sutun < (colNumber - 1)) {
                    if (mayinlar[satir][sutun].equals("*")) {
                        System.out.println("Oyunu kaybettiniz");
                        break;
                    }

                    if (mayinlar[satir][sutun - 1].equals("*")) {
                        mayinliIsaret++;
                    }
                    if (mayinlar[satir - 1][sutun - 1].equals("*")) {
                        mayinliIsaret++;
                    }
                    if (mayinlar[satir - 1][sutun].equals("*")) {
                        mayinliIsaret++;
                    }
                    if (mayinlar[satir - 1][sutun + 1].equals("*")) {
                        mayinliIsaret++;
                    }
                    if (mayinlar[satir][sutun + 1].equals("*")) {
                        mayinliIsaret++;
                    }
                    girilen[satir][sutun] = String.valueOf(mayinliIsaret);
                    print(girilen);
                    mayinliIsaret = 0;
                    kalanBosluk--;
                    continue;
                }
            } else if (satir > 0 && satir < (rowNumber - 1)) {
                if (sutun == 0) {
                    if (mayinlar[satir][sutun].equals("*")) {
                        System.out.println("Oyunu kaybettiniz");
                        break;
                    }
                    if (mayinlar[satir - 1][sutun].equals("*")) {
                        mayinliIsaret++;
                    }
                    if (mayinlar[satir - 1][sutun + 1].equals("*")) {
                        mayinliIsaret++;
                    }
                    if (mayinlar[satir][sutun + 1].equals("*")) {
                        mayinliIsaret++;
                    }
                    if (mayinlar[satir + 1][sutun + 1].equals("*")) {
                        mayinliIsaret++;
                    }
                    if (mayinlar[satir + 1][sutun].equals("*")) {
                        mayinliIsaret++;
                    }
                    girilen[satir][sutun] = String.valueOf(mayinliIsaret);
                    print(girilen);
                    mayinliIsaret = 0;
                    kalanBosluk--;
                    continue;
                } else if (sutun == (colNumber - 1)) {
                    if (mayinlar[satir][sutun].equals("*")) {
                        System.out.println("Oyunu kaybettiniz");
                        break;
                    }
                    if (mayinlar[satir - 1][sutun].equals("*")) {
                        mayinliIsaret++;
                    }
                    if (mayinlar[satir - 1][sutun - 1].equals("*")) {
                        mayinliIsaret++;
                    }
                    if (mayinlar[satir][sutun - 1].equals("*")) {
                        mayinliIsaret++;
                    }
                    if (mayinlar[satir + 1][sutun - 1].equals("*")) {
                        mayinliIsaret++;
                    }
                    if (mayinlar[satir + 1][sutun].equals("*")) {
                        mayinliIsaret++;
                    }
                    girilen[satir][sutun] = String.valueOf(mayinliIsaret);
                    print(girilen);
                    mayinliIsaret = 0;
                    kalanBosluk--;
                    continue;
                } else if (sutun > 0 && sutun < (colNumber - 1)) {
                    if (mayinlar[satir][sutun].equals("*")) {
                        System.out.println("Oyunu kaybettiniz");
                        break;
                    }
                    if (mayinlar[satir][sutun - 1].equals("*")) {
                        mayinliIsaret++;
                    }
                    if (mayinlar[satir - 1][sutun - 1].equals("*")) {
                        mayinliIsaret++;
                    }
                    if (mayinlar[satir - 1][sutun].equals("*")) {
                        mayinliIsaret++;
                    }
                    if (mayinlar[satir - 1][sutun + 1].equals("*")) {
                        mayinliIsaret++;
                    }
                    if (mayinlar[satir][sutun + 1].equals("*")) {
                        mayinliIsaret++;
                    }
                    if (mayinlar[satir + 1][sutun + 1].equals("*")) {
                        mayinliIsaret++;
                    }
                    if (mayinlar[satir + 1][sutun].equals("*")) {
                        mayinliIsaret++;
                    }
                    if (mayinlar[satir + 1][sutun - 1].equals("*")) {
                        mayinliIsaret++;
                    }
                    girilen[satir][sutun] = String.valueOf(mayinliIsaret);
                    print(girilen);
                    mayinliIsaret = 0;
                    kalanBosluk--;
                    continue;
                }
            }
        }
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                if (girilen[i][j].equals("-")) {
                    girilen[i][j] = "*";
                }
            }
        }
        if (kalanBosluk == 0) System.out.println("Tebrikler oyunu kazandiniz!!... :)");
    }
}