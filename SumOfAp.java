public class SumOfAp {
  public static void main(String[] args) {
    int a=-2, d=5, n=8;
    int sum=0;
    for (int i=0; i<n; i++){
      sum += a;
      a += d;
    }
    System.out.println(sum);
  }
}
