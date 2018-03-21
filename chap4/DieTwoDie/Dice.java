package DieTwoDie;
public class Dice 
{
    private int Roll;
    private static final int LOWEST_DIE_VALUE = 1 ;
    private static final int HIGHEST_DIE_VALUE = 6 ;
    
    public Dice()
    {
        Roll = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);
    }
    public int getRoll()
    {
        return Roll;
    }
}
