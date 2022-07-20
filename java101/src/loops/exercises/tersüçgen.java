package java101ikinciders.src.loops.exercises;

public class tersüçgen {
    public static void main(String[] args) {

                int n=5;


                for(int i=n;i>0;i--){
                    for(int j=(n-i);j>=0;j--){
                        System.out.print(" ");
                    }
                    for (int k=(2*i-1);k>=1;k--){
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
            }
        }