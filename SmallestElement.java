
public class SmallestElement {
    /*
     * public static void main(String[] args) {
     * int [] arr = {6, 0, 8, 9, 4};
     * int ans = smallest(arr);
     * System.out.println(ans);
     * }
     * static int smallest(int [] arr) {
     * int small = Integer.MAX_VALUE;
     * for(int i = 0; i<arr.length; i++){
     * if (small>arr[i]) {
     * small = arr[i];
     * }
     * }
     * return small;
     * }
     */

    /*
     * public static void main(String args[]) {
     * 
     * int arr1[] = { 2, 5, 1, 3, 0 };
     * System.out.println("The smallest element in array is: " + sort(arr1));
     * 
     * int arr2[] = { 8, 10, 5, 7, 9 };
     * System.out.println("The smallest element in array is: " + sort(arr2));
     * }
     * 
     * static int sort(int arr[]) {
     * Arrays.sort(arr);
     * return arr[0];
     * }
     */
    
    public static void main(String args[]) {

        int arr1[] = { 2, 5, 1, 3, 0 };
        System.out.println("The smallest element in the array is: " + Smallest(arr1));

        int arr2[] = { 8, 10, 5, 7, 9 };
        System.out.println("The smallest element in the array is: " + Smallest(arr2));
    }

    static int Smallest(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}