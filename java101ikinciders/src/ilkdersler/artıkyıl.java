

package java101ikinciders.src.ilkdersler;

import java.util.Scanner;

public class art�ky�l {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Y�l Giriniz: ");
        int x = input.nextInt();

        boolean kosul1 = x % 4 == 0;
        boolean kosul2 = x % 400 == 0;

        if (kosul2 && x % 100 == 0) {
            System.out.println("art�k y�l");
        } else if (x % 100 != 0) {
            if (kosul1) {
                System.out.println("art�k y�l");
            } else{
                    System.out.println("art�k y�l de�il");
                }
            } else System.out.println("art�k y�l de�il");
        }
    }