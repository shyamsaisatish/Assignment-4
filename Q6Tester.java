package lab4;
import java.util.*;
public class Q6Tester {
	public static void main(String[] args) {
		try {
			Scanner s=new Scanner(System.in);
			System.out.println("Please enter a number");
			int num = s.nextInt();
			try {
				if(num>100) {
					throw new InputException("Number can't be greater than 100");
				}
			}
			catch (InputException e) {
				System.out.println(e.getMessage());
			}
	}
		catch(Exception e)
		{
			System.out.println("Exception occured");
		}
}
}