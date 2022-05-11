
package java101ikinciders.src.döngüler;

import java.util.Scanner;

public class while3 {
    public static void main(String[] args) {

        int password;
        boolean ispasswordsuccess=true;


        Scanner input = new Scanner(System.in);

        while(ispasswordsuccess){
            System.out.println( "Þifre Giriniz:");
            password=input.nextInt();

            if (password == 123) {
                System.out.println("doðru");
                ispasswordsuccess=false;

            } else{

                System.out.println("yanlýþ");

            }

            }
        }
    }



