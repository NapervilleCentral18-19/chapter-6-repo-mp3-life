/********************************************************************
// Starter Code for Magic Square


import
//******************************************************************* */
//Mike Parker 
// Useful = util (in this code)

import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.*;
import java.util.*;
public class MagicSquare

{       //final static int MAX = 15;
   int MagicNum =0;
   
   private int [][] array;
      public MagicSquare(int[] [] array)
   {
          
       for (int col = 0; col < array[1].length; col++)
            {
             MagicNum += array [1] [col];   
            }
            
            
        }
        
      public boolean isMagic()
   {
         int truth = 0;
         boolean magicsquare = true;
         for (int row = 1; magicsquare == true;row++)
         {
             for (int col = 0; col == row; col++){
                 truth += array [row] [col];
                 
                 
                 
                }
             if (truth != MagicNum)
                magicsquare = false;
             
             
             truth = 0;
             
             
            }
         return magicsquare;
          
        }
        
      public int getMagicNum()
   {
       
       return MagicNum;
        }
      
      public int setMagicSquare(int[] [] array)
   {
       return this.MagicNum = MagicNum;
       
       
     }
        

      public static void main (String[] args)
   {

    
        // make a 2d array with an iniitalizer list.
        //If you test this and it not Magic your waving your wand wrong
    
        int [][] square1 = { {16,3, 2,13},
                            {5,10,11, 8},
                            {9, 6, 7,12},
                            {4,15,14, 1}  };
    
        // magic square or not a magic square, that is the question
        int [][] square2 = { {5,9,1},
                             {7,2,6},
                             {3,4,8}  };
    

    
        MagicSquare util= new MagicSquare(square1);
        util.setMagicSquare(square1);
        
        if (util.isMagic() == false)
            System.out.println("It's MAGIC!! With a sum of "+ util.getMagicNum());
        else
            System.out.println("Hello muggle1");
    
        //change the 2D array and retest
        util.setMagicSquare(square2);
        
        if (util.isMagic()==true)
                System.out.println("It's MAGIC!! With a sum of "+ util.getMagicNum());
            else
            System.out.println("Hello muggle2");
    



      }//end of main
      
}// end of class











