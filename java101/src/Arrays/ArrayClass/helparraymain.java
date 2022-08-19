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

        helperarray helperadındanesneürettik = new helperarray();
        helperadındanesneürettik.print(list);
        System.out.println("");

        helperadındanesneürettik.print(list2);
        System.out.println("");

        helperadındanesneürettik.print(list3);

        System.out.println("-------------");

        helperarray.print(list); // eğer static olan bir metodu sınıf ismi ile çağırır isek nesne ürettmemiz şart değil.

        System.out.println(" ");

        Arrays.sort(list);

        System.out.println("----------");

        System.out.println(Arrays.toString(list));// dizileri ekrana batıran arrays methodu.

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