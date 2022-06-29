package java101ikinciders.src.Bitirmeödevi;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Oyun buyuklugunu giriniz");
        Scanner scanner = new Scanner(System.in);
        int rowNumber = 2;
        int colNumber = 2;
        do {
            System.out.print("Satir buyuklugunu giriniz:");
            rowNumber = scanner.nextInt();
            if (rowNumber < 3) {
                System.out.println("Lutfen satir buyuklugunu 3'ten buyuk giriniz..");
                System.out.println("==============================================");
                continue;
            }
            System.out.print("Sutun buyuklugunu giriniz:");
            colNumber = scanner.nextInt();
            if (colNumber < 3) {
                System.out.println("Lutfen sutun buyuklugunu 3'ten buyuk giriniz..");
                System.out.println("==============================================");
                continue;
            }
        } while (rowNumber < 3 || colNumber < 3);
        MineSweeper mineSweeper = new MineSweeper(rowNumber, colNumber);
    }
}