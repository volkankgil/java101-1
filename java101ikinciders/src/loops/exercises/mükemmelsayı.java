package java101ikinciders.src.loops.exercises;

import java.util.Scanner;

public class mükemmelsayý {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Bir sayý giriniz: ");
        int n =input.nextInt();

        int sum=0;

        for(int i=1;i<n;i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        if (sum==n){
            System.out.println("mükemmel sayýdýr.");
        }else{
            System.out.println("mükemmel sayý deðildir. ");
        }
    }
}
