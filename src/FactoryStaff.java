import java.util.List;
import java.util.Objects;

public class FactoryStaff {
    private Manager manager=null;
    private Director director=null;
    private FactoryStaff(User user){
        if(user instanceof Manager){
            this.manager=(Manager) user;
        }
        else if(user instanceof Director){
            this.director=(Director) user;
        }
    }
    public static List<Staff> getStaffList(User user){
      FactoryStaff factoryStaff=new FactoryStaff(user);
      if(Objects.nonNull(factoryStaff.director)){
          return factoryStaff.director.getStaff();
      } else if (Objects.nonNull(factoryStaff.manager)) {
          return factoryStaff.manager.getStaffList();

      }
        return null;
    }

}
