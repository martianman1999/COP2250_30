
package CarlyEventPrice;
import javax.swing.*;

/**
 *
 * @author Charles
 */
public class CarlyEventPrice {
    public static void main(String[] args) {
        int amount;
        boolean large;
        int cost;
        int bigparty;
        bigparty = (int) 50;
        String amountString;
        amountString = JOptionPane.showInputDialog(null,"Enter number of guests");
        amount = Integer.parseInt(amountString);
        cost = 35 * (int)(amount);
        JOptionPane.showMessageDialog(null,
        "Carly's makes food that makes it a party. \n There are " + amount + " guests.\n The total price is $"
        + cost + " USD"
        );
        large = bigparty <= amount;
        JOptionPane.showMessageDialog(null,"The party is a large event: " + large);
        
        
    }
}
