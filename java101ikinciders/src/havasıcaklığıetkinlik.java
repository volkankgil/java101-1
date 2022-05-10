import java.util.Scanner;

public class havasýcaklýðýetkinlik {
    public static void main(String[] args) {

        int sýcaklýk ;

        Scanner input = new Scanner(System.in);

        System.out.print("Hava sýcaklýðý: ");

        sýcaklýk = input.nextInt();

        if (sýcaklýk<5){
            System.out.println("kayak yapabilirsiniz");
        }

        if (sýcaklýk>=5 && sýcaklýk<=15){
            System.out.println("sinemaya gidebilirsin");
        }
        if (sýcaklýk>=10 && sýcaklýk<=25) {
            System.out.println("pikniðe gidebilirsin");

        }else if (sýcaklýk>25){
                System.out.println("denize gidebilirsin");
            }
        }


        




    }

