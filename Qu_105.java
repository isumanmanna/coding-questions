import java.util.*;
public class Qu_105 {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   
   if (n==0) {
    System.out.println("The Estimated : 0 Minutes");
   } 
   else if (n>1 && n<=2000) {
    System.out.println("Time Estimated : 25 Minutes");
   }
   else if (n>2000 && n<=4000) {
    System.out.println("Time Estimated : 35 Minutes");
   }
   else if (n>4000 && n<=7000) {
    System.out.println("Time Estimated : 45 Minutes");
   }
   else{
    System.out.println("INVALID INPUT");
   }
   sc.close();
  }
}
