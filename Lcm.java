import java.io.*;
public class Lcm {

  public static int gcd(int a, int b){
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }

  public static int lcm(int a, int b){
    return (a * b) / gcd(a, b);
  }
  public static void main(String[] args) {
    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String input = br.readLine().trim();

      String [] parts = input.split("[, ]+");
      if (parts.length !=2) {
        System.out.println("Invalid input");
        return;
      }

      int num1 = Integer.parseInt(parts[0]);
      int num2 = Integer.parseInt(parts[1]);

      System.out.println(lcm(num1, num2));
      
    } catch (IOException | NumberFormatException e) {
      System.out.println("Invalid input");
    }
  }
}