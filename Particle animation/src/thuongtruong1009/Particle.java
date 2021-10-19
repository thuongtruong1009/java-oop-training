package thuongtruong1009;
/*
 * @author https://github.com/thuongtruong1009
 */

/*List of direction
	 North 			code: 1
	 North East 	code: 2
	 East 			code: 3
	 South East		code: 4
	 South 			code: 5
	 South West 	code: 6
	 West 			code: 7
	 North West		code: 8
*/
public class Particle {	
	//Declare x and y
	protected int x;
	protected int y;
	protected int direction=1;
	
	public Particle(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//Getter, Setter
	public void setCoord(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setDirection(int value) {
		this.direction= value;
	}
	
	//Function to move
	public void move() {
		switch (this.direction) {
			case 1:
				this.y = this.y-1;
			case 2:{
				this.x = this.x+1;
				this.y = this.y-1;
			}
			case 3:{
				this.x = this.x+1;
				this.y = this.y+0;
			}
			case 4:{
				this.x = this.x+1;
				this.y = this.y+1;
			}
			case 5:
			{
				this.x = this.x+0;
				this.y = this.y+1;
			}
			case 6:{
				this.x = this.x-1;
				this.y = this.y+1;
			}
			case 7:{
				this.x = this.x-1;
				this.y = this.y+0;
			}
			case 8:{
				this.x = this.x-1;
				this.y = this.y-1;
			}
		}	
	}
	
	//Condition check
	public boolean check(int width, int height) {
		if (this.x<0 || this.x>width || this.y<0 || this.y>height)
			return(false);
		return(true);
	}
	
	//Debug
	public void debug() {
		System.out.println("Particle is:" + this.x + " " + this.y);
	}
}
