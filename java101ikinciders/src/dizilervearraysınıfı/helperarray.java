package java101ikinciders.src.dizilervearrays�n�f�;

public class helperarray {
    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    void print(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");  //overloading method'un veri tipini int 'dan double 'a �evirdik.
        }
    }

    static void printfill(int[] fill, int value) {
        for (int i = 0; i < fill.length; i++) {
            fill[i] = value;
            System.out.print(fill[i] + ",");
        }
    }

    static int find(int[] finder, int value) {
        for (int i = 0; i < finder.length; i++) {
            if (finder[i] == value) {
                return i;
            }
        }
        return -1;
    }

  /*  static int copy(int[] listeler, int value) {
        int say�;
        if (value == say�) {
            for (int i = 0; i < listeler.length; i++) {
                return listeler[i];
                System.out.println(listeler[i]);
            }
        } else {
            return -1;
        }
    }*/  //��zemedim bak�lacak. binary seracrh � metodla yazma.

    static boolean equals(int[] list1, int[] list2) {   //int yerine boolean ifadeyi verdik. ��nk� sorgumuz true/false d�necektir.

        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i])
                return false;
        }
        return true;
    }
}