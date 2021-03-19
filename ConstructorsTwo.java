public class ConstructorsTwo {
  String name;
  int age;
  double strength;
  
  ConstructorsTwo (String name, int age, double strength) {
    this.name = name;
    this.age = age;
    this.strength = strength;
  }

  void train() {
    System.out.println(this.name + " is training");
  }

  void eat() {
    System.out.println(this.name + " is eating");
  }
}
