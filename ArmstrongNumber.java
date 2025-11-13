public class ArmstrongNumber{
    
    public static boolean isArmstrong(int number) {
        if (number < 0) {
            return false;
        }
        int originalNumber = number;
        int sum = 0;
        int temp = number;

        String numberAsString = String.valueOf(number);
        int n = numberAsString.length();

        while (temp > 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, n); 
            temp /= 10;
        }
        return originalNumber == sum;
    }

    public static void main(String[] args) {
        int num1 = 153; 
        int num2 = 121; 

        System.out.println(num1 + " is an Armstrong number: " + isArmstrong(num1));
        System.out.println(num2 + " is an Armstrong number: " + isArmstrong(num2));
       
    }
}