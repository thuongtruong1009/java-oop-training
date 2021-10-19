package thuongtruong1009;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class ProjectPrinter implements Runnable
{
    private Project project;

    public Project getProject() {
        return this.project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
    
    public ProjectPrinter(Project project)
    {
        this.project = project;
    }

    @Override
    public void run(){
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        project.getEmployees().forEach(employee -> {
            System.out.println(
                "[Project ID:"
                .concat(project.getProjectId())
                .concat(" - Project Duration::")
                .concat(dateFormat.format(project.getStartDate()))
                .concat(" to ")
                .concat(dateFormat.format(project.getEndDate()))
                .concat("] [Name:")
                .concat(employee.getEmployeeName())
                .concat(" - Salary Per Hour:")
                .concat(String.valueOf(employee.getSalaryPerHour()))
                .concat("]")
            );
            try {
                Thread.sleep(1000);
            }
            catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
        });
    }
}
