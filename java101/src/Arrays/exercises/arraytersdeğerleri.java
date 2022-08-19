package java101ikinciders.src.Arrays.exercises;

public class arraytersdeğerleri {

    static int[] reverse(int[] arr) {
        int[] reverse = new int[arr.length];

        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            reverse[i] = arr[j];
        }

        return reverse;
    }

    static void printarray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int [] list2 = {10, 20, 30, 40, 50, 60};
        int[] newlist = reverse(list2);//yukarıdaki method reverse 'i çağırıyor
        printarray(newlist);

    }
}


