package lab4;
import java.io.*;
public class Q1Tester {
	public static void main(String[] args) {
		FileInputStream fileInpStream = null;
		int line=0;
		try {
			fileInpStream = new FileInputStream("demo.txt");
			while((line = fileInpStream.read()) != -1) {
				System.out.print((char)line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
		try {
			fileInpStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	}
