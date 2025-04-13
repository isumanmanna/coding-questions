public class SumOfEelement {
  public static void main(String[] args) {
    int n = 5;
    int [] arr = {2, 2, 3, 4, 7};

    int result = totalSum(n, arr);
    System.out.println(result);
  }
  static int totalSum(int n, int [] arr){
    int sum = 0;
    for (int num : arr){
      sum += num;
    }
    
    return sum;
  }
}