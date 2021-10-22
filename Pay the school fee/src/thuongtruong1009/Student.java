package thuongtruong1009;
import java.util.Scanner;
public class Student extends Person {
	private String program;
	private int year;
	private double fee;
	public Student(String name, String address, String program, int year, double fee) {
		super(name, address);
		this.program= program;
		this.year= year;
		this.fee= fee;
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program= program;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year= year;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee= fee;
	}
	public void display() {
		super.display();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Input program: ");
			this.program= sc.nextLine();
			System.out.println("Input year: ");
			this.year= sc.nextInt();
			System.out.println("Input fee: ");
			this.fee= sc.nextDouble();
		}
	}
	public String toString() {
		return super.toString() + "Program: "+ this.program + "Year: "+ this.year + "Fee: "+ this.fee;
	}
}