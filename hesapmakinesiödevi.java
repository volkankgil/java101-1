import java.util.Scanner;

public class hesapmakinesiödevi {
    public static void main(String[] args) {

        int number1 , number2;
        int select =1 ;


        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Sayýyý Giriniz : ");
        number1 = input.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Ýkinci Sayýyý Giriniz : ");
        number2 = input.nextInt();

        System.out.println("Toplama iþlemi=1\nÇýkarma iþlemi= 2\nÇarpma iþlemi=3\nBölme iþlemi=4");
        System.out.print("Ýþlem seçimi yapýnýz: ");
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
                        System.out.println("sayý sýfýra bölünemez");
                    }else {
                        System.out.println(number1 / number2);
                    }
                    break;

                    default:
                    System.out.println("Yanlýþ Seçim yaptýnýz");
            }
        }


    }

