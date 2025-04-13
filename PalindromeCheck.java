public class PalindromeCheck {
  public static void main(String[] args) {
    int num = 1234321;
    System.out.println(ispalindrome(num));
  }
  static boolean ispalindrome(int num) {
    if (num <= 0) {
      return false;
    }
    int reversed = 0, original = num;
    while (num != 0) {
      reversed = reversed*10 + num %10;
      num /= 10;
    }
    return original == reversed;
  }
}