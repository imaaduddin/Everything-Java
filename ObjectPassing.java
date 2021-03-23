public class ObjectPassing {
  public static void main(String[] args) {
    ObjectPassingTwo garage = new ObjectPassingTwo();


    ObjectPassingThree car1 = new ObjectPassingThree("Audi");
    ObjectPassingThree car2 = new ObjectPassingThree("Mercedes");
    ObjectPassingFour motorcycle = new ObjectPassingFour("Ducatti");

    // garage.park(car1);
    // garage.park(car2);
    garage.park(car2, motorcycle);
  }
}
