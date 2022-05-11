package java101ikinciders.src.döngüler;

public class continuevebreakkomutu {

    public static void main(String[] args) {

        int i;

        /* for (i=1;i<=10; i++){
            System.out.println(i);
            if(i==5) {
                System.out.println("i 5 olduðu için döngü durdu");
                break;

            }*/

        for(i=1;i<=10;i++){
            if(i==6){
                continue;
            }
                System.out.println(i);
            }
/*
        int k = 1;
        while (k < 16) {
            k+=3;
            if (k % 2 == 0) {
                continue;
            }
            System.out.println(k);

        }*/

    }
}

