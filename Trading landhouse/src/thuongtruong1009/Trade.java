package thuongtruong1009;
import java.util.Scanner;
/*
 * Code by https://github.com/thuongtruong1009/java-oop-training
 */
public class Trade {
	private String code, time;
	private double price;
	private double area;
	Scanner sc= new Scanner(System.in);
	public Trande() {
		super();
	}
	public Trande(String code, String time, double price, double area) {
		super();
		this.code= code;
		this.time= time;
		this.price= price;
		this.area= area;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code= code;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time= time;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price= price;
	}
	public double getArea() {
		return area= area;
	}
	public void setArea(double area) {
		this.area= area;
	}
	public void display() {
		System.out.println("Input tranding code: ");
		code= sc.nextLine();
		System.out.println("Input tranding time: ");
		time= sc.nextLine();
		System.out.println("Input tranding price: ");
		price= Double.parseDouble(sc.nextLine());
		System.out.println("Input area: ");
		area= Double.parseDouble(sc.nextLine());
	}
	public String toString() {
		return "Tranding code: " + this.code + "Tranding time: " + this.time + "Tranding price: " + this.price + "Area: " + this.area;
	}
}
