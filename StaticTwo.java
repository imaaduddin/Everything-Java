public class StaticTwo {
  String name;
  static int numberOfFriends;

  StaticTwo(String name) {
    this.name = name;
    numberOfFriends++;
  }

  static void displayFriends() {
    System.out.println("You have " + numberOfFriends + " friends");
  }
}
