package java101ikinciders.src.ilkdersler;

public class switchcase {
    public static void main(String[] args) {

        int birincidonemnotu = 15, ikincidonemnotu =300;

        switch (ikincidonemnotu / birincidonemnotu) {

            case 20:
                System.out.println("kaldý");
                break;

            case 15:
                System.out.println("geçti");
                break;
            case 2 :
                System.out.print("geçti");
                break;
        }

    }
}
