package java101ikinciders.src.Bitirme�devi;

import java.util.Arrays;

import java.util.Scanner;

public class run {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int rownumber, colnumber;

        System.out.print("Sat�r say�s�n� giriniz: ");
        rownumber=input.nextInt();
        System.out.print("Sut�n say�s�n� giriniz:");
        colnumber=input.nextInt();


        minesweeper may�noyunu = new minesweeper();
        may�noyunu.minesweeper(rownumber,colnumber);

        System.out.println("------------");

        minesweeper may�n=new minesweeper();
        may�n.prepareGame(rownumber,colnumber);
    }
}
