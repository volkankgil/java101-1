package java101ikinciders.src.Bitirmeödevi;

import java.util.Scanner;

import  java.util.Arrays;

import java.util.Random;

public class minesweeper {

    int row,col;
    String list[][] = new String[row][col];

     void minesweeper(int row,int col) {
         String list[][] = new String[row][col];
         for (int i = 0; i<list.length; i++) {
             for (int j = 0; j<list[0].length; j++) {
                 System.out.print("-" + " ");
             }
             System.out.println("");
         }
     }

    void bomba (int row,int col) {



        double mayýnlar=1;
        mayýnlar=list.length*list[0].length;
        System.out.println(Math.round(mayýnlar/4));

        for (int i = 0; i<mayýnlar; i++) {
            while (true) {
                int d = (int)Math.random() * list.length;
                int e = (int) Math.random() * list[0].length;
                if (list[e][d] != "*") {
                    list[e][d] = "*";
                }
            }
        }

        double c=Math.random()*10*list.length;
        System.out.println(Math.round(c));
    }
}
