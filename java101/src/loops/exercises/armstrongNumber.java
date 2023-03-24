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

        //Basamak Sayýsý Bulma Ýþlemi
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

        System.out.print("Sayý giriniz: ");
        a = input.nextInt();

        int tempnumber = a;
        int result = 0;

        while (tempnumber != 0) {
            tempnumber /= 10;  //javada bir sayýyý 10'a böler isek son basamaðý atýyoruz.
            counter++;
            System.out.println(tempnumber);
        }
        System.out.println("Basamak Sayýsý:" +counter);

        System.out.println("-----");

        tempnumber = a;

        while (tempnumber != 0) {
            basvalue = tempnumber % 10;
            baspow = 1;      // baspow sayýsý tekrar 1'e eþitliyoruz ki for döngüsü çýkýþýndaki rakamý almasýn.
            for (int i = 1; i <= counter; i++) {
                baspow *= basvalue;
            }

            result += baspow;
            tempnumber /= 10;
            System.out.println(basvalue);
        }
        System.out.println(result);

        LocalDate date=LocalDate.of(2025,3,5); // local date sýnýfý tarihlerle iþlem yapmamaýzý saðlar. güncel tarih ve saatide batýrabiliriz.
        System.out.println(date);

        LocalDate tomorrow=LocalDate.now().plusDays(1);
        System.out.println(tomorrow);

        LocalDate nextmonth=LocalDate.now().withMonth(4);
        System.out.println(nextmonth);

        LocalTime now=LocalTime.now();
        System.out.println(now);

        LocalTime evening=LocalTime.of(20,0,0); //istediðimiz saati ekrana bastýrýyor. saat-dakika-saniye
        System.out.println(evening);

        LocalDateTime now2=LocalDateTime.now(); //tarih ve saat birlikte ekrana bastýrýlýr.
        System.out.println(now2);

        String formattedDateTime =now2.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"));
        System.out.println(formattedDateTime);

        DayOfWeek çarþamba=DayOfWeek.of(3);  //haftanýn gününün ismini veriyor.
        System.out.println(çarþamba);
    }
}
