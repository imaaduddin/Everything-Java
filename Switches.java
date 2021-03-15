public class Switches {
  public static void main(String[] args) {
    // switch is a statement that allows a variable to be tested for equality against a list of values 

    String month = "Friday";

    switch (month) {
      case "January": System.out.println("It's January");
      break;
      case "Febuary": System.out.println("It's Febuary");
      break;
      case "March": System.out.println("It's March");
      break;
      case "April": System.out.println("It's April");
      break;
      case "May": System.out.println("It's May");
      break;
      case "June": System.out.println("It's June");
      break;
      case "July": System.out.println("It's July");
      break;
      case "August": System.out.println("It's August");
      break;
      case "September": System.out.println("It's September");
      break;
      case "October": System.out.println("It's October");
      break;
      case "November": System.out.println("It's November");
      break;
      case "December": System.out.println("It's December");
      break;
      default: System.out.println("That's not a month!");
    }
  }
}
