package lab4;

import java.io.Serializable;

class Employee implements Serializable
{
	private String name;
	private int id;
	private String address;
	private transient double salary;
	public Employee(String name, int id, String address, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
		this.salary = salary;
	}
	public void display() {
		System.out.println("Name: "+this.name+" Id: "+this.id+" Address: "+this.address+" Salary:"+this.salary);
	}
}