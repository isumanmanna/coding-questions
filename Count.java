public class Count {
    public static void main(String args[]) {
        int arr[] = { 10, 5, 10, 15, 10, 5 };
        int n = arr.length;
        countFreq(arr, n);
    }

    public static void countFreq(int arr[], int n) {
        boolean visited[] = new boolean[n];

        for (int i = 0; i < n; i++) {
            // Skip this element if already processed
            if (visited[i])
                continue;

            // Mark the first occurrence as visited
            visited[i] = true;

            // Count frequency
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " appears " + count + " times");
        }
    }

}

/*
 
Given Input:

    int arr[] = { 10, 5, 10, 15, 10, 5 };
    int n = arr.length;

The array:

    Index  :  0   1   2   3   4   5
    Element: 10   5  10  15  10   5

Initialization:
    boolean visited[] = new boolean[n]; // {false, false, false, false, false, false}
    for (int i = 0; i < n; i++) starts iterating over each element.

Step-by-Step Execution:
    Iteration 1 (i = 0):
    visited[0] == false, so we proceed.
    visited[0] = true; → {true, false, false, false, false, false}
    count = 1
    Inner Loop (j = 1 to 5):
    j = 1: arr[0] != arr[1] (10 ≠ 5) → Skip
    j = 2: arr[0] == arr[2] (10 == 10) → visited[2] = true, count++ → {true, false, true, false, false, false}
    j = 3: arr[0] != arr[3] (10 ≠ 15) → Skip
    j = 4: arr[0] == arr[4] (10 == 10) → visited[4] = true, count++ → {true, false, true, false, true, false}
    j = 5: arr[0] != arr[5] (10 ≠ 5) → Skip
Prints: 10 appears 3 times

Iteration 2 (i = 1):
    visited[1] == false, so we proceed.
    visited[1] = true; → {true, true, true, false, true, false}
    count = 1
    Inner Loop (j = 2 to 5):
    j = 2: arr[1] != arr[2] (5 ≠ 10) → Skip
    j = 3: arr[1] != arr[3] (5 ≠ 15) → Skip
    j = 4: arr[1] != arr[4] (5 ≠ 10) → Skip
    j = 5: arr[1] == arr[5] (5 == 5) → visited[5] = true, count++ → {true, true, true, false, true, true}
Prints: 5 appears 2 times

Iteration 3 (i = 2):
    visited[2] == true, so skip this iteration.

Iteration 4 (i = 3):
    visited[3] == false, so we proceed.
    visited[3] = true; → {true, true, true, true, true, true}
    count = 1
    Inner Loop (j = 4 to 5):
    j = 4: arr[3] != arr[4] (15 ≠ 10) → Skip
    j = 5: arr[3] != arr[5] (15 ≠ 5) → Skip
    Prints: 15 appears 1 time

Iteration 5 (i = 4):
    visited[4] == true, so skip this iteration.
    Iteration 6 (i = 5):
    visited[5] == true, so skip this iteration.

 */
