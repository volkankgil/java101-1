package java101ikinciders.src.loops.exercises;

import java.util.Scanner;

public class �salma {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("alttaki say�s� giriniz:");
        int a=input.nextInt();

        System.out.print("�stteki say�y� giriniz:");
        int �=input.nextInt();

        /*
        int i=1;
        int total=1;

        while (i<=�){
            total*=a;
            System.out.println(total);//d�ng� i�inde bast�rd���m i�in ayr�nt�da veriyor.
            i++;
        }
        System.out.println("Cevab�n�z: "+total);*/
        int total = 1;
        for(int i =1;i<=�;i++){
                    total*=a;
        }
        System.out.println("Cevab�n�z:"+total);


    }



}
