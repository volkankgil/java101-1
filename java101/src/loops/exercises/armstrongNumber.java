package java101ikinciders.src.loops.exercises;

import java.net.DatagramSocket;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {

        //Basamak Say�s� Bulma ��lemi
        // 2451 / 10 = 245
        // 245 / 10 = 24
        // 24 / 10 = 2
        // 2 / 10 = 0
        // 0 / 10 = 0

        Scanner input = new Scanner(System.in);

        int a;
        int counter = 0;
        int basvalue;
        int baspow;

        System.out.print("Say� giriniz: ");
        a = input.nextInt();

        int tempnumber = a;
        int result = 0;

        while (tempnumber != 0) {
            tempnumber /= 10;  //javada bir say�y� 10'a b�ler isek son basama�� at�yoruz.
            counter++;
            System.out.println(tempnumber);
        }
        System.out.println("Basamak Say�s�:" +counter);

        System.out.println("-----");

        tempnumber = a;

        while (tempnumber != 0) {
            basvalue = tempnumber % 10;
            baspow = 1;      // baspow say�s� tekrar 1'e e�itliyoruz ki for d�ng�s� ��k���ndaki rakam� almas�n.
            for (int i = 1; i <= counter; i++) {
                baspow *= basvalue;
            }

            result += baspow;
            tempnumber /= 10;
            System.out.println(basvalue);
        }
        System.out.println(result);

        LocalDate date=LocalDate.of(2025,3,5); // local date s�n�f� tarihlerle i�lem yapmama�z� sa�lar. g�ncel tarih ve saatide bat�rabiliriz.
        System.out.println(date);

        LocalDate tomorrow=LocalDate.now().plusDays(1);
        System.out.println(tomorrow);

        LocalDate nextmonth=LocalDate.now().withMonth(4);
        System.out.println(nextmonth);

        LocalTime now=LocalTime.now();
        System.out.println(now);

        LocalTime evening=LocalTime.of(20,0,0); //istedi�imiz saati ekrana bast�r�yor. saat-dakika-saniye
        System.out.println(evening);

        LocalDateTime now2=LocalDateTime.now(); //tarih ve saat birlikte ekrana bast�r�l�r.
        System.out.println(now2);

        String formattedDateTime =now2.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"));
        System.out.println(formattedDateTime);

        DayOfWeek �ar�amba=DayOfWeek.of(3);  //haftan�n g�n�n�n ismini veriyor.
        System.out.println(�ar�amba);
    }
}
