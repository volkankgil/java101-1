public class temeloperat�rler {
    public static void main(String[] args) {

        int a =5 , b=2;

        System.out.println(a*b);
        System.out.println(a%b);//mod alma(b�l�m�nden kalan a/b)
        a++;//1 art�r�yor
        b--;//1 azalt�yoruz
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

        c%=e; // c = c/e b�l�m�nden kalan say�
        System.out.println(c);

        int say�bir= 15, say�iki=20, say���=25;

        boolean kosul1=say�bir<=20;
        System.out.println(kosul1);

        boolean kosul2=say�bir!=say�iki;
        System.out.println(kosul2);

        boolean kosul3 = say�bir!=15;
        System.out.println(kosul3);

        boolean sonuc = kosul1 && kosul3;
        System.out.println(sonuc);

        boolean sonuc2 =kosul3 || kosul2;
        System.out.println(sonuc2);

        String str = sonuc2 ? "�al��t�r" : "�al��t�rma"; //string ise veri tipide �ift t�rnakl� yaz� olmal�
        System.out.println(str);

        int input = say�bir!=say�iki ? 5 : 15; // integar ise veri tipide �ift st�rnaks�z yaz� olmal�.
        System.out.println(input);






    }
}
