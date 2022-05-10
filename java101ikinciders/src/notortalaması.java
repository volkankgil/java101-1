import  java.util.Scanner;

public class notortalamasý {
    public static void main(String[] args) {

        double matematik, türkçe, fizik,kimya,müzik,tarih ;




        System.out.print("Matematik notunu giriniz :" );
        Scanner input = new Scanner(System.in);
        matematik= input.nextDouble();

        System.out.print("türkçe notunu giriniz: " );
        türkçe = input.nextDouble();

        System.out.print("fizik notunu giriniz: " );
        fizik = input.nextDouble();

        System.out.print("kimya notunu giriniz: " );
        kimya = input.nextDouble();

        System.out.print("müzik notunu giriniz: " );
        müzik = input.nextDouble();

        System.out.print("tarih notunu giriniz: " );
        tarih = input.nextDouble();



        double toplam = (matematik+türkçe+fizik+kimya+müzik+tarih)/6;
        System.out.println("toplam ortalamanýz :" +toplam);



        boolean kosul = toplam>60;
        String str = kosul ? "geçti" : "kaldý";
        System.out.println(str);



    }
}
