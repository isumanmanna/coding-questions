public class Largest {
    public static void main(String[] args) {
        int [] arr = {3, 37, 6, 37, 25};
        int ans = largestNum(arr);
        System.out.println(ans);
    }
    static int largestNum(int [] arr){
        int big = arr[0];
        for(int i=1; i<arr.length; i++){
            if (arr[i]>big) {
                big = arr[i];
            }
        }
        return big;
    }
}
