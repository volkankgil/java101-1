package java101ikinciders.src.d�ng�ler;
import java.util.Scanner;

public class fakt�riyelhesab� {
    public static void main(String[] args) {

        //n!=1*2*3*4*5*....*n

        Scanner input=new Scanner(System.in);
        System.out.print("say� giriniz: ");
        int number=input.nextInt();

        int total=1;

        for(int i=1;i<=number;i++){
            System.out.println(i);
            total*=i;
        }
        System.out.println(total);

        System.out.println("-----");

        int result=1;   //while ile faktoriyel hesab�
        int b=1;
        while (b<=number){
            result=result*b;
            b++;
        }
        System.out.println(result);
    }
}
