public class Qu_02 {

  public static int getAllPriorElements(int [] arr){
    int firstElement = arr[0];
    int count = 1;
    for(int i=1; i<arr.length; i++){
      if (arr[i] > firstElement) {
        count++;
      }
    }
    return count;
  }
  public static void main(String[] args) {
    int arr[] = {7, 4, 8, 2, 9};

    System.out.println(getAllPriorElements(arr));
  }
}
