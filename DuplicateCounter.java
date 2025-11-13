import java.util.HashSet;
import java.util.Set;

public class DuplicateCounter {
    public static int countDuplicates(int[] arr) {
    
        Set<Integer> uniqueElements = new HashSet<>();
        
        int duplicateCount = 0;

        for (int element : arr) {
            if (!uniqueElements.add(element)) {
                duplicateCount++;
            }
        }
        return duplicateCount;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 5, 2, 7, 5, 9, 3};
        
        int count = countDuplicates(numbers);
        
        System.out.println("Original Array: " + java.util.Arrays.toString(numbers));
        System.out.println("Total number of duplicate occurrences: " + count); 
        
    }
}