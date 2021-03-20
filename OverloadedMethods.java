public class OverloadedMethods {
  public static void main(String[] args) {
    // overloaded methods = methods that share the same name but have different parameters 
    // method name + parameter = method signature 

    int x = add(3, 4);
    double y = add(3.14, 2.34, 9.99, 2.34);

    System.out.println(x);
    System.out.println(y);

  }

  static int add(int a, int b) {
    System.out.println("This is overload 1");
    return a + b;
  }

  static int add(int a, int b, int c) {
    System.out.println("This is overload 2");
    return a + b + c;
  }

  static int add(int a, int b, int c, int d) {
    System.out.println("This is overload 3");
    return a + b + c + d;
  }


  static double add(double a, double b) {
    System.out.println("This is overload 4");
    return a + b;
  }

  static double add(double a, double b, double c) {
    System.out.println("This is overload 5");
    return a + b + c;
  }

  static double add(double a, double b, double c, double d) {
    System.out.println("This is overload 6");
    return a + b + c + d;
  }
}
