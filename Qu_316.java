import java.util.*;

public class Qu_316 {

  public static void middlePoint(int[] N1, int input1, int[] N2, int input2) {
    // Using HashSet to remove duplicates
    Set<Integer> set = new HashSet<>();
    for (int num : N1)
      set.add(num);
    for (int num : N2)
      set.add(num);

    // Convert to List and sort
    List<Integer> sortedList = new ArrayList<>(set);
    Collections.sort(sortedList);

    int n = sortedList.size();
    System.out.println("Sorted Unique List: " + sortedList);
    System.out.println("Size of List: " + n);

    // Finding the median
    if (n % 2 == 0) { // Even length
      int ind1 = n / 2 - 1;
      int ind2 = n / 2;
      double result = (sortedList.get(ind1) + sortedList.get(ind2)) / 2.0;
      System.out.println("Median: " + result);
    } else { // Odd length
      double result = sortedList.get(n / 2);
      System.out.println("Median: " + result);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Read first array
    System.out.print("Enter the size of first Array: ");
    int input1 = sc.nextInt();
    System.out.println("Enter the elements of Array: ");
    int[] N1 = new int[input1];
    for (int i = 0; i < input1; i++) {
      N1[i] = sc.nextInt();
    }

    // Read second array
    System.out.print("Enter the size of second Array: ");
    int input2 = sc.nextInt();
    System.out.println("Enter the elements of Array: ");
    int[] N2 = new int[input2];
    for (int j = 0; j < input2; j++) {
      N2[j] = sc.nextInt();
    }

    middlePoint(N1, input1, N2, input2);

    sc.close(); // Close Scanner
  }
}