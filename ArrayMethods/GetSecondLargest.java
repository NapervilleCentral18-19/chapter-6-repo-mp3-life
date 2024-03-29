import java.util.Random;

public class GetSecondLargest
{
   public int getSecondLargest(int[] arr)
   {
      // One way to do it: Find maximum once.
      int largest = 0;
      int secLargest = 0;
      
      for (int i = 0; 1 < arr.length; i++){
         if (arr[i] > largest){
             secLargest = largest;
             largest= arr[i];
            }
         
        }
      return largest;
      // 2. Find the max again, ignoring the real max.
      //int oldMax = max;
      //max = arr[0];

   }

   public static void main(String[] args)
   {
      int[] randoms = new int[10];
      Random generator = new Random();

      // Create a test array containing random numbers.
      for (int i = 0; i < randoms.length; i++)
      {
         randoms[i] = generator.nextInt(100) + 1;
         // Print the values as they are assigned.
         System.out.print(randoms[i] + " ");
      }
      System.out.println();

      // Find the second largest.
      GetSecondLargest util = new GetSecondLargest();
      System.out.println("The second largest number is "
            + util.getSecondLargest(randoms));
   }
}
