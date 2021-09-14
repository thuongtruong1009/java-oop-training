package thuongtruong1009;

import java.util.ArrayList;
import java.util.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class Project
{
    private String projectId;
    private Date startDate;
    private Date endDate;
    private ArrayList<Employee> employees;
    
	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}

	public Project(String projectId, Date startDate, Date endDate, ArrayList<Employee> IEmployees)
    {
        this.projectId = projectId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.employees = IEmployees;
    }

    public int estimateBudget()
    {
        LocalDate startDate = this.startDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate endDate = this.endDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int difference = (int) (ChronoUnit.DAYS.between(startDate, endDate));
        int budget = 0;

        for (int i = 0; i < employees.size(); i++) {
            employees.get(i).setNoOfLeavingDay(0);
            employees.get(i).setNoOfTravelDay(0);

            budget += (employees.get(i).calculateWeeklySalary())*(difference/7);
        }
        return budget;
    }    

    public String toString()
    {
        String x = "";
        for (int i = 0; i < employees.size(); i++) {
            x += employees.get(i).toString();
            x += "\n";
        }
        return x;
    }
}
