import java.util.ArrayList;

public class ForEachLoop {
  public static void main(String[] args) {
    // for-each = trabersing technique to iterate through the elements in an array/collection 
    // less steps, more readable 
    // less felxible 
    // : means in

    // String[] animals = {"lion", "tiger", "cheetah", "zebra", "rhino", "giraffe"};
    ArrayList<String> animals = new ArrayList<String>();
    animals.add("eagle");
    animals.add("wolf");
    animals.add("horse");
    animals.add("jaguar");

    for (String i : animals) {
      System.out.println(i);
    }
  }
}
