package interfaces;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Employee> list= new ArrayList<Employee>();
		list.add(new Employee("ITITIU19181", "Phong", 18000, 6, 9));
        list.add(new Employee("ITITIU19236", "Tung", 25000, 31, 7));
        list.add(new Employee("ITITIU19210", "Son", 21000, 12, 7));    
        
    	Project p1= new Project("ITITIU19228", "10/11/2001","10/09/2020", list);
        Project p2= new Project("ITITIU19228", "06/09/2001","06/09/2020", list);
        Project p3= new Project("ITITIU19228", "31/07/2001","31/07/2020", list);
        Project p4= new Project("ITITIU19228", "12/07/2001","12/07/2020", list);
        p1.addEmployee(list.get(0));
        p2.addEmployee(list.get(1));
        p3.addEmployee(list.get(2));
        p4.addEmployee(list.get(3));
        
        ProjectPrinter pp1= new ProjectPrinter(p1);
        ProjectPrinter pp2= new ProjectPrinter(p2);
        ProjectPrinter pp3= new ProjectPrinter(p3);
        ProjectPrinter pp4= new ProjectPrinter(p4);
	
        	System.out.println("Budget:---------------\n");
        	p1.estimateBudget();
        	p2.estimateBudget();
        	p3.estimateBudget();
        	p4.estimateBudget();
        	System.out.println("Rank:-----------------\n");
        	p1.toString();
        	p2.toString();
        	p3.toString();
        	p4.toString();
        	System.out.println("Project:--------------\n");
        	pp1.run();
        	pp2.run();
        	pp3.run();
        	pp3.run();
        	System.out.println("Weekly Salary:--------\n");
        	list.get(0).calculateWeeklySalary();
        	list.get(1).calculateWeeklySalary();
        	list.get(2).calculateWeeklySalary();
        	list.get(3).calculateWeeklySalary();
	}
}
