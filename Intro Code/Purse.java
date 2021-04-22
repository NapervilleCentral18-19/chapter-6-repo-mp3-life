import java.util.*;

/**
 * Write a description of class PurseLab here.
 *
 * @author (Mike Parker)
 * @version (4/8/21)
 */
public class Purse
{
    private ArrayList <Coin> pocket = new ArrayList<Coin>();
    public Purse(ArrayList <Coin> pocket)
    {
        for(int i =0; i<pocket.size() ;i++){
            this.pocket.add(pocket.get(i));
            
            
        }
        
    }
    public double getTotal()
    {
        double total=0;
        for( int i = 0; i< pocket.size() ;i++){
         total += pocket.get(i).getValue();
         
        }
        total*=0.01;
        return total;
    }
    
    
    /**
     * 
     */
    public int getNumberofDimes()
    {
        int d=0;
        for( int i =0; i< pocket.size(); i++){
            if(pocket.get(i).getValue() == 10)
            {
                d+= 1;
            }
        
        }
        return d;
    }
    
    /**
     * 
     */
    public int getNumberofPenny()
    {
        int p=0;
        for( int i =0; i< pocket.size(); i++){
            if(pocket.get(i).getValue() == 1)
            {
                p+= 1;
            }
        
        }
        return p;
    }
    
    /**
     * 
     */
    public int getNumberofNickels()
    {
        int n=0;
        for( int i =0; i< pocket.size(); i++){
            if(pocket.get(i).getValue() == 5)
            {
                n+= 1;
            }
        
        }
        return n;
    }
    
    /**
     * 
     */
    public int getNumberofQuarters()
    {
        int q=0;
        for( int i =0; i< pocket.size(); i++){
            if(pocket.get(i).getValue() == 25)
            {
                q+= 1;
            }
        
        }
        return q;
    }
    
    public String toString()
    {
       return getNumberofPenny() +" Pennies \t .01\n" + getNumberofNickels()+" Nickels \t .05\n"+getNumberofDimes()+" Dimes \t .10\n"+getNumberofQuarters()+" Quarters \t .25\n Total $"+getTotal() ;
        
    }
    
    public void addCoin(Coin bit)
    {
        pocket.add(bit);
        
    }
    
    public Coin removeCoin(char type)
    {
        for( int i=0 ; i< pocket.size();i++){
            if(pocket.get(i).getType() == type)
            {
                return pocket.remove(i);
                
            }
            
        }
        System.out.println("no coin was found in the purse");
        return null;
    }
}
