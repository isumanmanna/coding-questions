import java.util.Scanner;

public class Qu_07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the key: ");
    int k = sc.nextInt();
    sc.nextLine(); // Fix: Consume the leftover newline

    if (k < 0 || k > 25) { // Ensuring valid key
      System.out.println("INVALID INPUT");
      return;
    }

    System.out.println("Enter the string: ");
    String str = sc.nextLine();

    StringBuilder ans = new StringBuilder();

    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);

      if (Character.isUpperCase(c)) {
        // Shift within A-Z
        char character = (char) ('A' + (c - 'A' + k) % 26);
        ans.append(character);
      } else if (Character.isLowerCase(c)) {
        // Shift within a-z
        char character = (char) ('a' + (c - 'a' + k) % 26);
        ans.append(character);
      } else if (Character.isDigit(c)) {
        // Shift within 0-9
        char character = (char) ('0' + (c - '0' + k) % 10);
        ans.append(character);
      } else {
        // Keep spaces and special characters unchanged
        ans.append(c);
      }
    }
    System.out.println("The Encrypted Text is: " + ans);
  }
}
