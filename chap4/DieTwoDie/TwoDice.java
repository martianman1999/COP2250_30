package DieTwoDie;
public class TwoDice 
{
    
    public static void main(String[] args) 
    {
        Dice firstDie = new Dice();
        Dice secondDie = new Dice();
        
     System.out.println("Die one is:" + firstDie.getRoll());
     System.out.println("Die two is:" + secondDie.getRoll());
    }
}
