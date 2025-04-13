import java.util.Scanner;

public class Qu_01 {
  public static int getMinimumChanges(String s) {
    int starCount = 0;
    int hashCount = 0;

    for (char ch : s.toCharArray()) {
      if (ch == '*') {
        starCount++;
      } else if (ch == '#') {
        hashCount++;
      }
    }

    return starCount - hashCount;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Input string
    System.out.print("Enter the string consisting of '*' and '#': ");
    String input = scanner.nextLine();

    int result = getMinimumChanges(input);

    // Output result
    System.out.println("Output: " + result);

    scanner.close();
  }
}