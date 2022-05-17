

package java101ikinciders.src.ilkdersler;

import java.util.Scanner;

public class artýkyýl {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Yýl Giriniz: ");
        int x = input.nextInt();

        boolean kosul1 = x % 4 == 0;
        boolean kosul2 = x % 400 == 0;

        if (kosul2 && x % 100 == 0) {
            System.out.println("artýk yýl");
        } else if (x % 100 != 0) {
            if (kosul1) {
                System.out.println("artýk yýl");
            } else{
                    System.out.println("artýk yýl deðil");
                }
            } else System.out.println("artýk yýl deðil");
        }
    }