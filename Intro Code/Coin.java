
/**
 * Write a description of class Coin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Coin
{
    private int value;
    private char type;
    /**
     * Constructor for objects of class Coin
     */
    public Coin(char type)
    {
        this.type = type;
        if (type =='P')
            value = 1;
        else if(type == 'N'){
            value = 5;
        }
        else if(type == 'D'){
            value =10;
        }
        else if(type == 'Q'){
            value = 25;
        }
        
    }
    
    public int getValue()
    {
        return value;
        
    }
    
    public char getType()
    {
        return type;
    }
    
    public String toString()
    {
        return type + " " + value*.01;
    }
}
