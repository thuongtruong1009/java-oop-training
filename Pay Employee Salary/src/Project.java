package interfaces;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public class Project {
	private String projectId;
	private Date startDate;
	private Date endDate;
	private ArrayList<Employee> listOfEmployee;
	public Project(String projectId, String startDate, String endDate, ArrayList<Employee> listOfEmployee) {
		super();
		this.projectId = projectId;
		try{
			SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yy");
			this.startDate = sdf.parse(startDate);
			this.endDate = sdf.parse( endDate);
		}catch(ParseException e) {
			e.printStackTrace();
		}
		this.listOfEmployee = listOfEmployee;
	}
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
	public ArrayList<Employee> getListOfEmployee() {
		return listOfEmployee;
	}
	public void setListOfEmployee(ArrayList<Employee> listOfEmployee) {
		this.listOfEmployee = listOfEmployee;
	}
	
	public int estimateBudget() {
		int different = 0;
		for(Employee e: listOfEmployee) {
			different+= e.getSalaryPerHour();
		}
		return (int) ((endDate.getTime() - startDate.getTime()) / (1000*3600*24*listOfEmployee.size())) * different;
		
	}
	public String toString() {
		String s= "";
		for(int i= 0 ; i<listOfEmployee.size(); i++) {
			s+= listOfEmployee.get(i).toString() + "\n";
		}
		return s;
	}
	public void addEmployee(Employee e) {
		listOfEmployee.add(e);
	}
}
