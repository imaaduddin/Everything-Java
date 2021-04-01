public class MethodOverriding {
  public static void main(String[] args) {
    // method overriding = declaring a method in sub class which is already present in parent class done so that a child can give its own implementation 

    MethodOverridingTwo lion = new MethodOverridingTwo();
    MethodOverridingThree tiger = new MethodOverridingThree();

    lion.speak();
    tiger.speak();
  }
}
