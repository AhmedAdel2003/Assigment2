import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Database {
    private static Map<String,Director>directorMap=new HashMap<>();
    private static Map<String,Staff>staffMap=new HashMap<>();
    private static Map<String,Manager>managerMap=new HashMap<>();
    public Director getDirector(String directorID){
return directorMap.get(directorID);
    }
    public Manager getManager(String managerID){
        return managerMap.get(managerID);
    } public Staff getStaff(String staffID){
        return staffMap.get(staffID);
    }
    public void addManager(Manager manager){
managerMap.put(manager.getID(),manager);
    }
    public void addStaff(Staff staff){
        staffMap.put(staff.getID(),staff);
    }
    public void addDirector(Director director){
       directorMap.put(director.getID(),director);
    }
}
