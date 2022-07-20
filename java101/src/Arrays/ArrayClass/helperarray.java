package java101ikinciders.src.Arrays.ArrayClass;

public class helperarray {
    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    void print(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");  //overloading method'un veri tipini int 'dan double 'a çevirdik.
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
                System.out.println(i);
                return i;
            }
        }
        return -1;
    }

  /*  static int copy(int[] listeler, int value) {
        int sayı;
        if (value == sayı) {
            for (int i = 0; i < listeler.length; i++) {
                return listeler[i];
                System.out.println(listeler[i]);
            }
        } else {
            return -1;
        }
    }*/  //çözemedim bakılacak. binary seracrh ü metodla yazma.

    static boolean equals(int[] list1, int[] list2) {   //int yerine boolean ifadeyi verdik. çünkü sorgumuz true/false dönecektir.

        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                System.out.println("false");
                return false;
            }
        }
        System.out.println("true");
        return true;
    }
    static void copy(int [] arr,int value){
        for(int i=0;i<value;i++){
            System.out.println(arr[i]);
        }
    }

}