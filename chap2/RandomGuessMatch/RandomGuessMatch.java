
package RandomGuessMatch;
import javax.swing.*;
/**
 *
 * @author Charles
 */
public class RandomGuessMatch {
    public static void main(String[] args) {
        int guess;
        boolean right;
        int rannum;
        String guessString;
        guessString = JOptionPane.showInputDialog(null,"Enter Guess 1-10");
        guess = Integer.parseInt(guessString);
        rannum = 1 + (int)(Math.random() * 10);
        right = guess == rannum;
        JOptionPane.showMessageDialog(null, "The right number is " + rannum + " your answer was " + right);
        
    }
}
