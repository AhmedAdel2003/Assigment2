import java.util.concurrent.atomic.AtomicInteger;

public class BudgetReport implements Report{
    private User user;
    public BudgetReport(User user){
        this.user=user;

    }

    @Override
    public void generateReport() {
        AtomicInteger budget= new AtomicInteger(user.calculateSalary());
        FactoryStaff.getStaffList(user).stream().forEach(b->{
            budget.addAndGet(b.calculateSalary());});
        System.out.println(budget.get());
    }
}
