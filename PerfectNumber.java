public class PerfectNumber {
  
  public static boolean isPerfectNumber(int num){
    int sum = 0;
    for (int i=1; i<= num/2; i++){
      if (num % i == 0) {
        sum += i;
      }
    }
    return sum == num ? true : false;
  }

  public static void main(String[] args) {
    int number = 15;
    if (isPerfectNumber(number)) {
      System.out.println(number + " is Perfect Number");
    } else {
      System.out.println(number + " is not Perfect Number");
    }
  }
}
