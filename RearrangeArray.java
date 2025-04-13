import java.util.Arrays;

public class RearrangeArray {
    public static void rearrangeArray(int arr[]) {
        int n = arr.length;

        // Edge Case: Empty or single-element array, no changes needed
        if (n <= 1) return;

        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Reverse the second half of the array
        int left = n / 2, right = n - 1;
        while (left < right) {
            // Swap arr[left] and arr[right]
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        // Test Cases for Edge & Corner Cases
        int[][] testCases = {
            {}, // Edge Case: Empty array
            {5}, // Edge Case: Single-element array
            {3, 1, 2, 5, 4, 6, 8, 7}, // Even-length array
            {10, 20, 30, 40, 50}, // Odd-length array
            {1, 1, 1, 1, 1, 1}, // Edge Case: All identical elements
            {9, 3, 6, 2, 8, 1, 7, 4, 5}, // Unsorted odd-length array
            {-10, -20, -30, -40, -50}, // Corner Case: All negative numbers
            {-5, 0, 5, -10, 10, -15, 15}, // Corner Case: Mix of negative, zero, and positive
            {100000, 200000, 300000, 400000, 500000}, // Corner Case: Large numbers
            {1, 2, 3, 4, 5, 6, 6, 6, 7, 8}, // Corner Case: Duplicates
            {1, 100, 2, 99, 3, 98, 4, 97} // Corner Case: Alternating input order
        };

        for (int[] arr : testCases) {
            rearrangeArray(arr);
            System.out.println("Rearranged Array: " + Arrays.toString(arr));
        }
    }
}
