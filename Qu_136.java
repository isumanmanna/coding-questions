import java.util.Scanner;

public class Qu_136 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();

    int [] coin = new int[N];
    for(int i=0; i<N; i++){
    coin[i] = sc.nextInt();
    }

    findRooms(coin, N, K);
  }

  public static void findRooms(int[] coin, int N, int K){
    int start = 0, sum = 0;

    for(int end=0; end<N; end++){
      sum += coin[end];

      while (sum > K) {
        sum -= coin[start];
        start++;
      }
      if (sum == K) {
        System.out.println((start+1) + " " + (end+1));
        return;
      }
    } 
  }
}
