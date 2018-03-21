package InchestoFeet;

import javax.swing.*;
/**
 *
 * @author Charles
 */
public class InchestoFeet {
    public static void main(String[] args) {
        final int INCHESINFOOT = 12;
        int inches;
        int feet; 
        int inchesleft;
        String inchesString;
        inchesString = JOptionPane.showInputDialog(null,"Enter inches");
        inches = Integer.parseInt(inchesString);
        feet = inches/ INCHESINFOOT;
        inchesleft = inches % INCHESINFOOT;
        System.out.println(inches + " inches is "+ feet + " feet and "+inchesleft +" inch." );
        JOptionPane.showMessageDialog(null, " " + inches + " inches is "+ feet + " feet and "+inchesleft +" inch.");
    }
}
