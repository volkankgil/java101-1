package java101ikinciders.src.loops.exercises;

import java.util.Scanner;

public class d�rtkatlar�vetoplam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       /* int a;
        int toplam = 0;


        do {
            System.out.print("De�er giriniz: ");
            a = input.nextInt();

            if (a % 4 == 0) {
                toplam += a;

            }
        }while (a % 2 == 0) ;

            System.out.println(toplam);*/

        int a;

        System.out.print("de�er giriniz: ");
        a = input.nextInt();
        int say� = 0;

        for (int i = 0; i<=a;i++) {
            if (i%3==0){
                if (i%4==0)
                    System.out.println(i);

                /*int k;
                System.out.println("De�er Giriniz: ");
                k=input.nextInt();

                for(int i=0;i<=k;i++){
                    if((i % 3 ==0) && (i % 4==0)){
                        System.out.println(i);
                    }*/
            }


        }
    }
}






