import java.util.*;
public class Qu_201 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();

    int [] M = new int[N+1];

    for(int i=1; i<=N; i++){
      M[i] = sc.nextInt();
    }

    for(int i=0; i<K; i++){
      int X = sc.nextInt();
      int Y = sc.nextInt();

      M[X] = Y;

      int meritListSize = calculateSize(M, N);

      System.out.println(meritListSize);
    }
  }

  public static int calculateSize (int [] M, int N){
    if (N==0) {
      return 0;
    }
    int count = 1;

    for(int i=2; i<=N; i++){
      if (M[i] != M[i-1]) {
        count++;
      }
    }
    return count;
  }
}