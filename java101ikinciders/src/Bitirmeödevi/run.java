package java101ikinciders.src.Bitirmeödevi;

import java.util.Arrays;

public class run {
    public static void main(String[] args) {

        minesweeper mayýnoyunu = new minesweeper();
        mayýnoyunu.minesweeper(7, 8);

        System.out.println("%%%%%%%%%%%%%%");

        minesweeper mayýnoyunu2=new minesweeper();
        mayýnoyunu2.bomba(2,3);
    }

}
