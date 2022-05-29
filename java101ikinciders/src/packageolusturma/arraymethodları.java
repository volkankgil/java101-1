package java101ikinciders.src.packageolusturma;

import java.util.Arrays;

public class arraymethodlarý {
    public static void main(String[] args) {
        int[] liste = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};
        int[] list2={6,1,55,28,85};
        int[] list3={6,1,55,28,85};

        System.out.println(helperarray.find(liste,33));//helperarray sýnýfýnda yazdýðýmýz method ile sayýnýn indis deðerini bulduk.

        System.out.println("");

        Arrays.sort(liste);
        System.out.println(Arrays.toString(liste));
        System.out.println(Arrays.binarySearch(liste,-21));

        int[] copyliste= Arrays.copyOf(liste,2);
        System.out.println(Arrays.toString(copyliste));

        int[] copyliste2=Arrays.copyOf(liste,liste.length); //bu þekilde liste uzunluðu olarak yazar isek bütün diziyi kopyalar.
        System.out.println(Arrays.toString(copyliste2));

        System.out.println("");

        int[]copylist3=Arrays.copyOfRange(liste,2,4);
        System.out.println(Arrays.toString(copylist3));

        System.out.println("");

        System.out.println(Arrays.equals(list2,list3));
        System.out.println(Arrays.equals(liste,list2));

        System.out.println("");

        System.out.println(helperarray.equals(list2,list3));

        System.out.println("");

       // System.out.println(helperarray.liste,5));

    }
}
