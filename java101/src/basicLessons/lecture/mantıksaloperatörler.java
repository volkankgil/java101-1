package java101ikinciders.src.basicLessons.lecture;

public class mant�ksaloperat�rler {
    public static void main(String[] args) {

        int a= 10, b=5, c=24,d=-5, t ;



        boolean kosul1 = (a!=b);
        boolean kosul2 = (d<=b);

        boolean ��kt� = kosul1&&kosul2;
        boolean ��kt�2= kosul1||kosul2;

        System.out.println(��kt�);
        System.out.println(��kt�2);
        System.out.println(!��kt�);//ters i�lem ! i�areti ile yapt�m

        t = (a!=d) ? 14 : 4; // (a>=c) ifadesini a+c , b/d veya b+a+c yazamay�z kar��la�t�rma operat�r� ile yazmal�y�z
        System.out.println(t);

    }
}
