import java.util.Scanner;

public class hesapmakinesi�devi {
    public static void main(String[] args) {

        int number1 , number2;
        int select =1 ;


        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Say�y� Giriniz : ");
        number1 = input.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.print("�kinci Say�y� Giriniz : ");
        number2 = input.nextInt();

        System.out.println("Toplama i�lemi=1\n��karma i�lemi= 2\n�arpma i�lemi=3\nB�lme i�lemi=4");
        System.out.print("��lem se�imi yap�n�z: ");
        Scanner inputt = new Scanner(System.in);
        select= inputt.nextInt();

        switch (select){

            case 1 :
                System.out.println(number1+number2);
                    break;
            case 2 :
                System.out.println(number1-number2);
                break;
            case 3 :
                System.out.println(number1/number2);
                break;
                case 4:
                    if(number2==0) {
                        System.out.println("say� s�f�ra b�l�nemez");
                    }else {
                        System.out.println(number1 / number2);
                    }
                    break;

                    default:
                    System.out.println("Yanl�� Se�im yapt�n�z");
            }
        }


    }

