import java.util.HashSet;
import java.util.Iterator;//package must for iterator function to be performed 


public class Hashing {
   public static void main(String args[]) {
      //Creating
       HashSet<Integer> set = new HashSet<>();
      
       //Add
       set.add(1);
       set.add(2);
       set.add(3);
       set.add(1);


       //Size
       System.out.println("size of set is : " + set.size());


       //Search-contains
       if(set.contains(1)) {
           System.out.println("present");
       }


       if(!set.contains(6)) {
           System.out.println("absent");
       }


       //Delete
       set.remove(1);
       if(!set.contains(1)) {
           System.out.println("absent");
       }


       //Print all elements
       System.out.println(set);//in bracket the name of the set to be put 


       //Iteration - HashSet does not have an order
      //hasNext; next functions 
       set.add(0);
       Iterator it = set.iterator();
        while (it.hasNext()) {
           System.out.print(it.next() + ", ");
       }
       System.out.println();


       //isEmpty
       if(!set.isEmpty()) {
           System.out.println("set is not empty");
       }
   }
}




