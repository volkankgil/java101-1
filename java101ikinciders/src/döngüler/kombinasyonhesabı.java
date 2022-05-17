package java101ikinciders.src.döngüler;
import java.util.Scanner;
public class kombinasyonhesabý {
    public static void main(String[] args) {
        //C(a,b)=a!/(b!*(a-b)!)

        Scanner input=new Scanner(System.in);

        System.out.print("ilk sayý: ");
        int a=input.nextInt();

        System.out.print("ikinci sayý: ");
        int  b=input.nextInt();
        int i=1;
        int totalbir=1;
        int totaliki=1;
        int totalüç=1;

        for (i=1;i<=a;i++){
            totalbir=totalbir*i;
        }
        System.out.println(totalbir);

        for (i=1;i<=b;i++){
            totaliki=totaliki*i;
        }
        System.out.println(totaliki);

        for (i=1;i<=(a-b);i++){
            totalüç*=i;
        }
        System.out.println(totalüç);

        System.out.println("C(a,b)= "+(totalbir/(totaliki*totalüç)));

    }
}
