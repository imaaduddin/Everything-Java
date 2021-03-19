public class Constructors {
  public static void main(String[] args) {
    // constructor = a special method that is called when an object is instantiated (created)

    ConstructorsTwo animeCharacter = new ConstructorsTwo("Itachi", 19, 950.99);
    ConstructorsTwo animeChaaracter2 = new ConstructorsTwo("Kisame", 25, 880.99);

    System.out.println(animeCharacter.name);
    System.out.println(animeChaaracter2.strength);
    animeCharacter.train();
    animeChaaracter2.eat();
  }
}
