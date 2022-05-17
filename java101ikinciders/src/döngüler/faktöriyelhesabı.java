package java101ikinciders.src.döngüler;
import java.util.Scanner;

public class faktöriyelhesabý {
    public static void main(String[] args) {

        //n!=1*2*3*4*5*....*n

        Scanner input=new Scanner(System.in);
        System.out.print("sayý giriniz: ");
        int number=input.nextInt();

        int total=1;

        for(int i=1;i<=number;i++){
            System.out.println(i);
            total*=i;
        }
        System.out.println(total);

        System.out.println("-----");

        int result=1;   //while ile faktoriyel hesabý
        int b=1;
        while (b<=number){
            result=result*b;
            b++;
        }
        System.out.println(result);
    }
}
