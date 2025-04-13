import java.util.*;

public class Qu_06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input values
    int n = sc.nextInt(); // Total number of monkeys
    int m = sc.nextInt(); // Total bananas
    int p = sc.nextInt(); // Total peanuts
    int k = sc.nextInt(); // Bananas per monkey
    int j = sc.nextInt(); // Peanuts per monkey

    int monkeysDown = 0;

    for (int i = 0; i < n; i++) {
      if (m >= k) {
        m -= k; // Monkey eats k bananas
        monkeysDown++;
      } else if (p >= j) {
        p -= j; // Monkey eats j peanuts
        monkeysDown++;
      } else if (m > 0 || p > 0) {
        // Last monkey eats leftover bananas/peanuts
        m = 0;
        p = 0;
        monkeysDown++;
        break;
      } else {
        break; // No food left
      }
    }

    int monkeysOnTree = n - monkeysDown;
    System.out.println(monkeysOnTree);
  }
}
