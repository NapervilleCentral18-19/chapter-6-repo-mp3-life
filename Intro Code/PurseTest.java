import java.util.*;
/**
 * Write a description of class PurseTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PurseTest
{
    
    /**
     * Constructor for objects of class PurseTest
     */
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        int flag=0;
        ArrayList <Coin> pocket = new ArrayList <Coin>();
        Coin penny = new Coin('P');
        Coin quarter = new Coin('Q');
        pocket.add(quarter);
        pocket.add(quarter);
        pocket.add(quarter);
        pocket.add(quarter);
        pocket.add(penny);
        Purse luil = new Purse(pocket);
        while (flag !=1){
            
            System.out.println("\nA – Add a Coin\nR – Remove a Coin\n? – Display Purse\nD - Stop this program");
            String answer = keyboard.next();
            if (answer.equals("A")){
                System.out.println("What type of coin? P - Penny,N – Nickel ,D - Dime,Q - Quarter");
                char letter = keyboard.next().charAt(0);
                Coin num = new Coin(letter);
                
                luil.addCoin(num);
                
            }
            
            else if (answer.equals("R")){
                System.out.println("What type of coin? P - Penny,N – Nickel ,D - Dime,Q - Quarter");
                char letter = keyboard.next().charAt(0);
                luil.removeCoin(letter);
            }
            
            
            else if (answer.equals("?")){
                System.out.println(luil);
            }
            else if (answer.equals("D")){
                flag =1;
                
            }
            else{
                System.out.println("Error input");
                
                
            }
        }
        /*
        
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
        */
    }
    


}
