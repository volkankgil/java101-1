package java101ikinciders.src.basicLessons.exercises;

import java.util.Scanner;

public class kdvAmount {
    public static void main(String[] args) {

        double kdvsiz, kdvli, kdvlifiyat;
        double kdvoran�;


        Scanner input = new Scanner(System.in);

        System.out.print("kdvsiz fiyat : ");
        kdvsiz=input.nextDouble();

        boolean kosul = 0<kdvsiz && kdvsiz<1000 ;
        if(kdvsiz>0) {
            kdvoran� = kosul ? 0.18 : 0.08;
        }else {
            kdvoran�=0;
        }

        if(kdvoran�!=0) {
            kdvli = (kdvsiz * kdvoran�);
            System.out.println("kdv tutar� : " + kdvli);
        }else {
            kdvli=0;
        }
        System.out.println("KDV ORANI: " + kdvoran�);

        kdvlifiyat=kdvli+kdvsiz;
        System.out.println("Kdvli fiyat: "+kdvlifiyat);



    }
}
