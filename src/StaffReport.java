public class StaffReport implements Report{


    @Override
    public void generateReport() {

        System.out.println(FactoryStaff.getStaffList(user));

    }
    private User user;
public StaffReport(User user){
    this.user=user;
}

}
