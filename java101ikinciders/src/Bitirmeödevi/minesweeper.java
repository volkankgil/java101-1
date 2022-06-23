package java101ikinciders.src.Bitirmeödevi;

import java.util.Random;
import java.util.Scanner;

public class minesweeper {

    int rownumber, colnumber;

    int mayınlar;
    int bomb = 0;
    String map[][] = new String[rownumber][colnumber];
    String bombboard[][] = new String[rownumber][colnumber];

    Random rand = new Random();
    Scanner input = new Scanner(System.in);

    public void minesweeper(int rownumber, int colnumber) {

        String map[][] = new String[rownumber][colnumber];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                System.out.print("-" + " ");
            }
            System.out.println(" ");
        }
    }


    public void prepareGame(int rownumber, int colnumber) {

        String bombboard[][] = new String[rownumber][colnumber];

        mayınlar = (int)((rownumber * colnumber) / 4);

        while (mayınlar != bomb) {
            int randomrow = (int) rand.nextInt(rownumber);
            int randomcol = (int) rand.nextInt(colnumber);
            if (bombboard[randomrow][randomcol] != "*") {
                bombboard[randomrow][randomcol] = "*";
                bomb++;
            }
        }

        for (int i = 0; i < bombboard.length; i++) {
            for (int j = 0; j < bombboard[0].length; j++) {
                if (bombboard[i][j] != "*") { // ile yıldız olmayan yerlere - bastık
                bombboard[i][j] = "-";
            }
            System.out.print(bombboard[i][j] + " ");
        }
        System.out.println();
        }
    }
}

