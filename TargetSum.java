import java.util.*;
public class TargetSum {

  static ArrayList<Integer> subAarrySum(int [] arr, int target){
    ArrayList<Integer> ans = new ArrayList<>();
    int n = arr.length;

    for (int i=0; i<n; i++){
      int curr = 0;

      for(int j=i; j<n; j++){
        curr += arr[j];
        if (curr == target) {
          ans.add(i+1);
          ans.add(j+1);
          return ans;
        }
      }
    }
    ans.add(-1);
    return ans;
  }
  public static void main(String[] args) {
    int [] arr = {15, 2, 4, 8, 9, 5, 10, 23};
    int target = 23;
    ArrayList<Integer> ans = subAarrySum(arr, target);

    for (int num : ans) 
    {
      System.out.print(num +" ");
    }
  }
}
