import java.util.Scanner;

public class kdvtutar� {
    public static void main(String[] args) {

        double kdvsiz, kdvli, kdvlifiyat;
        double kdvoran�;


        Scanner input = new Scanner(System.in);

        System.out.print("kdvsiz fiyat : ");
        kdvsiz=input.nextDouble();

        boolean kosul = 0<kdvsiz && kdvsiz<1000 ;
        kdvoran� = kosul ? 0.18 : 0.08;


        kdvli =(kdvsiz*kdvoran�);
        System.out.println("kdv tutar� : " + kdvli);

        System.out.println("KDV ORANI: " + kdvoran�);

        kdvlifiyat=kdvli+kdvsiz;
        System.out.println("Kdvli fiyat: "+kdvlifiyat);



    }
}
