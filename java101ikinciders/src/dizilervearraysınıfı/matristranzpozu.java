package java101ikinciders.src.dizilervearraysýnýfý;

import java.util.Arrays;

public class matristranzpozu {
    public static void main(String[] args) {

        int[][] list = {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9},
        };

        for (int i=0;i<list.length;i++){
            for (int j=0;j<list[0].length;j++){
                System.out.print(list[j][i]+" ");
            }
            System.out.println(" ");
        }
    }
}
