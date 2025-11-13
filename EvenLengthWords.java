public class EvenLengthWords {
    public static void printEvenLengthWords(String text) {
        String[] words = text.split("\\s+");

        System.out.println("Original String: " + text);
        System.out.println("Even-length words are:");

        for (String word : words) {
            
            String cleanWord = word.replaceAll("[^a-zA-Z]", ""); 

            if (cleanWord.length() % 2 == 0 && cleanWord.length() > 0) {
                
                System.out.println(word);
            }
        }
    }
    public static void main(String[] args) {
        String sentence = "This is a simple Java program to find even length words.";
        printEvenLengthWords(sentence);
        

    }
}