public class Arrays {
  public static void main(String[] args) {
    // array is used to store multiple values in a single cariable 

    String[] cars = {"Mercedes", "BMW", "Audi", "Bentley"};

    cars[0] = "Ferrari";

    for (int i = 0; i < cars.length; i++) {
      System.out.println(cars[i]);
    }
  }
}
