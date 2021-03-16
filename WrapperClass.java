public class WrapperClass {
  public static void main(String[] args) {
    // wrapper class provides a way to use primitive data types as a reference data types 
    // reference data types contain useful methods 
    // they can be used with collections (ex.ArrayList)

    // primitive           wrapper
    // ---------           -------
    // boolean             Boolean
    // char                Character 
    // int                 Integer 
    // double              Double 

    // autoboxing = the automatic conversion that the ava compiler makes b/w the primitive data types and their corresponding obj warpper class 
    // unboxing = the reverse of autobocing. Automatic conversion of warpper class to primitive 

    Boolean a = true;
    Character b = '$';
    Integer c = 123;
    Double d = 3.14;
    String e = "Naruto";

    // primitve data types are a lot faster than reference 
  }
}
