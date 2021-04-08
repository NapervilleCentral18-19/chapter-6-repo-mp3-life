import java.util.*;
import java.util.Scanner;
/**
 * Write a description of class PurseLab here.
 *
 * @author (Mike Parker)
 * @version (4/8/21)
 */
public class PurseLab
{
    public double p, n, d, q, num;
    public Scanner keyboard = new Scanner(System.in);
    /**
     * Constructor for objects of class PurseLab
     */
    public PurseLab()
    {
        int flag=0;
        while (flag!= 2){
            System.out.println("Currently in your purse there are: \npennies - "+p+"\nnikles - "+n+"\ndimes - "+d+"\nquarters - "+q);
            System.out.println("Would you like to change the number of coin in your purse (yes=1, no=2)");
            flag = keyboard.nextInt();
            if (flag == 1){
                double getNumberofPenny;
                double getNumberofNickels;
                double getNumberofDimes;
                double getNumberofQuarters;
            }
        }
        
    }
    
    /**
     * 
     */
    public double getNumberofDimes()
    {
        System.out.println("Would you like to add any dimes or remove any (a=add / r=remove) currently you have "+ d +"dimes.");
        getValue();
        num*=.1;
        d+=num;
        return d;
    }
    
    /**
     * 
     */
    public double getNumberofPenny(double p)
    {
        System.out.println("Would you like to add any pennies or remove any (a=add / r=remove) currently you have "+ p +"pennies.");
        getValue();
        num*=.01;
        p+=num;
        return p;
    }
    
    /**
     * 
     */
    public double getNumberofNickels(double n)
    {
        System.out.println("Would you like to add any nickels or remove any (a=add / r=remove) currently you have "+ n +"nickels.");
        getValue();
        num*=.05;
        n+=num;
        return n;
    }
    
    /**
     * 
     */
    public double getNumberofQuarters(double q)
    {
        System.out.println("Would you like to add any quarters or remove any (1=add / 2=remove) currently you have "+ q +"quarters.");
        getValue();
        num*=.25;
        q+=num;
        return q;
    }
    
    public double getValue()
    {
        num= 0;
        int value = keyboard.nextInt();
        if (value==1){
            System.out.println("How many would you like to add: ");
            num = keyboard.nextInt();
        }
        else{
            System.out.println("How many would you like to remove: ");
            num= keyboard.nextInt();
            num*= -1;
            
        }
        return num;
    }
}
