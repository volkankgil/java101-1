package java101ikinciders.src.Arrays.exercises;

public class matristraspoz {

    static void transpoz(int[][] arr) {
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {


        int[][] list = {{1, 2, 3, 4, 5, 6},
                {6, 7, 8, 9, 10, 12},
                {10, 11, 12, 13, 14, 15}

        };

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                System.out.print(list[i][j] + " ");

            }
            System.out.println(" ");

        }

        int newrow = list[0].length;
        int newcol = list.length;

        System.out.println("----------------");

        for (int i = 0; i < newrow; i++) {
            for (int j = 0; j < newcol; j++) {
                System.out.print(list[j][i] + " ");
            }
            System.out.println(" ");

        }

        System.out.println("*************");

        transpoz(list);
    }
}
