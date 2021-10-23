package thuongtruong1009;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.print("Input the number of Triangle: ");
		try (Scanner sc = new Scanner(System.in)) {
			int n= sc.nextInt();
			for(int i=0; i<n; i++) {
				System.out.println("Enter the value for the "+ (i+1) +" triangle: ");
				System.out.println("Enter value of point A(xA, yA): ");
				int x1= sc.nextInt();
				int y1= sc.nextInt();
				MyPoint v1= new MyPoint(x1, y1);
				
				System.out.println("Enter value of point B(xB, yB): ");
				int x2= sc.nextInt();
				int y2= sc.nextInt();
				MyPoint v2= new MyPoint(x2, y2);
						
				System.out.println("Enter value of point C(xC, yC): ");
				int x3= sc.nextInt();
				int y3= sc.nextInt();
				MyPoint v3= new MyPoint(x3, y3);
				
				MyTriangle triangle= new MyTriangle(v1, v2, v3);
				System.out.println("-->Perimeter of triangle ABC= "+ triangle.getPerimeter());
				//System.out.println("-->Type of triangle ABC= "+ triangle.get(toString();
			}
		}
	}
}
