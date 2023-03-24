package java101ikinciders.src.basicLessons.lecture;

public class mantýksaloperatörler {
    public static void main(String[] args) {

        int a= 10, b=5, c=24,d=-5, t ;



        boolean kosul1 = (a!=b);
        boolean kosul2 = (d<=b);

        boolean çýktý = kosul1&&kosul2;
        boolean çýktý2= kosul1||kosul2;

        System.out.println(çýktý);
        System.out.println(çýktý2);
        System.out.println(!çýktý);//ters iþlem ! iþareti ile yaptým

        t = (a!=d) ? 14 : 4; // (a>=c) ifadesini a+c , b/d veya b+a+c yazamayýz karþýlaþtýrma operatörü ile yazmalýyýz
        System.out.println(t);

    }
}
