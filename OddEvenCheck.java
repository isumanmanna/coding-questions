public class OddEvenCheck {
  public static void main(String[] args) {
    int num = 5;
    check(num);
  }
  static void check(int num){
    if (num%2 == 0) {
      System.out.println(num + " is Even");
    }
    else{
      System.out.println(num + " is Odd");
    }
  }
}
