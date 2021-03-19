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
         for (int row = 1; row < array.length-1 && magicsquare ==true;row++)
         {
             for (int col = 0; col < array[row].length-1; col++){
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
      /*
      public int setMagicSquare(int[] [] array)
   {
       MagicSquare util= new MagicSquare();
       
       
    }
        */

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
    
        // Do you belive in magic?
        int [][] square3 = {{11,24, 7,20, 3},
                            { 4,12,25, 8,16},
                            {17, 5,13,21, 9},
                            {10,18, 1,14,22},
                            {23, 6,19, 2,15}  };
    
        MagicSquare util= new MagicSquare(square1);
        //util.setMagicSquare(square1);
        
        if (util.isMagic())
            System.out.println("It's MAGIC!! With a sum of "+ util.getMagicNum());
        else
            System.out.println("Hello muggle(not a magic square)!");
    
        //change the 2D array and retest
        //util.setMagicSquare(square2);
        /*
        if (util.isMagic())
                System.out.println("It's MAGIC!! With a sum of "+ util.getMagicNum());
            else
            System.out.println("Hello muggle");
    
        //change the 2D array and retest
        //util.setMagicSquare(square3);

        if (util.isMagic())
                System.out.println("It's MAGIC!! With a sum of "+ util.getMagicNum());
            else
        System.out.println("Hello muggle");
        */
        



      }//end of main
      
}// end of class











