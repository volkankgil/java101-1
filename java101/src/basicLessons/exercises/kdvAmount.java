package java101ikinciders.src.basicLessons.exercises;

import java.util.Scanner;

public class kdvAmount {
    public static void main(String[] args) {

        double kdvsiz, kdvli, kdvlifiyat;
        double kdvoraný;


        Scanner input = new Scanner(System.in);

        System.out.print("kdvsiz fiyat : ");
        kdvsiz=input.nextDouble();

        boolean kosul = 0<kdvsiz && kdvsiz<1000 ;
        if(kdvsiz>0) {
            kdvoraný = kosul ? 0.18 : 0.08;
        }else {
            kdvoraný=0;
        }

        if(kdvoraný!=0) {
            kdvli = (kdvsiz * kdvoraný);
            System.out.println("kdv tutarý : " + kdvli);
        }else {
            kdvli=0;
        }
        System.out.println("KDV ORANI: " + kdvoraný);

        kdvlifiyat=kdvli+kdvsiz;
        System.out.println("Kdvli fiyat: "+kdvlifiyat);



    }
}
