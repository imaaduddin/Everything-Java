// public class MatchClass {
//   public static void main (String[] args) {
//     double x = 3.14;
//     double y = -10;

    // can also do double z = Math.floor(x);
    // System.out.println(z);

//     System.out.println(Math.max(x, y));
//     System.out.println(Math.min(x, y));
//     System.out.println(Math.abs(y));
//     System.out.println(Math.sqrt(x));
//     System.out.println(Math.round(x));
//     System.out.println(Math.ceil(x)); // round up
//     System.out.println(Math.floor(x)); // round down
//   }
// }


// Finding Hypotenuse 
import java.util.Scanner;

public class MatchClass {
  public static void main(String[] args) {
    double x;
    double y;
    double z;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter side x: ");
    x = scanner.nextDouble();
    System.out.println("Enter side y: ");
    y = scanner.nextDouble();

    z = Math.sqrt((x * x) + (y * y));

    System.out.println("The hypotenuse is: " + z);

    scanner.close(); // this is to close scanner after use
    
  }
}
