public class ObjectPassingTwo {

  void park(ObjectPassingThree car, ObjectPassingFour motorcycle) {
    System.out.println("The " + car.name + " is parked in the garage");
    System.out.println("The " + motorcycle.name + " is also aprked in the garage");
  }
}
