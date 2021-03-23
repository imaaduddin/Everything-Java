public class ToStringMethodTwo {
  String make = "Mercedes";
  String model = "e63";
  String color = "black";
  int year = 2021;

  public String toString() {
    String myString = make + "\n" + model + "\n" + color + "\n" + year;
    return myString;
  }

}
