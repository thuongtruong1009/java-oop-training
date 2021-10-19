package thuongtruong1009;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee("ITITIU19228", "Truong", 23000, 10, 9);
        Employee e2 = new Employee("ITITIU19181", "Phong", 18000, 6, 9);
        Employee e3 = new Employee("ITITIU19236", "Tung", 25000, 31, 7);
        Employee e4 = new Employee("ITITIU19210", "Son", 21000, 12, 7);

        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);

        try {
            Date x = (new SimpleDateFormat("dd/MM/yyy")).parse("05/10/2020");
            Date y = (new SimpleDateFormat("dd/MM/yyy")).parse("20/11/2020");
            int id;
            Random generator = new Random();                           //tao number ngau nhien tu 1-4
            Project p = new Project(Integer.toString(id = generator.nextInt(4) + 1), x, y, list);
            //Project p = new Project(Project.getProjectId(), x, y, list);
            ProjectPrinter pp = new ProjectPrinter(p);

            System.out.println("Budget: " + p.estimateBudget());
            System.out.println("------------------------------");
            System.out.println("Rank:\n" + p.toString());
            System.out.println("------------------------------");
            System.out.println("Printing...\n");
            pp.run();
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
    }    
}
