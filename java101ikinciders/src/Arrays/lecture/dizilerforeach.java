package java101ikinciders.src.Arrays.lecture;

public class dizilerforeach {
    public static void main(String[] args) {

        int list[] = {1, 2, 3, 4};


        for (int i = 0; i < list.length; i++) {
            //System.out.println(list[i]);
        }

        int sum = 0;

        for (int i : list) {
            //System.out.println(i);
            sum += i;
        }
        System.out.println(sum);

        String str[] = new String[]{"audi", "bmw", "mercedes"};
        for (String a : str) {
            System.out.println(a);
        }

        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        for (int i = 0; i < matris.length; i++) {
            for (int k = 0; k < matris[i].length; k++) {
                System.out.print(matris[i][k] + " ");
            }
            System.out.println("");
        }

        for (int []  satýr : matris) {
            for (int kolon : satýr) {
                System.out.print(kolon + " ");
            }
            System.out.println(" ");
        }
    }
}
