package java101ikinciders.src.Arrays.exercises;

public class tekraredensayýlarýbulma {

    static boolean isfind(int[] arr, int value) {
        for (int m = 0; m < arr.length; m++) {
            if (arr[m] == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] list = {3, 7,4, 3, 2, 9, 10,4,10, 21, 1, 33, 9, 1};

        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int a = 0; a < list.length; a++) {
                if ((i != a) && (list[i] == list[a])) {
                    if (list[a] % 2 == 0) {
                        if (!isfind(duplicate, list[a])) {
                            duplicate[startIndex++] = list[i];
                            break;
                        }
                    }
                }
            }
        }

            for (int j = 0; j < duplicate.length; j++) {
                if (duplicate[j] == 0) {
                    break;
                } else {
                    System.out.println(duplicate[j]);
                }
            }
        }
    }
