package java101ikinciders.src.dizilervearrays�n�f�;

import java.util.Arrays;

public class frekans {
    public static void countFreq(int arr[], int n) {
        boolean visited[] = new boolean[n];
        Arrays.fill(visited, false);

        // Traverse through array elements and
        // count frequencies

        for (int i = 0; i < n; i++) {

            // Skip this element if already processed
            if (visited[i] == true)
                continue;

            // Count frequency
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " occurs " + count + " times ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 312, 31, 423, 523, 5, 23, 312, 2, 5, 5, 5, 423, 423, 10, 10, -6, -6};
        int n = arr.length;
        countFreq(arr, n);

    }
}

