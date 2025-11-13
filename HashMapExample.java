import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        Map<String, Integer> userAges = new HashMap<>();

        userAges.put("Alice", 30);
        userAges.put("Bob", 25);
        userAges.put("Charlie", 35);
        userAges.put("David", 25);
        
        userAges.put("Alice", 31); 

        System.out.println("1. Initial Map: " + userAges);

        int bobsAge = userAges.get("Bob");
        System.out.println("2. Bob's Age: " + bobsAge); 

        Integer frankAge = userAges.get("Frank");
        System.out.println("3. Frank's Age (Not Found): " + frankAge); 
        
        System.out.println("4. Contains Key 'Charlie'? " + userAges.containsKey("Charlie"));
        System.out.println("5. Map Size: " + userAges.size());
        
        userAges.remove("David"); 
        System.out.println("6. After removing David: " + userAges);


    }
}