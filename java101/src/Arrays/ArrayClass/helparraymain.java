package java101ikinciders.src.Arrays.ArrayClass;

import java.util.Arrays;

public class helparraymain {
    public static void main(String[] args) {

        int [] list={1,2,15,3,8,10,4,5,6};
        int [] list2={1,2,3};
        double [] list3={10.5,20.147,30.87,40.14};
        int [] list4={1,2,3};

        helperarray.copy(list,5);
        System.out.println("");

        helperarray helperad�ndanesne�rettik = new helperarray();
        helperad�ndanesne�rettik.print(list);
        System.out.println("");

        helperad�ndanesne�rettik.print(list2);
        System.out.println("");

        helperad�ndanesne�rettik.print(list3);

        System.out.println("-------------");

        helperarray.print(list); // e�er static olan bir metodu s�n�f ismi ile �a��r�r isek nesne �rettmemiz �art de�il.

        System.out.println(" ");

        Arrays.sort(list);

        System.out.println("----------");

        System.out.println(Arrays.toString(list));// dizileri ekrana bat�ran arrays methodu.

        Arrays.fill(list,10);
        System.out.println(Arrays.toString(list));

        System.out.println(" ");

        Arrays.fill(list,0,2,5);
        System.out.println(Arrays.toString(list));

        helperarray.printfill(list,10);

        System.out.println(" ");

        helperarray.equals(list2,list4);

        System.out.println(java101ikinciders.src.Arrays.ArrayClass.helperarray.binarysearch(list2,2));

}
}