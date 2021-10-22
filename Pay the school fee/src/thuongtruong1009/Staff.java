package thuongtruong1009;
import java.util.Scanner;
public class Staff extends Person{
	private String school;
	private double pay;
	public Staff(String name, String address, String school, double pay) {
		super(name, address);
		this.school= school;
		this.pay= pay;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school= school;
	}
	public double getPay() {
		return pay;
	}
	public void setPay(double pay) {
		this.pay= pay;
	}
	public void display() {
		try (Scanner sc = new Scanner(System.in)) {
			super.display();
			System.out.println("Input school: ");
			school= sc.nextLine();
			System.out.println("Input pay: ");
			pay= sc.nextDouble();
		}
	}
	public String toString() {
		return super.toString() + "School: "+ this.school + "Pay: "+ this.pay;
	}
}