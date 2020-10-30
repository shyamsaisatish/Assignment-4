package lab4;
import java.io.*;
public class Q3SerAndDeser {
	public static void main(String[] args) {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("emp.ser"));
			Employee emp=new Employee("shyam",1234,"vizag",25000);
			emp.display();
			oos.writeObject(emp);
			System.out.println("Data Serialized");
			} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
			} 
		catch (IOException e) {
			e.printStackTrace();
			}
		ObjectInputStream ois;
		try {
			ois = new ObjectInputStream(new FileInputStream("emp.ser"));
			Employee emp2 = (Employee) ois.readObject();
			emp2.display();
			System.out.println("Data Deserialized");
			}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			}
		catch (IOException e) {
			e.printStackTrace();
			} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
