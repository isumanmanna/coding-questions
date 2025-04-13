public class PrimeInRange {

  public static boolean isprime(int num){
    if (num<=1) {
      return false;
    }
    for(int i=2; i*i<=num; i++){
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void primeInRange(int start, int end){
    for(int i=start; i<=end; i++){
      if (isprime(i)) {
        System.out.print(i + " ");
      }
    }
  }
  public static void main(String[] args) {
    int start = 1, end =100;

    primeInRange(start, end);
  }
}
