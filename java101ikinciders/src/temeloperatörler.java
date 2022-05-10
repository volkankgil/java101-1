public class temeloperatörler {
    public static void main(String[] args) {

        int a =5 , b=2;

        System.out.println(a*b);
        System.out.println(a%b);//mod alma(bölümünden kalan a/b)
        a++;//1 artýrýyor
        b--;//1 azaltýyoruz
        System.out.println(a);
        System.out.println(b);

        int c =7, e=10;
        int d =c;
        System.out.println(d);

        c+=e; // c= c+e ;
        System.out.println(c);

        c-=e; // c= c-e
        System.out.println(c);

        c*=e; // c= c*e
        System.out.println(c);

        c/=e; // c= c/e
        System.out.println(c);

        c%=e; // c = c/e bölümünden kalan sayý
        System.out.println(c);

        int sayýbir= 15, sayýiki=20, sayýüç=25;

        boolean kosul1=sayýbir<=20;
        System.out.println(kosul1);

        boolean kosul2=sayýbir!=sayýiki;
        System.out.println(kosul2);

        boolean kosul3 = sayýbir!=15;
        System.out.println(kosul3);

        boolean sonuc = kosul1 && kosul3;
        System.out.println(sonuc);

        boolean sonuc2 =kosul3 || kosul2;
        System.out.println(sonuc2);

        String str = sonuc2 ? "çalýþtýr" : "çalýþtýrma"; //string ise veri tipide çift týrnaklý yazý olmalý
        System.out.println(str);

        int input = sayýbir!=sayýiki ? 5 : 15; // integar ise veri tipide çift stýrnaksýz yazý olmalý.
        System.out.println(input);






    }
}
