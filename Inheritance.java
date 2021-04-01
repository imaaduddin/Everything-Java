public class Inheritance {
  public static void main(String[] args) {
    // inheritance = the process where one class acquires the attributes and methods of another 

    InheritanceThree car = new InheritanceThree();

    car.go();

    InheritanceFour bike = new InheritanceFour();
    bike.stop();

    System.out.println(car.speed);
    System.out.println(bike.speed);
  }
}
