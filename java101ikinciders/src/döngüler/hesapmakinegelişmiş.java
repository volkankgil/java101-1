package java101ikinciders.src.d�ng�ler;

import java.util.Scanner;

public class hesapmakinegeli�mi� {

    static int sum (int a,int b){
        int result=a+b;
        System.out.println("Toplam:" +result);
        return result;
    }

    static int eksi (int a,int b){
        int result=a-b;
        System.out.println("��karma: "+result);
        return  result;
    }

    static int �arpma (int a,int b) {
        int result = a * b;
        System.out.println("�arpma:" +result);
        return result;
    }

    static int b�lme (int a,int b) {
        if (b == 0) {
            System.out.println("Say� s�f�rdan farkl� olmal�");
            return 1;
        } else {
            int result = a / b;
            System.out.println("B�lme:" + result);

            return result;
        }
    }

    static int �salma(int a,int b){
        int i;
        int result=1;
        for(i=1;i<=b;i++){
            result*=a;
        }
        System.out.println("�ss�"+result);
        return result;
    }

    static void faktoriyel(int a,int b){
        int result=1;
        for(int i=1;i<=a;i++){
            result*=i;
        }
        System.out.println("Faktoriyel: " + result);
    }

    static void modalma(int a,int b){ // void yaz�p int kald�rd���m i�in return de�eri yazmak zorunlu de�il.
        int result=a%b;
        System.out.println("Mod: " +result);
    }

    static void dikd�rtgenalanvecevresi(int a, int b){
        int result = a+b;
        int result2=a*b;
        System.out.println(result);
        System.out.println(result2);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String Menu = "1- Toplama ��lemi:\n "
                + "2- ��karma ��lemi:\n "
                + "3- �arpma ��lemi:\n "
                + "4- B�lme i�lemi:\n "
                + "5- �sl� Say� Hesaplama:\n "
                + "6- Faktoriyel Hesaplama:\n "
                + "7- Mod Alma: \n"
                + "8- Dikd�rtgen Alan ve �evre Hesab�:\n "
                + "0- ��k�� Yap : \n ";

        System.out.println(Menu);

        while (true) {

            System.out.println("��lemi se�iniz: ");
            int select = input.nextInt();
            if (select == 0) {
                break;
            }

                System.out.println("Birinci Say�y� Giriniz: ");
                int a = input.nextInt();

                System.out.println("�kinci Say�y� Giriniz: ");
                int b = input.nextInt();


            switch (select) {
                case 1 :
                    sum(a,b);
                    break;
                case 2 :
                    eksi(a,b);
                    break;
                case 3:
                    �arpma(a,b);
                    break;
                case 4:
                    if (a==0) {
                        System.out.println("0");
                    }else {
                        b�lme(a,b);
                    }
                    break;
                case 5:
                    �salma(a,b);
                    break;
                case 6:
                    faktoriyel(a,b);
                    break;
                case 7:
                    modalma(a,b);
                    break;
                case 8:
                    dikd�rtgenalanvecevresi(a,b);
                    break;
            }

        }
        System.out.println("G�LE G�LE");
    }
}
