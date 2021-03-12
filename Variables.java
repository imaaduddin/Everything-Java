// Variable - A variable is a placeholder for a value that behaves as the value it contains.
// Data Types:     Size:     Primitive/Refernce:     Value:
// boolean         1 bit     primitive               true or false
// byte            1 byte    primitive               -128 to 127
// short           2 bytes   primitive               -32,768 to 32,767
// int             4 bytes   primitive               -2 billion to 2 billion
// long            8 bytes   primitive               -9 quintillion to 9 quintillion

// float           4 bytes   primitive               fractional number up to 6-7 digits ex: 3.141592f, float value needs to end with letter 'f'
// double          8 bytes   primitive               fractional number up to 15 digits ex: 3.141592653589793

// char            2 bytes   primitive               single charcter/letter/ASCII value ex: 'f', has to be surrounded by single quotes not double quotes 
// String          varies    reference               a sequence of charcters ex: "Hello world!"

/* Primitives have 8 types(boolean, byte, etc.)
Primitives store data
Can only hold one value 
Less memory 
Fast
*/

/* Reference is unlimited (user defined)
Stores an address
Could hold more than 1 value
More memory 
Slower
*/

public class Variables {
  public static void main (String[] args) {
    // int x; // Decleration 
    // x = 123; // Assignment
    int y = 123; // Initialization
    double z = 3.14;
    boolean a = true;
    char letter = 'i';
    String name = "Imaad"; // String is capital because it's a reference data type 

    System.out.println("Hello " + name + y); // the + sign means concatenation where you can combine text and variables inot a print statement
  }
}
