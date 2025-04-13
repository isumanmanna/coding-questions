import java.util.*;
public class Qu_03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = Integer.parseInt(sc.nextLine());
    char [] balloons = new char[n];

    for (int i=0; i<n; i++){
      balloons [i] = sc.nextLine().charAt(0);
    }

    Map<Character, Integer> map = new LinkedHashMap<>();

    for (char balloon : balloons) {
      map.put(balloon, map.getOrDefault(balloon, 0)+1);
    }

    boolean foundOdd = false;
    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
      if (entry.getValue() % 2 != 0) {
        System.out.println(entry.getKey());
        foundOdd = true;
        break;
      }
    }
    if (!foundOdd) {
      System.out.println("All are even");
    }
    sc.close();
  }
}
