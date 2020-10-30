package lab4;
import java.io.*;
import lab4.InputException;
public class Q7Tester {
	public static void main(String[] args) {
		ExceptionEx excExm = new ExceptionEx();
		try {
			excExm.throwException();
		} 
		catch (InputException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
