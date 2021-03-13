// GUI - Graphical User Interface

import javax.swing.JOptionPane;

public class GUIIntro {
  public static void main (String[] args) {
    String name = JOptionPane.showInputDialog(null, "Enter your name:");
    JOptionPane.showMessageDialog(null, "Hello " + name + " welcome to the villiage hidden in the leaves.");

    int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your age:")); // showInputDialog will always return a string but if you are saving it to an int you need to do as shown in this line of code.
    JOptionPane.showMessageDialog(null, "Your age is " + age + " you are free to enter.");

    double height = Integer.parseInt(JOptionPane.showInputDialog(null, "How tall are you? (inches)")); // showInputDialog will always return a string but if you are saving it to an int you need to do as shown in this line of code.
    JOptionPane.showMessageDialog(null, "You are " + height + " inches tall.");
  }
}
