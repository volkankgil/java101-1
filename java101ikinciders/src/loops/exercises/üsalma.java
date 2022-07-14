package java101ikinciders.src.loops.exercises;

import java.util.Scanner;

public class üsalma {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("alttaki sayýsý giriniz:");
        int a=input.nextInt();

        System.out.print("Üstteki sayýyý giriniz:");
        int ü=input.nextInt();

        /*
        int i=1;
        int total=1;

        while (i<=ü){
            total*=a;
            System.out.println(total);//döngü içinde bastýrdýðým için ayrýntýda veriyor.
            i++;
        }
        System.out.println("Cevabýnýz: "+total);*/
        int total = 1;
        for(int i =1;i<=ü;i++){
                    total*=a;
        }
        System.out.println("Cevabýnýz:"+total);


    }



}
