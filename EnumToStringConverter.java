public class EnumToStringConverter {

    enum Day {
        SUNDAY, 
        MONDAY, 
        TUESDAY, 
        WEDNESDAY, 
        THURSDAY, 
        FRIDAY, 
        SATURDAY
    }

    public static void main(String[] args) {
        
        Day today = Day.WEDNESDAY;
      
        String nameString = today.name();

        System.out.println("Enum Constant: " + today);
        System.out.println("Converted String: " + nameString); 
        System.out.println("Data Type: " + nameString.getClass().getName());
    }
       
}