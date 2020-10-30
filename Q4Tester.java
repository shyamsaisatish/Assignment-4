package lab4;
import java.util.*;
public class Q4Tester {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int number = 0;
		try {
			do {
				System.out.println("Please enter a number or enter -1 to quit");
				number = s.nextInt();
				evenOrOdd(number);
			} 
			while (number != -1);
		} 
		catch (InputMismatchException e) {
			System.out.println("you must enter an integer");
		}
	}
	private static void evenOrOdd(int number) {
		if (number%2==0) {
			System.out.println("Even");
		} 
		else if(number%2!=0&&number!=-1){
			System.out.println("Odd");
		} 
		else{
			System.exit(0);
		}
	}
}
