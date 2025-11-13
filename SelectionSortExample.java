public class SelectionSortExample {

    public static void selectionSort(int[] arr) {
        int n = arr.length;
       
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; 
                }
            }
        
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] data = {64, 25, 12, 22, 11};
        System.out.println("Original Array: " + java.util.Arrays.toString(data));
        
        selectionSort(data);
        
        System.out.println("Sorted Array: " + java.util.Arrays.toString(data));
    }
}