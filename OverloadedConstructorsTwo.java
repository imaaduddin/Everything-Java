public class OverloadedConstructorsTwo {
  String bread;
  String crust;
  String sauce;
  String cheese;
  String topping;
  
  OverloadedConstructorsTwo(String bread, String crust, String sauce, String cheese, String topping) {
    this.bread = bread;
    this.crust = crust;
    this.sauce = sauce;
    this.cheese = cheese;
    this.topping = topping;
  }

  OverloadedConstructorsTwo(String bread, String crust, String sauce, String cheese) {
    this.bread = bread;
    this.crust = crust;
    this.sauce = sauce;
    this.cheese = cheese;
  }
}
