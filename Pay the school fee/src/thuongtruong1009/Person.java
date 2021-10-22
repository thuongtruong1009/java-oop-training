package thuongtruong1009;
import java.util.Scanner;
public abstract class Person {
	private String name;
	private String address;
	public Person(String name, String address) {
		this.name= name;
		this.address= address;
	}
	public void setName(String name) {
		this.name= name;
	}
	public String getName() {
		return name;
	}
	public void setAddress(String address) {
		this.address= address;
	}
	public String getAddress() {
		return address;
	}
	public void display() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Name: ");
			name= sc.nextLine();
			System.out.print("Address: ");
			address= sc.nextLine();
		}
	}
	public String toString() {
		return "Name: " + this.name + "Address: " + this.address;
	}
}