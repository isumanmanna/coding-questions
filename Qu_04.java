import java.util.*;

public class Qu_04 {

  public static void merge(int[] nums1, int m, int[] nums2, int n) {
    int [] merged = new int[m+n];
    int i;

    for(i=0; i<m; i++){
      merged[i] = nums1[i];
    }

    for(int j=0; j<n; j++){
      merged[i++] = nums2[j];
    }

    Arrays.sort(merged);

    for(i=0; i<m+n; i++){
      nums1[i] = merged[i];
    }

  }

  public static void main(String[] args) {
    int[] nums1 = { 1, 2, 3, 0, 0, 0 };
    int m = 3;
    int[] nums2 = { 2, 5, 6 };
    int n = 3;

    merge(nums1, m, nums2, n);

    System.out.println("Merged Array: " + Arrays.toString(nums1));
  }
}