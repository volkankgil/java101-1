package java101ikinciders.src.Arrays.lecture;

public class diziilkders {

    static void printarray(int[]arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        int [] list =new int[10]; //10 say�s� dizinin boyutunu g�steriyor.veri tipi int yerine double veya string'te olabilir.
        int list2[]=new int[20]; //2. kullan�m�
        int [] list3={10,20,30,40,50,60}; //3. kullan�m�
        /*double [] list ;
        list = new double[20];
        4. kullan�mm �ekli*/

        list[0]=10;
        list[1]=20;
        list[2]=30;
        list[2]=45;//list 2 'de yeni de�er atamas� yapt�m.

        System.out.println(list[2]);
        System.out.println("---------");
        System.out.println(list3[3]);
        System.out.println("----------");

        int[]yeni=new int[10]; //ifadeyi 10,20,30 �eklinde yapaca��z.
        System.out.println(yeni.length);//listenin boyutunu veriyor.

        System.out.println("-----------");

        for(int i=0;i<list.length;i++){
            list[i]=(i*10)+10;
            System.out.println(list[i]);
        }


        System.out.println("--------");


        int list4[]={4,6,8,12,16,24,28};

        for(int i=0;i<list4.length;i++){
            System.out.println(list4[i]);
        }

        System.out.println("---------");


        int a=0;
        while (a<list4.length){
            System.out.println(list4[a]);
            a++;
        }
        System.out.println("---------");
        printarray(list4);

        String[]weekdays=new String[]{"Pazartesi","Sal�","�ar�amba"};
        System.out.println(weekdays[2]);
    }
}
