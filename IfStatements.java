public class IfStatements {
  // if statement performs a block of code if it's condition evaluates to be true 
  public static void main(String[] args) {
    int age = 13;

    if (age >= 13) {
      System.out.println("You can come in!");
    } 
    else if (age >= 9 & age < 13) {
     System.out.println("You can come in with an adult!");
    }
    else {
      System.out.println("You can't come in!");
    }
  }
  
}
