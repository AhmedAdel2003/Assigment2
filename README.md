# Assigment2
![alt text](https://github.com/AhmedAdel2003/Assigment2/blob/main/src/UML.png)
# User class :
In our application, we need the User class, which is basic because every person in this program is a user, such as the staff, manager, director, that is, it is a super class. Each of the classes mentioned inherits the basic characteristics from it.
### Attributes
* `Name: `The users name.
* `ID:` Identification of the user.
* `Age:` Age of the user.
* `HourRated:` Hourly rate at which the user is paid.
* `HourInMonth:` Total hours worked by the user in a month.


## Methods :
#### constructor
* `User():` Constructor to initialize the user object with provided details.
#### getter
* `getID():` Get the users ID.
* `getAge():` Get the users age.
* `getHourInMonth():` Get the total hours worked in a month.
* `getName():` Get the users name.
* `getHourRated():` Get the user's hourly rate.
#### function
*`calculateSalary():` Calculate the users salary based on hourly rate and hours worked in a month.


# Staff Class :
`Staff` is a subclass of the `user class` that takes the main characteristics of the user, such as age, name, etc,Inherits from the User class.

```java
public class Staff extends User {
    Staff(int age, String ID, String name, int hourRated, int hourInMonth) {
        super(age, ID, name, hourRated, hourInMonth);
    }
        @Override
        public String toString () {
            return "Staff : " + super.getName() + "\t" + super.getID();
        }
    }

```
## Constructors
Staff(): Inherits the constructor from the User class.
## Override:
`toString(): `Overrides the toString() method that displays the `Staff` Name and ID.


# Manager Class :
`Manager`Manager is a subclass of the User class that inherits the main properties of the user, such as age, name, etc.
#### Attributes
`staffList:` A list that holds instances of the Staff class. It represents the staff members managed by the manager.
#### Constructors
`Manager():` Inherits the constructor from the `User class` and initializes the staff list.
### Methods
`getStaffList():` Get the list of staff members.
`toString():` Overrides the toString() to displays the `managers` Name and ID.
# Director Class:
`Director` is a subclass of the User class that inherits the main properties of the user, such as age, name, etc.
#### Constructor
`Director():` Inherits the constructor from the User class and initializes the lists of managers and staff.
#### Setter & Getter

* `setManagerlist():` Set the list of managers in the director's supervision.
* `setStaff():` Set the list of staff in the director's supervision.
* `getManagerlist():` Get the list of managers.
* `getStaff(): `Get the list of staff Staffs.
# Report Interface
This `report` prepares the staff for me, and this is solved using the `Open Close Principle` method. In the manager or director's office, I make a report about the staff, giving me their name, ID, and so on.
#### Method
`generatorReport():` This method is used to generate a report in class implements.
# Factory Staff
I made a factory to reach List of Staff and so as not to destroy the Solid Principle.
```java
public class FactoryStaff {
  private FactoryStaff(User user){
        if(user instanceof Manager){
            this.manager=(Manager) user;
        }
        else if(user instanceof Director){
            this.director=(Director) user;
        } 
  }
}
```

##### FactoryStaff(User user): A private constructor used to initialize the FactoryStaff object based on the provided User.
```java
public class FactoryStaff {
    public static List<Staff> getStaffList(User user) ;}
```
`getStaffList(User user):` A static method that returns the staff list associated with the provided user, either a Manager or a Director.

`getStaffList(User user):` Determines the user's role and retrieves the appropriate staff list based on whether the user is a manager or a director.

# Budget Report
It calculates the budget by summing the user's salary and the combined salaries of the employees managed by that user,Implements the Report interface.

#### Constructor
`BudgetReport(User user):` Initializes the BudgetReport object with a specific User.

* `generateReport():` Implements the method required by the Report interface. It calculates and prints the total budget based on the user's salary and the combined salaries of the staff they manage.
# DATABASE Class
It is actually a fake database in that the user creates an object for the database only once, storing all types of users in it.
#### Attributes
`directorMap:` Store instances of Director.

`managerMap:` Store instances of Manager.

`staffMap:` Store instances of Staff.

### Methods with Getter
`getDirector():` Get a Director based on the provided director ID.

`getManager():` Get a Manager based on the provided manager ID.

`getStaff():` Get a Staff based on the provided staff ID.

`addDirector():` Adds a Director object to the database.

`addManager():` Adds a Manager object to the database.

`addStaff(Staff staff):` Adds a Staff object to the database