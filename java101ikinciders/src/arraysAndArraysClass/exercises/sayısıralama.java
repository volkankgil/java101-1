package java101ikinciders.src.arraysAndArraysClass.exercises;

import java.util.Scanner;

import java.util.Arrays;

public class say�s�ralama {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);


        System.out.print("Dizinin boyutu : ");
        int a =input.nextInt();
        int [] list=new int[a];
        System.out.println("Dizinin elemanlar�n� giriniz :");
        for(int i=0;i<list.length;i++){
            System.out.println(i+1 + " .Eleman� :");
            list[i]=input.nextInt();

        }

        System.out.println(Arrays.toString(list));

        Arrays.sort(list);

        System.out.println(Arrays.toString(list));

        }
    }
