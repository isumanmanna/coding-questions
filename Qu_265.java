import java.io.*;

public class Qu_265 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Enter choice (c for Coffee, t for Tea, s for Soups, b for Beverages): ");

    char mainChoice = Character.toLowerCase(br.readLine().charAt(0));

    System.out.print("Enter choice : ");
    int subChoice = Integer.parseInt(br.readLine());

    String item = "INVALID OUTPUT!";

    switch (mainChoice) {
      case 'c':
        switch (subChoice) {
          case 1:
            item = "Espresso Coffee";
            break;
          case 2:
            item = "Cappuccino Coffee";
            break;
          case 3:
            item = "Latte Coffee";
            break;
        }
        break;

      case 't':
        switch (subChoice) {
          case 1:
            item = "Plain Tea";
            break;
          case 2:
            item = "Assam Tea";
            break;
          case 3:
            item = "Ginger Tea";
            break;
          case 4:
            item = "Cardamom Tea";
            break;
          case 5:
            item = "Masala Tea";
            break;
          case 6:
            item = "Lemon Tea";
            break;
          case 7:
            item = "Green Tea";
            break;
          case 8:
            item = "Organic Darjeeling Tea";
            break;
        }
        break;

      case 's':
        switch (subChoice) {
          case 1:
            item = "Hot and Sour Soup";
            break;
          case 2:
            item = "Veg Corn Soup";
            break;
          case 3:
            item = "Tomato Soup";
            break;
          case 4:
            item = "Spicy Tomato Soup";
            break;
        }
        break;

      case 'b':
        switch (subChoice) {
          case 1:
            item = "Hot Chocolate Drink";
            break;
          case 2:
            item = "Badam Drink";
            break;
          case 3:
            item = "Badam-Pista Drink";
            break;
        }
        break;
    }

    if (!item.equals("INVALID OUTPUT!")) {
      System.out.println("Welcome to CCD!");
      System.out.println("Enjoy your " + item + "!");
    } else {
      System.out.println("INVALID OUTPUT");
    }

  }
}