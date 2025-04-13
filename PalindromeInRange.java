public class PalindromeInRange {
  public static void main(String[] args) {
    int start = 10, end=1000;
    printPalindromeInRange(start, end);
  }
  public static boolean ispalin(int num){
    int reversed = 0, original = num;
    while (num != 0) {
      reversed = reversed*10 + num %10;
      num /=10;
    }
    return original==reversed;
  }
  public static void printPalindromeInRange(int start, int end) {
    for (int i=start; i<=end; i++){
      if (ispalin(i)) {
        System.out.print(i + " ");
      }
    }
  }
}
