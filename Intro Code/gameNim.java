import java.util.Scanner;
/**
 * Write a description of class gameNim here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class gameNim
{


    public static void main (String[] args)
    {
        int [] nimhand ={3,5,8};
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Player's turn");
        System.out.print("Choose a stack#: ");
        int stacknum= keyboard.nextInt();
        System.out.print("Choose how many you'd like to take: ");
        int mount = keyboard.nextInt();
        nimhand[stacknum-1] -= amount;
        for (int stack =0; stack < nimhand.length; stack++){
            for (int counter = 0; counter<nimhand[stack];counter++){
             System.out.println("0");   
            }
            System.out.print("\n");
            
            
        }

        System.out.println("Computer's Turn.");
        boolean stop = false;
        while(stop != true){
         int cstacknum = (int)Math.random()*3;
        }
        
        
        for (int stack =0; stack < nimhand.length; stack++){
            for (int counter = 0; counter<nimhand[stack];counter++){
             System.out.println("0");   
            }
            System.out.print("\n");
        
        
        }
    }

}
