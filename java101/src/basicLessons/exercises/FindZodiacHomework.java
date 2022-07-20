package java101ikinciders.src.basicLessons.exercises;
import java.util.Scanner;

public class FindZodiacHomework {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int day;
        int month;

        System.out.println("Enter Month : ");
        month = input.nextInt();

        System.out.println("Enter Day : ");
        day = input.nextInt();

        if (month >= 1 && month <= 12) {
            if (day >= 1 && day <= 31) {

                if (month == 1 && day < 22) {
                    System.out.println("oðlak");
                } else if (month == 1 && day > 21)
                    System.out.println("kova");

                if (month == 2 && day < 20) {   //yandaki parantezi açabilirizde açmayabilirizde.
                    System.out.println("kova");
                }else if (month == 2 && day > 19)
                    System.out.println("balýk");

                if (month == 3 && day < 21)
                    System.out.println("balýk");
                else if (month == 3 && day > 20)
                    System.out.println("koç");

                if (month == 4 && day < 21)
                    System.out.println("koç");
                else if (month == 4 && day > 20)
                    System.out.println("boða");

                if (month == 5 && day < 22)
                    System.out.println("boða");
                else if (month == 5 && day > 21)
                    System.out.println("ikizler");

                if (month == 6 && day < 23)
                    System.out.println("ikizler");
                else if (month == 6 && day > 22)
                    System.out.println("yengeç");

                if (month == 7 && day < 23)
                    System.out.println("yengeç");
                else if (month == 7 && day > 22)
                    System.out.println("aslan");

                if (month == 8 && day < 23)
                    System.out.println("aslan");
                else if (month == 8 && day > 22)
                    System.out.println("baþak");

                if (month == 9 && day < 23)
                    System.out.println("baþak");
                else if (month == 9 && day > 22)
                    System.out.println("terazi");

                if (month == 10 && day < 23)
                    System.out.println("terazi");
                else if (month == 10 && day > 22)
                    System.out.println("akrep");

                if (month == 11 && day < 22)
                    System.out.println("akrep");
                else if (month == 11 && day > 21)
                    System.out.println("yay");

                if (month == 12 && day < 22)
                    System.out.println("yay");
                else if (month == 12 && day > 21)
                    System.out.println("oðlak");

            } else System.out.println("Enter Wrong Day.");
        } else System.out.println("Enter Wrong Month.");
    }
}




