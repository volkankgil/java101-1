package java101ikinciders.src.loops.exercises;

public class asalsay� {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            int sayac=0;
                for(int j=1;j<=i;j++){
                    if(i%j==0){
                        sayac++;
                    }
                }
                if(sayac==2){
                    System.out.print(i+" ,");
                }
        }
    }
}
