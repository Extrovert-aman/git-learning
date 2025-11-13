public class StringComparison {

    public static void main(String[] args) {
        String strA = "Java";
        String strB = "java";

        boolean areEqual = strA.equalsIgnoreCase(strB);

        System.out.println("Are the strings equal (ignoring case)? " + areEqual);
    }
}