public class AmstrongNumberInRange {
  public static void main(String[] args) {
    int start = 1, end = 10000;
    amstrongInRange(start, end);
  }
  static void amstrongInRange(int start, int end){
    for(int i=start; i<=end; i++){
      if (isAmstrong(i)) {
        System.out.print(i + " ");
      }
    }
  }
  static boolean isAmstrong(int num){

    int k = String.valueOf(num).length();
    int sum = 0;
    int n = num;
    while (n>0) {
      int id = n%10;
      sum += Math.pow(id, k);
      n /= 10;
    }
    return sum == num ? true : false;
  }
}
