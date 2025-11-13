public class StringAdd {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        
        char charAdd = ' ';
        String strAdd = "Code";
        sb.append(charAdd); 

        sb.append(strAdd);
        sb.append('!');
        sb.insert(4, '.');
        
       
        String finalString = sb.toString(); 

        System.out.println("Final String: " + finalString); 
    }
}