import java.util.*;
public class Qu_200 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in); 

    int n = sc.nextInt();
    int k = sc.nextInt();
    int j = sc.nextInt();
    int m = sc.nextInt();
    int p = sc.nextInt();

    int ateBannana=0, atePeanut=0;

    if (n<0 || k<0 || j<0 || m<0 || p<0) {
      System.out.println("Invalid Input");
    }
    else{
      if(k>0)
        ateBannana = m/k;
      if(j>0)
        atePeanut = p/j;
      n = n-ateBannana-atePeanut;
      System.out.println("Number of Monkeys left on the Tree: "+n);
    }
  }
}
