package thuongtruong1009;

public class Main {

	public static void main(String[] args) {
		Student student= new Student("Son", "Long An", "Domestic", 2020, 45000000);
		Staff staff= new Staff("Phong", "Phu Nhuan", "IU", 10000000);
		
		student.setName("Phong");
		staff.setPay(100000);
		
		student.display();
		student.toString();
		
		staff.display();
		staff.toString();
	}
}
