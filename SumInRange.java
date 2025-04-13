import java.io.*;

public class SumInRange {
  public static int rangeSum(int i, int j){
    return (j*(j+1)/2) - (i*(i-1)/2);
  }
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int T = Integer.parseInt(br.readLine());
    //br.readLine();

    for(int t=0; t<T; t++){
      String userInput = br.readLine().trim();
      String [] values = userInput.split("[, ]+");

      if (values.length<2) {
        System.out.println("Invalid Input");
        continue;
      }

      try{
        int i = Integer.parseInt(values[0]);
        int j = Integer.parseInt(values[1]);

        if (i>=j || i<0 || j>=10000) {
          System.out.println("Invalid Input");
        } else {
          System.out.println(rangeSum(i, j));
        }
      } catch (NumberFormatException e){
        System.out.println("Invalid Input");
      }
    }
  }
}
