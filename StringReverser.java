public class StringReverser {
    public static void main(String[] args) {
        String original = "aman sharma";
        String reversed = reverseString(original);     
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        String reversedString = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            reversedString = reversedString + charArray[i];
        }
        return reversedString;
    }
}