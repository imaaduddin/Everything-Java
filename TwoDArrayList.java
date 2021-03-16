import java.util.*;

public class TwoDArrayList {
  public static void main(String[] args) {
    // 2D ArrayList = a dynamic list of lists 
    //You can chnage the size of these lists during runtime 

    ArrayList<ArrayList<String>> groceryList = new ArrayList();

    ArrayList<String> bakeryList = new ArrayList();
    bakeryList.add("pasta");
    bakeryList.add("garlic bread");
    bakeryList.add("donuts");

    ArrayList<String> produceList = new ArrayList();
    produceList.add("tomatoes");
    produceList.add("mushrooms");
    produceList.add("spinach");

    ArrayList<String> drinksList = new ArrayList();
    drinksList.add("iced tea");
    drinksList.add("lemonade");
    drinksList.add("coca cola");

    groceryList.add(bakeryList);
    groceryList.add(produceList);
    groceryList.add(drinksList);

    System.out.println(groceryList.get(0).get(0));
  }
}
