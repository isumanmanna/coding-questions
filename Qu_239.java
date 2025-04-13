import java.util.Scanner;

public class Qu_239 {

  public static void removeString(String A, String B) {
    StringBuilder c = new StringBuilder();
    boolean remove[] = new boolean[256];

    for (char ch : B.toCharArray()) {
      remove[ch] = true;
    }

    for (char ch : A.toCharArray()) {
      if (!remove[ch]) {
        c.append(ch);
      }
    }
    System.out.println(c.toString());
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();

    removeString(a, b);
    sc.close();
  }
}
