package java101ikinciders.src.d�ng�ler;
import java.util.Scanner;
public class kombinasyonhesab� {
    public static void main(String[] args) {
        //C(a,b)=a!/(b!*(a-b)!)

        Scanner input=new Scanner(System.in);

        System.out.print("ilk say�: ");
        int a=input.nextInt();

        System.out.print("ikinci say�: ");
        int  b=input.nextInt();
        int i=1;
        int totalbir=1;
        int totaliki=1;
        int total��=1;

        for (i=1;i<=a;i++){
            totalbir=totalbir*i;
        }
        System.out.println(totalbir);

        for (i=1;i<=b;i++){
            totaliki=totaliki*i;
        }
        System.out.println(totaliki);

        for (i=1;i<=(a-b);i++){
            total��*=i;
        }
        System.out.println(total��);

        System.out.println("C(a,b)= "+(totalbir/(totaliki*total��)));

    }
}
