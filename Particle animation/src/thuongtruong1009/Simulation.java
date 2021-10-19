package thuongtruong1009;

import java.util.ArrayList;
/*
 * @author https://github.com/thuongtruong1009
 */
public class Simulation {
	public static void main(String[] args) {
		
		//Initialize ArrayList of particles
		ArrayList<Particle> particleList = new ArrayList<Particle>();
		Box box= Box.getInstance(); 					// Create a box
	
		particleList.add(new Particle(7,5));
		particleList.add(new Particle(15,17));
		particleList.add(new Particle(4,28));
		
		//Check if the particle is inside the box or not
		Boolean test=particleList.get(0).check(box.width, box.height);
		System.out.println("Test is: " + test);
		
		particleList.get(0).debug();
		visualise(box, particleList);	
	}
	
	static void visualise(Box box, ArrayList<Particle> particleList) {
		while (true){
		//Move the particles
		particleList.get(0).move();
		particleList.get(0).setDirection(4);
		boolean test=particleList.get(0).check(box.width, box.height);
		if (test == false){
			particleList.get(0).setCoord(box.width/2, box.height/2);
		}
		
		//Print the box
		for (int i=1; i<=box.height; i++){
			for (int j=1; j<=box.width; j++){
				boolean isPrinted = false;
				//Print the particle
				if (i==particleList.get(0).y && j==particleList.get(0).x){
					System.out.print("*");
					isPrinted = true;
				}
				
				//Print the space
				if (isPrinted == false)
					if (i==1 || i==box.height)
						System.out.print("-");
					else if (j==1 || j==box.width)
						System.out.print("|");
					else System.out.print(" ");
			}
			System.out.println();
		}
		
		//Repeat
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}		
	}
}
