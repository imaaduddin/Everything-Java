public class StringMethods {
  public static void main(String[] args) {
    // String is a referemce data type that can store one or more charcters 
    // reference data types have access to useful methods 

    String name = "Obito";

    // boolean result = name.equalsIgnoreCase("obito");
    // int result = name.length();
    // char result = name.charAt(0);
    // int result = name.indexOf("o");
    // boolean result = name.isEmpty();
    // String result = name.toUpperCase();
    // String result = name.toLowerCase();
    // String result = name.trim();
    String result = name.replace("o", "a");

    System.out.println(result);
  }
}
