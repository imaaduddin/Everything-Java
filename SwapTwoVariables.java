public class SwapTwoVariables {
  public static void main (String[] args) {
    String x = "Gatorade";
    String y = "Kool-Aid";
    String z;

    z = x;
    x = y;
    y = z;

    System.out.println("x: " + x);
    System.out.println("y: " + y);
  }
}
