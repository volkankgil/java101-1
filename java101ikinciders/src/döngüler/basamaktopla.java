package java101ikinciders.src.d�ng�ler;

import java.util.Scanner;

public class basamaktopla {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number ;
        int basamak;
        System.out.println("De�er Giriniz: ");

        number=input.nextInt();

        int result=0;
        while(number!=0){
            basamak=number%10;
            number/=10;
            System.out.println(basamak);
            result+=basamak;

        } System.out.println("basamak toplam�:"+result);
    }
}
