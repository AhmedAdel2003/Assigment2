import java.util.ArrayList;
import java.util.List;

public class Manager extends User{
    private List<Staff> staffList;
   public Manager(int age, String ID, String name, int hourRated, int hourInMonth) {
        super(age, ID, name, hourRated, hourInMonth);
        staffList=new ArrayList<>();
    }

    public List<Staff> getStaffList() {
        return staffList;
    }

    @Override
    public String toString() {
        return "Manger :"+super.getName()+"\t"+super.getID();
    }
}
