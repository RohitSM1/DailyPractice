package exercise;
import java.util.Scanner;

class UnderAgeException extends Exception
{
	UnderAgeException()
	{
		System.out.println("You can't Drive ");
	}
}
public class Drive {

	public static void main(String[] args) throws UnderAgeException {
		System.out.println(" Please Enter your Age");
		Scanner sc = new Scanner (System.in);
		int age= sc.nextInt();
		
		try {
			if(age<18)
			{
				throw new UnderAgeException();
				}
			else {
				System.out.println(" You can drive");
			}
		}
		catch(Exception e) {
			
			throw e;
			}
		
		}
}
