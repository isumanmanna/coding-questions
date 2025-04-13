import java.util.ArrayList;
import java.util.List;
public class Subsequence {

  public static List<List<Integer>> getAll(int[] arr){
    List<List<Integer>> result = new ArrayList<>();
    int n = arr.length;

    for(int i=0; i<(1<<n); i++){
      List<Integer> current = new ArrayList<>();

      for(int j=0; j<n; j++){
        if ((i & (1 << j))>0) {
          current.add(arr[j]);
        }
      }
      result.add(current);
    }
    return result;
  }
  public static void main(String[] args) {
    int [] arr = {1, 2, 3, 4};
    List<List<Integer>> subSequences = getAll(arr);

    for(List<Integer> subseq : subSequences){
      System.out.println(subseq);
    }
  }
}
