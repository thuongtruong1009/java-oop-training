package thuongtruong1009;

public class MyTriangle {
	private MyPoint v1;
	private MyPoint v2;
	private MyPoint v3;
	public MyTriangle(int x1,int y1, int x2,int y2, int x3, int y3) {
		this.v1= new MyPoint(x1, y1);
		this.v2= new MyPoint(x2, y2);
		this.v3= new MyPoint(x3, y3);
	}
	public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
		this.v1= v1;
		this.v2= v2;
		this.v3= v3;
	}
	public String toString() {
		return "V1(" + this.v1 + ") "+ "V2(" + this.v2 + ") "+ "V3(" + this.v3 + ")";
	}
	public double getPerimeter() {
		double perimeter= Math.sqrt(Math.pow(v2.getX()-v1.getX(),2) + Math.pow(v2.getY()-v1.getY(),2)) 
				+ Math.sqrt(Math.pow(v3.getX()-v1.getX(),2) + Math.pow(v3.getY()-v1.getY(),2)) 
				+ Math.sqrt(Math.pow(v3.getX()-v2.getX(),2) + Math.pow(v3.getY()-v2.getY(),2));		
		return perimeter;
	}
	public String getType(String type) {
		double d1= Math.sqrt(Math.pow(v2.getX()-v1.getX(),2) + Math.pow(v2.getY()-v1.getY(),2)); 
		double d2= Math.sqrt(Math.pow(v3.getX()-v1.getX(),2) + Math.pow(v3.getY()-v1.getY(),2));
		double d3= Math.sqrt(Math.pow(v3.getX()-v2.getX(),2) + Math.pow(v3.getY()-v2.getY(),2));		
		if (d1 == d2 && d2 == d3) {
			type= "equilateral";
			return type;
		}
		else if (d1 == d2 && d1 != d3 && d2 != d3) {
			type= "isosceles";
			return type;
		}
		else if (d1 == d3 && d2 != d3 && d2 != d1) {
			type= "isosceles";
			return type;
		}
		else if (d2 == d3 && d3 != d2 && d3 != d1) {
			type= "isosceles";
			return type;
		}
		else {
			type= "scalene";
			return type;
		}
	}
}
