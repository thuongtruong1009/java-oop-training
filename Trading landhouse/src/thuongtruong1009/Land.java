package thuongtruong1009;
/*
 * Code by https://github.com/thuongtruong1009/java-oop-training
 */
public class Land extends Trande{
	private String kindLand;
	public Land() {
		super();
	}
	public Land(String kindLand) {
		super();
		this.kindLand= kindLand;
	}
	public String getKindLand() {
		return kindLand;
	}
	public void setKindLand(String kindLand) {
		this.kindLand= kindLand;
	}
	public void display() {
		super.display();
		System.out.println("Input kind of land(A/B/C): ");
		kindLand= sc.nextLine();
	}
	public String toString() {
		return super.toString() + ", Kind of land: " + this.kindLand;
	}
}
