import java.util.Scanner;

public class Qu_73 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] trainee = new int[3][3];
    int[] average = new int[3];
    boolean isValid = true;

    // Taking input for oxygen levels
    for (int i = 0; i < 3; i++) { // 3 rounds
      for (int j = 0; j < 3; j++) { // 3 trainees
        int oxygenLevel = sc.nextInt();
        if (oxygenLevel < 1 || oxygenLevel > 100) {
          isValid = false;
        }
        trainee[i][j] = (oxygenLevel >= 1 && oxygenLevel <= 100) ? oxygenLevel : 0;
      }
    }

    // Check for invalid input
    if (!isValid) {
      System.out.println("INVALID INPUT");
      return;
    }

    // Calculating average oxygen level for each trainee
    for (int i = 0; i < 3; i++) {
      int sum = 0;
      for (int j = 0; j < 3; j++) {
        sum += trainee[j][i]; // Fixed issue: Corrected indexing
      }
      average[i] = Math.round(sum / 3.0f); // Rounded average oxygen level
    }

    // Finding the highest average oxygen level
    int max = 0;
    for (int i = 0; i < 3; i++) {
      if (average[i] > max) {
        max = average[i];
      }
    }

    // If the maximum average oxygen level is below 70, declare all trainees unfit
    if (max < 70) {
      System.out.println("All trainees are unfit");
      return;
    }

    // Identifying the most fit trainee(s)
    for (int i = 0; i < 3; i++) {
      if (average[i] == max) {
        System.out.println("Trainee Number : " + (i + 1));
      }
    }
  }
}
