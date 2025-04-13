import java.util.*;
public class Qu_08 {
  public static void main(String[] args) {
    int[] a = { 3, 1, 2 };
    char[] b = { 'G', 'E', 'K' };

    TreeMap<Integer, List<Character>> map = new TreeMap<>();

    for (int i=0; i<a.length; i++) {
      map.putIfAbsent(a[i], new ArrayList<>());
      map.get(a[i]).add(b[i]);
    }

    for (Map.Entry<Integer, List<Character>> entry : map.entrySet()) {
      for (char c : entry.getValue()) {
        System.out.print(c + " ");
      }
    }
  }
}
