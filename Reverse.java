import java.util.*;
public class Reverse {
    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 8, 1, 2, 9 };
        reverseArray(arr);
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }

}
