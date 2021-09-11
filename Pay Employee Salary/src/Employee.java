package interfaces;

public class Employee {
	private String employeeId;
	private String employeeName;
	private int salaryPerHour;
	private int noOfLeavingDay;
	private int noOfTravelDay;
	public Employee(String employeeId, String employeeName, int salaryPerHour, int noOfLeavingDay, int noOfTravelDay) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salaryPerHour = salaryPerHour;
		this.noOfLeavingDay = noOfLeavingDay;
		this.noOfTravelDay = noOfTravelDay;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getSalaryPerHour() {
		return salaryPerHour;
	}
	public void setSalaryPerHour(int salaryPerHour) {
		this.salaryPerHour = salaryPerHour;
	}
	public int getNoOfLeavingDay() {
		return noOfLeavingDay;
	}
	public void setNoOfLeavingDay(int noOfLeavingDay) {
		this.noOfLeavingDay = noOfLeavingDay;
	}
	public int getNoOfTravelDay() {
		return noOfTravelDay;
	}
	public void setNoOfTravelDay(int noOfTravelDay) {
		this.noOfTravelDay = noOfTravelDay;
	}
	
	public int calculateWeeklySalary() {
		return salaryPerHour * 8 * (5-noOfLeavingDay + noOfTravelDay/2);
	}
	public int compareTo(Employee obj) {
		if(obj instanceof Employee) {
			if(this.getNoOfTravelDay() > obj.getNoOfTravelDay()) {
				return 1;
			}
			else if(this.getNoOfTravelDay() == obj.getNoOfTravelDay()) {
				if(this.getNoOfLeavingDay() < obj.getNoOfLeavingDay()) {
					return 1;
				}			
			}
			else {
				return 0;
			}
		}
		return -1;
	}
	public String toString() {
		return "Name: " + employeeName + " - Salary Per Hour: " + salaryPerHour + " - Weekly Salary: " + calculateWeeklySalary(); 
	}
}
