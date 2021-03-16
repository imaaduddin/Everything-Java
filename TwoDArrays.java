public class TwoDArrays {
  public static void main(String[] args) {
    // 2D arrays is an array of arrays 

    // One way of writing it
    // String [][] cars = new String [3][3];

    // cars[0][0] = "Ferrari";
    // cars[0][1] = "Mercedes";
    // cars[0][2] = "BMW";

    // cars[1][0] = "Audi";
    // cars[1][1] = "Lambo";
    // cars[1][2] = "Tesla";

    // cars[2][0] = "Porche";
    // cars[2][1] = "Aston Martin";
    // cars[2][2] = "Bugatti";

    // another way:
    String[][] cars = {{"Ferrari", "Mercedes", "BMW"}, {"Audi", "Lambo", "Tesla"}, {"Porche", "Aston Martin", "Bugatti"}};

    for (int i = 0; i < cars.length; i ++) {
      System.out.println();
      for (int j = 0; j < cars[i].length; j++) {
        System.out.println(cars[i][j]+ " ");
      }
    }
  }
}
