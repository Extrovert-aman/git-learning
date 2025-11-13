import java.util.LinkedList;
import java.util.Iterator; 

public class LinkedListExample {
    public static void main(String[] args) {
    
        LinkedList<String> names = new LinkedList<>();

        names.add("Alice");       
        names.addLast("Bob");     
        names.addFirst("Zach");   
        names.add(1, "Charlie");  

        System.out.println(" Initial List: " + names);

        System.out.println(" First element: " + names.getFirst()); 
        System.out.println(" Last element: " + names.getLast()); 

        System.out.println("\n Iterating with Enhanced For Loop");
        for (String element : names) {
            System.out.println("  -> " + element);
        }
        
        names.removeFirst(); 
        names.remove("Bob"); 

        System.out.println(" Final List after removals: " + names);
    
    }
}