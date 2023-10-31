public class User {
    private String name;

    private String ID;
        private int age;
        private int hourRated;
        private int hourInMonth;
        User(int age,String ID,String name,int hourRated,int hourInMonth){
            this.age=age;
            this.ID=ID;
            this.name=name;
            this.hourInMonth=hourInMonth;
            this.hourRated=hourRated;
        }
        public String getID(){
            return ID;
        }
        public int getAge(){
            return age;
        }

        public int getHourInMonth() {
            return hourInMonth;
        }

        public String getName() {
            return name;
        }

        public int getHourRated() {
            return hourRated;
        }
        public int calculateSalary(){
            return hourRated*hourInMonth;
        }
    }

