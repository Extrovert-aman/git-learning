import java.util.ArrayList;

public class ArrayListExample{
    public static void main(String[] args) {
        
        ArrayList<String> fruits = new ArrayList<>();
        System.out.println("Initial list size: " + fruits.size());
       
        fruits.add("Apple");      
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add(1, "Grape");  

        System.out.println("\nAfter adding elements: " + fruits);
        
        String firstFruit = fruits.get(0);
        String thirdFruit = fruits.get(2);
        
        System.out.println("First element (index 0): " + firstFruit); 
        System.out.println("Third element (index 2): " + thirdFruit); 

        fruits.set(3, "Mango");
        
        System.out.println("\nAfter updating index 3: " + fruits);

        fruits.remove(1); 

        System.out.println("After removing elements: " + fruits);
        System.out.println("Final list size: " + fruits.size()); 
        
        System.out.println("Is the list empty? " + fruits.isEmpty()); 
    }
}