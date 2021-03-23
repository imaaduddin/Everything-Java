public class ToStringMethod {
  public static void main(String[] args) {
    // toString() = a special method that all objects inherit, that returns a string that "textually represents" an object
    // can be used both implicitly and explicitly 

    ToStringMethodTwo car = new ToStringMethodTwo();

    // System.out.println(car.color);
    // System.out.println(car.make);
    // System.out.println(car.model);
    // System.out.println(car.year);

    System.out.println(car.toString());
    System.out.println(car);
  }
}
