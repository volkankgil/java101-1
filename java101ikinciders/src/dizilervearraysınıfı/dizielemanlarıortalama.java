package java101ikinciders.src.dizilervearrays�n�f�;

import java.util.Arrays;

public class dizielemanlar�ortalama {
    public static void main(String[] args) {

        double list[] = {5, 10, 15, 115, 25,20};

        System.out.println(Arrays.toString(list));

        double sum =0;
        for(int i=0;i<list.length;i++){
            System.out.println(list[i] + "");
            sum+=list[i];
        }
        System.out.println("Dizi say�lar� ortalama :" + (sum/ list.length));

        double sumiki =0;

        for(int i=0;i<list.length;i++){
            sumiki+=1/ list[i];
        }
        System.out.println("Harmonik Ortalama :"+list.length/sumiki);




    }
}
