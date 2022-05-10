import java.util.Scanner;

public class kdvtutarý {
    public static void main(String[] args) {

        double kdvsiz, kdvli, kdvlifiyat;
        double kdvoraný;


        Scanner input = new Scanner(System.in);

        System.out.print("kdvsiz fiyat : ");
        kdvsiz=input.nextDouble();

        boolean kosul = 0<kdvsiz && kdvsiz<1000 ;
        kdvoraný = kosul ? 0.18 : 0.08;


        kdvli =(kdvsiz*kdvoraný);
        System.out.println("kdv tutarý : " + kdvli);

        System.out.println("KDV ORANI: " + kdvoraný);

        kdvlifiyat=kdvli+kdvsiz;
        System.out.println("Kdvli fiyat: "+kdvlifiyat);



    }
}
