import java.util.*;
/**
 * Write a description of class StoreLab here.
 *
 * @author (Mike Parker)
 * @version (3/24/21)
 */
public class StoreDemo
{

    /**
     * Constructor for objects of class StoreLab
     */
    public static void main(String[] args)
    {
        Store myStore = new Store();
        Scanner in = new Scanner(System.in);      
        boolean done = false;      
        int i = 0;
        
        while (!done)      
        {         
            System.out.println("Enter the price: ");
            double d = in.nextDouble();         
            if (d == 0)         
            {            
                done = true;
            }
            else         
            {            
                // supply your code         
            }
        }
        System.out.println("Best customers's name "+ myStore.nameOfBestCustomer());
        
    }
}