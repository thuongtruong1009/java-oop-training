package thuongtruong1009;

public class Employee implements Comparable<Employee>
{
    private String employeeId;

    private String employeeName;

    private int salaryPerHour;

    private int noOfLeavingDay;

    private int noOfTravelDay;

    public String getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getSalaryPerHour() {
        return this.salaryPerHour;
    }

    public void setSalaryPerHour(int salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public int getNoOfLeavingDay() {
        return this.noOfLeavingDay;
    }

    public void setNoOfLeavingDay(int noOfLeavingDay) {
        this.noOfLeavingDay = noOfLeavingDay;
    }

    public int getNoOfTravelDay() {
        return this.noOfTravelDay;
    }

    public void setNoOfTravelDay(int noOfTravelDay) {
        this.noOfTravelDay = noOfTravelDay;
    }

    public Employee(String id, String name, int salaryPerHour, int noOfLeavingDay, int noOfTravelDay)
    {
        this.employeeId = id;
        this.employeeName = name;
        this.salaryPerHour = salaryPerHour;
        this.noOfLeavingDay = noOfLeavingDay;
        this.noOfTravelDay = noOfTravelDay;
    }

    @Override
    public int compareTo(Employee obj) {
        if (noOfTravelDay > obj.noOfTravelDay) {
            return 1;
        }
        else if (noOfTravelDay < obj.noOfTravelDay) {
            return -1;
        }
        else {
            if (noOfLeavingDay > obj.noOfLeavingDay) {
                return -1;
            }
            else if (noOfLeavingDay < obj.noOfLeavingDay) {
                return 1;
            }
            else {
                return 0;
            }
        }
    }
    public int calculateWeeklySalary(){
        return salaryPerHour*8*(5 - noOfLeavingDay + noOfTravelDay/2);
    }

    public String toString(){
        return "Name: "+ employeeName + " - Salary Per Hour: "+ salaryPerHour+" - Weekly Salary: "+ calculateWeeklySalary();
    }
}
