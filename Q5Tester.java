package lab4;
import java.io.*;
import java.util.*;
public class Q5Tester {
	public static void main(String[] args) {
			try {
				Scanner s=new Scanner(System.in);
				System.out.println("Please enter a number");
				int num = s.nextInt();
				try {
					if(num > 100) {
						throw new Exception();
					}
				}
				catch (Exception e) {
					System.out.println("Number can't be greater than 100");
				}
				}
			catch(Exception e)
			{
				System.out.println("Exception found");
			}
}
}
