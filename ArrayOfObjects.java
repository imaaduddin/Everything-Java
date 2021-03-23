public class ArrayOfObjects {
  public static void main(String[] args) {
    // int[] numbers = new int[3];
    // char[] characters = new char[4];
    // String[] strings = new String[5];

    ArrayOfObjectsTwo[] fridge = new ArrayOfObjectsTwo[3];
    
    ArrayOfObjectsTwo food1 = new ArrayOfObjectsTwo("pizza");
    ArrayOfObjectsTwo food2 = new ArrayOfObjectsTwo("ramen");
    ArrayOfObjectsTwo food3 = new ArrayOfObjectsTwo("sushi");

    fridge[0] = food1;
    fridge[1] = food2;
    fridge[2] = food3;

    System.out.println(fridge[0].name);
    System.out.println(fridge[1].name);
    System.out.println(fridge[2].name);
    


  }
}
