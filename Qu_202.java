import java.util.*;
public class Qu_202 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();

    int[] prices = new int[N];
    for(int i=0; i<N; i++){
      prices[i] = sc.nextInt();
    }

    int maxLen = findMax(prices, K);

    System.out.println(maxLen);
  }

  public static int findMax(int [] prices, int K){
    int start=0, sum=0, maxLen=0;

    for(int end=0; end<prices.length; end++){
      sum += prices[end];

      while (sum >= K && start <= end) {
        sum -= prices[start];
        start++;
      }
      maxLen = Math.max(maxLen, end-start+1);
    }
    return maxLen;
  }
}
