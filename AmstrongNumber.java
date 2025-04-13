public class AmstrongNumber {
  
  public static boolean isAmstrong(int num){

    int k = String.valueOf(num).length();

    int sum = 0;
    int n = num;

    while (n>0) {
      int id = n%10;
      sum += Math.pow(id, k);
      n /= 10;
    }
    return sum==num ? true : false;
  }

  public static void main(String[] args) {
    int number = 153;
    if (isAmstrong(number)) {
      System.out.println(number + " is Amstrong");
    } else {
      System.out.println(number + " is not Amstrong");
    }
  }
}
