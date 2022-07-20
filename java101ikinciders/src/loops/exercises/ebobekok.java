package java101ikinciders.src.loops.exercises;

import java.util.Scanner;

public class ebobekok {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Birinci sayýyý giriniz: ");
        int a = input.nextInt();

        System.out.println("Ýkinci Sayýyý Giriniz: ");
        int b = input.nextInt();

        int ebob = 2;       //java: variable ebob might not have been initialized uyarýsý verdiði için deðer atýyoruz.
        int ebob2 = 3;

        int n1;

        if(a<b){
            n1=b;
        }else {
            n1=a;
        }

        for (int i = 1; i <= n1; i++) {
            if (a % i == 0 && b % i == 0) {
                ebob = i;
            }
        }
        System.out.println("Ebob"+ebob);

        for (int k = b; k > 0; k--) {           //2. yapýlýþ biçimidir.
            if (a % k == 0 && b % k == 0) {
                ebob2 = k;
                break;
            }
        }
        System.out.println("ebob"+ebob2);

        System.out.println("-------------");

        for (int l = 1; l <= a * b; l++) {
            if (l % a == 0 && l % b == 0) {
                System.out.println("ekok"+l);
                break;
            }
        }

        int c = 0;

        while (c < a) {
            c++;
            if (a % c == 0 && b % c == 0) {
                ebob = c;
            }
        }
        System.out.println(ebob);

        int d=0;
        while (d<b*a){
            d++;
            if ( d%b==0 && d%a==0){
                System.out.println("ekok"+d);
                break;
            }
        }
    }
}
