
/**
 * Write a description of class nim here.
 *
 * @author (Mike Parker, Kyle Smith, Adebowale Hassan)
 * @version (3/12/20)
 */
import java.util.Random;
import java.util.Scanner;

public class nim
{
    public static void main (String[] args)
{
    Random rand = new Random();
    Scanner keyboard = new Scanner(System.in);
    int [] nimhand = {3,5,8};
    boolean win = false;
    String winner = "";
    boolean comp = false;
    
    while (win == false){
        if (nimhand[0] != 0 || nimhand[1] != 0 || nimhand[2] != 0)
        {
            System.out.println("Player's turn.");
         
            System.out.print("Choose a stack #: ");
            int stacknum = keyboard.nextInt();
            System.out.print("Choose how many you'd like to take: ");
            int amount = keyboard.nextInt();
            
            nimhand[stacknum-1] -= amount;
               for (int stack = 0; stack < nimhand.length; stack++){
                for (int counter = 0; counter < nimhand[stack]; counter++){
                    System.out.print("O");
            }
            System.out.print("\n");
            }
        }
        else {
            win = true;
            winner = "Player";
            comp = true;
        }
        if (nimhand[0] != 0 || nimhand[1] != 0 || nimhand[2] != 0)
        {
            System.out.println("Computer's Turn.");
            
            int cstacknum = 0;
            boolean stop = false;
            while (stop != true){
                cstacknum = rand.nextInt(3);
                if (nimhand[cstacknum] != 0)
                    stop = true;
            }
            
            int userstack = cstacknum + 1;
            int camount = rand.nextInt(nimhand[cstacknum])+1;
            System.out.println("The computer took "+camount+" from stack "+userstack+".");
            nimhand[cstacknum] -= camount;
               for (int stack = 0; stack < nimhand.length; stack++){
                for (int counter = 0; counter < nimhand[stack]; counter++){
                    System.out.print("O");
            }
            System.out.print("\n");
            }
        }
        else{
            win = true;
            if (comp != true)
                winner = "Computer";
        }
    }
    
    System.out.println(winner + " won!");
}
}
