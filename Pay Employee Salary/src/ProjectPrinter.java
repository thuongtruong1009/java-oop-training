package interfaces;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class ProjectPrinter implements Runnable{
	private Project project;
	public ProjectPrinter(Project project) {
		super();
		this.project = project;
	}
	
	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@Override
	public void run() {
		DateFormat df= new SimpleDateFormat("dd/MM/yy");
		for(Employee employee: project.getListOfEmployee()) {
			System.out.println("[ProjectID: " + project
					+ "Project Duration: " + df.format(project.getStartDate())
					+ "to" + df.format(project.getEndDate())+ "] ["
					+ "Name: " + employee.getEmployeeName() 
					+ " - Salary Per Hour: " + employee.getSalaryPerHour());
		}
		try {
			Thread.sleep(1000);
		}
		catch(IllegalArgumentException e) {
				e.printStackTrace();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
