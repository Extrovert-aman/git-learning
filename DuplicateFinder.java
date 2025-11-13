import java.util.Arrays;

public class DuplicateFinder {
    public static void findDuplicates(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Duplicate elements found after sorting:");
        boolean found = false;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
            
                if (i == 1 || arr[i] != arr[i - 2]) {
                    System.out.println(arr[i]);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("No duplicates found.");
        }
    }
    public static void main(String[] args) {
        int[] numbers = {1, 5, 2, 7, 5, 9, 2, 3};
        findDuplicates(numbers); 
    }
}