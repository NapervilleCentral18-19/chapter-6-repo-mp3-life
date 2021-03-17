import java.util.ArrayList;

public class ArrayListRunner
{
   public static void main(String[] args)
   {
       ArrayList<String> names = new ArrayList<String>();
       System.out.println(names);
       
       //Part a
       names.add("Alice");
       names.add("Bob");
       names.add("Connie");
       names.add("David");
       names.add("Edward");
       names.add("Fran");
       names.add("Gomez");
       names.add("Harry");
       System.out.println(names);
       
       //part b
       System.out.println("First: "+names.get(0));
       //part d
       System.out.println("Last: "+names.get(names.size()-1));
       
       //part c
       System.out.println("Size: "+names.size());
       
       //part e
       names.set(0,"Alice B. Toklas");
       
       //part f
       names.add(4,"Doug");
       
       //part g
       for(String s: names)
       {
           System.out.print(s+" ");
       }
       System.out.println();
       
       //part h
       ArrayList<String> names2 = new ArrayList<String>(names);
       System.out.println(names2);
       //part i
       names.remove(0);
       
       System.out.println("names: "+names);
       System.out.println("names2: "+names2);
   }
} 