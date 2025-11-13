 
class MyException extends Exception{
	
  public MyException(String msg) {
     super(msg);
}
}
public class TestCustomException {
	public static void validate(int age) throws MyException
	{
		if(age<18)
		{
			throw new MyException("Age is not valid for Vote Bro");
		}
		else
		{
			System.out.println("Everything is Fine Bro!");
		}
	}
	public static void main(String[] args) throws MyException {
		validate(12);
		
	}
}