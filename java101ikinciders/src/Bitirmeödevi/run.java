package java101ikinciders.src.Bitirmeödevi;

import java.util.Arrays;

import java.util.Scanner;

public class run {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int rownumber, colnumber;

        System.out.print("Satýr sayýsýný giriniz: ");
        rownumber=input.nextInt();
        System.out.print("Sutün sayýsýný giriniz:");
        colnumber=input.nextInt();


        minesweeper mayýnoyunu = new minesweeper();
        mayýnoyunu.minesweeper(rownumber,colnumber);

        System.out.println("------------");

        minesweeper mayýn=new minesweeper();
        mayýn.prepareGame(rownumber,colnumber);
    }
}
