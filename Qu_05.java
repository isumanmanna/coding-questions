import java.io.*;
public class Qu_05 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int T = Integer.parseInt(br.readLine());

    int [] E = new int[T];
    int [] L = new int[T];

    for(int i=0; i<T; i++){
      E[i] = Integer.parseInt(br.readLine());
    }

    for(int i=0; i<T; i++){
      L[i] = Integer.parseInt(br.readLine());
    }

    int currentGuests = 0;
    int maxGuests = 0;

    for(int i=0; i<T; i++){
      currentGuests += E[i];
      currentGuests -= L[i];

      if (currentGuests > maxGuests) {
        maxGuests = currentGuests;
      }
    }
    System.out.println(maxGuests);
  }
}
