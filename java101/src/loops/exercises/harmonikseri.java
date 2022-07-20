package java101ikinciders.src.loops.exercises;

import java.util.Scanner;

public class harmonikseri {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("N sayýsýný giriniz: ");
        int n=input.nextInt();

        double sum=0;

        for(double i=1;i<=n;i++){
            sum+=(1/i);
        }
        System.out.println(sum);

    }
}
