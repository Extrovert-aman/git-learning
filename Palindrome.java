public class Palindrome {
    public static boolean isPalindrome(String text) {
       
        String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
  
        StringBuilder sb = new StringBuilder(cleanedText);
    
        String reversedText = sb.reverse().toString();

        return cleanedText.equals(reversedText);
    }

    public static void main(String[] args) {
        String word1 = "madam";
        String word3 = "hello";

        System.out.println("'" + word1 + "' is a palindrome: " + isPalindrome(word1));
        System.out.println("'" + word3 + "' is a palindrome: " + isPalindrome(word3));
    }
}