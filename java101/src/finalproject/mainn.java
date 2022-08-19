package java101.src.finalproject;

import java.util.*;

public class mainn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userRowNumber, userColNumber, userRow, userCol ;
        String[][] gameTable ;
        boolean gameStatus = true;
        int counter = 0;

        System.out.println("MAYIN TARLASINA HOSGELDINIZ !!!");
        System.out.println("\nLütfen tablonun satir sayisini giriniz : ");
        userRowNumber = input.nextInt();
        System.out.println("\nLütfen tablonun sütun sayisini giriniz : ");
        userColNumber = input.nextInt();
        System.out.println();

        MineSweeperr game = new MineSweeperr(userRowNumber, userColNumber);
        gameTable = game.table();
        game.printTable(gameTable);
        counter = game.mineNumber*3;
        while(gameStatus){
            System.out.println("Satir giriniz : ");
            userRow = input.nextInt();
            System.out.println("Sutun giriniz : ");
            userCol = input.nextInt();
            if (userRow >= userRowNumber || userCol >= userColNumber) {
                System.out.println("Hatali giris yaptiniz. Lütfen tablonun sinirlari icerisinde bir deger giriniz !!!\n");
            }else {
                if(game.isMine(gameTable, userRow, userCol)){
                    gameStatus = false;
                    System.out.println("MAYINE BASTINIZ OYUN BITTI !!!");
                }else{
                    game.isEmpty(gameTable, userRow, userCol);
                    game.printTable(gameTable);
                    counter--;
                    if (counter == 0) {
                        System.out.println("OYUNU KAZANDINIZ !!!");
                        gameStatus =false;
                    }
                }
            }
        }
    }
}