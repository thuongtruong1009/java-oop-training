package thuongtruong1009;
/*
 * Code by https://github.com/thuongtruong1009/java-oop-training
 */
public class House extends Trande{
	private String kindHouse;
	private String address;
	private int choose;
	public House() {
		super();
	}
	public House(String kindHouse) {
		super();
		this.kindHouse= kindHouse;
	}
	public String getKindHouse(){
		return kindHouse;
	}
	public void setKindHouse(String kindHouse) {
		this.kindHouse= kindHouse;
	}
	public String getAddres() {
		return address;
	}
	public void setAddress(String address) {
		this.address= address;
	}
	public void display() {
		super.display();
		System.out.println("Input address: ");
		address= sc.nextLine();
		System.out.println("Input kind of : ");
		choose= sc.nextInt();
		switch (choose) {
		case 1:
			kindHouse= "Expensive";
			break;
		case 2:
			kindHouse= "Premium";
			break;
		default:
			System.out.println("Kind of house not valid.");
			break;
		}
	}
	public String toString() {
		return super.toString() + "Kind of house: " + this.kindHouse;
	}
	
}
