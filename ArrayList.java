// import java.util.List;
import java.util.ArrayList;

public class ArrayList {
  public static void main(String[] args) {
    // ArrayList is a resizable array
    // Elements can be added and removed after compilation phase 
    // Store reference data types 

    ArrayList<String> food = new ArrayList<String>();

    food.add("sushi");
    food.add("ramen");
    food.add("rice ball");

    food.set(0, "fried squid");
    food.remove(2);
    food.clear();

    for (int i = 0; i < food.size(); i++) {
      System.out.println(food.get(i));
    }
  }
}
