public class Staff extends User{
    Staff(int age, String ID, String name, int hourRated, int hourInMonth) {
        super(age, ID, name, hourRated, hourInMonth);
    }

    @Override
    public String toString() {
        return "Staff : "+super.getName() +"\t"+super.getID();
    }
}
