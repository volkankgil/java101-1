package java101ikinciders.src.ilkdersler;

import java.util.Scanner;

public class havas�cakl���etkinlik {
    public static void main(String[] args) {

        int s�cakl�k ;

        Scanner input = new Scanner(System.in);

        System.out.print("Hava s�cakl���: ");

        s�cakl�k = input.nextInt();

        if (s�cakl�k<5){
            System.out.println("kayak yapabilirsiniz");
        }

        if (s�cakl�k>=5 && s�cakl�k<=15){
            System.out.println("sinemaya gidebilirsin");
        }
        if (s�cakl�k>=10 && s�cakl�k<=25) {
            System.out.println("pikni�e gidebilirsin");

        }else if (s�cakl�k>25){
                System.out.println("denize gidebilirsin");
            }
        }


        




    }

