public class Static {
  public static void main(String[] args) {
    // static = modifier, a single copy of a variable/method is created and shared 
    // the class "owns" the static member 

    StaticTwo friendOne = new StaticTwo("Choji");
    StaticTwo friendTwo = new StaticTwo("Shikimaru");

    // System.out.println(StaticTwo.numberOfFriends);
    StaticTwo.displayFriends();
  }
}
