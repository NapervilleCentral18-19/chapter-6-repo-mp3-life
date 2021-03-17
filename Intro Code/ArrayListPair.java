import java.util.ArrayList;
/**
 * Write a description of class ArrayListPair here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayListPair
{
     public static void main(String[] args)
   {
       ArrayList<String> names = new ArrayList<String>();
       System.out.println(names);
       // Alice, Bob, Connie, David, Edward, Fran, Gomez, Harry.
       names.add("Alice");
       names.add("Bob");
       names.add("Connie");
       names.add("David");
       names.add("Edward");
       names.add("Fran");
       names.add("Gomez");
       names.add("Harry");
       System.out.println(names);
       
       System.out.println("First: " +names.get(0));
       
       System.out.println("Last: "+names.get(names.size()-1));
       
       System.out.println("Size"+ names.size());
       
       names.get(0," Alice B. Toklas");
       
       names.add(4 + " Doug");
       
       
       
       for(String s: names){
         System.out.print(s+" ");
         
           
        }
       System.out.println();
       ArrayList<String> names2 = new ArrayList<String>(names);
       
       
       
       
       
       
   }
}
