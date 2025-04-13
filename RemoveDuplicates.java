public class RemoveDuplicates {
  public static void main(String[] args) {
    int [] nums =  {1, 1, 2, 2, 3, 4, 4, 5};

    int newLength = remove(nums);
    for (int i=0; i<newLength; i++){
      System.out.print(nums[i] + " ");
    }
    
  }

  static int remove (int [] nums){

    if (nums.length == 0){
      return 0;
    }

    int j=0;

    for (int i=1; i<nums.length; i++){
      if (nums[i] != nums[j]) {
        j++;
        nums[j] = nums[i];
      }
    }
    return j+1;
  }
}
