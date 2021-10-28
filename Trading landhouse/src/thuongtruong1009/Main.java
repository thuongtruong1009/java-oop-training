package thuongtruong1009;
import java.util.ArrayList;
import java.util.Scanner;
/*
 * Code by https://github.com/thuongtruong1009/java-oop-training
 */
public class Main {
	public static void main(String[] args) {
		ArrayList<Land> arrLand= new ArrayList<>();
		ArrayList<House> arrHouse= new ArrayList<>();
		int caseLand=0;
		int caseHouse= 0;
		double sumMoneyLand= 0;
		double averMoney= 0;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Input case of Land: ");
		caseLand= sc.nextInt();
		System.out.println("Input case of House: ");
		caseHouse= sc.nextInt();
		
		for(int i= 0; i<caseLand; i++) {
			System.out.println("Input information of tranding Land times  " + (i+1) + ": ");
			Land land= new Land();
			land.display();
			arrLand.add(land);
		}
		for(int i= 0; i<caseHouse; i++) {
			System.out.println("Input information of tranding House times  " + (i+1) + ": ");
			House house= new House();
			house.display();
			arrHouse.add(house);
		}
		System.out.println("---Informative of tranding house---");
        for (int i = 0; i < arrHouse.size(); i++) {
            System.out.println(arrHouse.get(i).toString());
        }
         
        for (int i = 0; i < arrLand.size(); i++) {
            if (arrLand.get(i).getKindLand().equalsIgnoreCase("A")) {
                sumMoneyLand += arrLand.get(i).getArea() * arrLand.get(i).getPrice() * 1.5;
            } else if (arrLand.get(i).getKindLand().equalsIgnoreCase("B") ||  arrLand.get(i).getKindLand().equalsIgnoreCase("C")) {
                sumMoneyLand += arrLand.get(i).getArea() * arrLand.get(i).getPrice();
            }
        }
        averMoney = sumMoneyLand / (arrLand.size());
        System.out.println("Trung bÃ¬nh thÃ nh tiá»�n cá»§a giao dá»‹ch Ä‘áº¥t = " + averMoney);
         
//        // Output tranding in September, 2013.
//        System.out.println("CÃ¡c giao dá»‹ch Ä‘áº¥t cá»§a thÃ¡ng 9 nÄƒm 2013: ");
//        for (int i = 0; i < arrLand.size(); i++) {
//            String[] dateLand = arrLand.get(i).getTime().split("/");
//            if (dateLand[1].equals("9") && dateLand[2].equals("2013")) {
//                System.out.println(arrLand.get(i).toString());
//            }
//        }
//         
//        System.out.println("CÃ¡c giao dá»‹ch nhÃ  cá»§a thÃ¡ng 9 nÄƒm 2013: ");
//        for (int i = 0; i < arrHouse.size(); i++) {
//            String[] dateHouse = arrHouse.get(i).getTime().split("/");
//            if (dateHouse[1].equals("9") && dateHouse[2].equals("2013")) {
//                System.out.println(arrHouse.get(i).toString());
//            }
//        }
    }
}
