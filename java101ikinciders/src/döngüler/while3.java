
package java101ikinciders.src.d�ng�ler;

import java.util.Scanner;

public class while3 {
    public static void main(String[] args) {

        int password;
        boolean ispasswordsuccess=true;


        Scanner input = new Scanner(System.in);

        while(ispasswordsuccess){
            System.out.println( "�ifre Giriniz:");
            password=input.nextInt();

            if (password == 123) {
                System.out.println("do�ru");
                ispasswordsuccess=false;

            } else{

                System.out.println("yanl��");

            }

            }
        }
    }



