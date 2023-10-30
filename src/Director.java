import java.util.ArrayList;
import java.util.List;
public class Director extends User{
    private List<Manager>managerlist;
    private List<Staff>staff;
    Director(int age, String ID, String name, int hourRated, int hourInMonth) {
        super(age, ID, name, hourRated, hourInMonth);
        managerlist=new ArrayList<>();
        staff=new ArrayList<>();
    }

    public void setManagerlist(List<Manager> managerlist) {
        this.managerlist = managerlist;
    }

    public void setStaff(List<Staff> staff) {
        this.staff = staff;
    }

    public List<Manager> getManagerlist() {
        return managerlist;
    }

    public List<Staff> getStaff() {
        return staff;
    }


}
