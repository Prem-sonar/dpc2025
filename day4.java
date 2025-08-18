import java.util.*;

public class day4 {
    // Function to calculate next gap
    private static int nextGap(int gap) {
        if (gap <= 1) return 0;
        return (gap / 2) + (gap % 2); // ceil(gap/2)
    }

    public static void merge(int[] arr1, int[] arr2, int m, int n) {
        int gap = nextGap(m + n);

        while (gap > 0) {
            int i = 0, j = gap;

            while (j < (m + n)) {
                // Case 1: both elements in arr1
                if (i < m && j < m) {
                    if (arr1[i] > arr1[j]) {
                        int temp = arr1[i];
                        arr1[i] = arr1[j];
                        arr1[j] = temp;
                    }
                }
                // Case 2: element in arr1 and element in arr2
                else if (i < m && j >= m) {
                    if (arr1[i] > arr2[j - m]) {
                        int temp = arr1[i];
                        arr1[i] = arr2[j - m];
                        arr2[j - m] = temp;
                    }
                }
                // Case 3: both elements in arr2
                else if (i >= m && j >= m) {
                    if (arr2[i - m] > arr2[j - m]) {
                        int temp = arr2[i - m];
                        arr2[i - m] = arr2[j - m];
                        arr2[j - m] = temp;
                    }
                }
                i++;
                j++;
            }

            gap = nextGap(gap);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 7, 8, 10};
        int[] arr2 = {2, 3, 9};

        merge(arr1, arr2, arr1.length, arr2.length);

        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
    }
}
