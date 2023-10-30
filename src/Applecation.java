import java.awt.*;

public class Applecation {
    public static void main(String[] args) {
Manager m1=new Manager(20,"1","Ahmed",50,6);
Manager m2=new Manager(22,"2","Ali",50,6);
Director d1=new Director(30,"3","Liam",100,6);
Staff s1=new Staff(19,"4","Jon",50,6);
Database database=new Database();
        database.addDirector(d1);
        database.addManager(m1);
        database.addManager(m2);
        database.addStaff(s1);
        System.out.println(database.getDirector("3").getName());
        System.out.println(database.getStaff("4").getName());
        System.out.println(database.getManager("1").getName());
        System.out.println(database.getManager("2").getName());
       d1.getStaff().add(s1);
        StaffReport staff1=new StaffReport(d1);
        staff1.generateReport();
        //////////////
        BudgetReport budgetReport= new BudgetReport(d1);
        budgetReport.generateReport();
        ////////////
        System.out.println(s1.calculateSalary());
    }
}