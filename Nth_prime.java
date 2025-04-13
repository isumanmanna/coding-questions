import java.io.*;
public class Nth_prime {

  public static boolean isPrime(int num){
    if (num < 2) {
      return false;
    }
    for(int i=2; i*i <=num; i++){
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static int nthPrime(int n){
    int count = 0, num=1;
    while (count < n) {
      num++;
      if (isPrime(num)) {
        count++;
      }
    }
    return num;
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String input = br.readLine();

    String [] parts = input.split("[, ]+");

    int x = Integer.parseInt(parts[0]);
    int y = Integer.parseInt(parts[1]);

    int primeX = nthPrime(x);
    int primeY = nthPrime(y);

    int result = primeX * primeY - 1;
    System.out.println(result);
  }
}