import java.util.*;
public class Qu_70 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = 10;
    int K = 5;

    int M = sc.nextInt();

    if (M >= 1 && M <= K) {
      System.out.println("Number of candies sold : " + M);
      System.out.println("Number of candies left: " + (N-M));
    } else {
      System.out.println("Invalid Input");
      System.out.println("Number of candies left: " + N);
    }
    sc.close();
  }
}
