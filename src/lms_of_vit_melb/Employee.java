package lms_of_vit_melb;

public class Employee extends User {
    private String role;

    public Employee(String userId, String name, String role) {
        super(userId, name);
        this.role = role;
    }

    public String getRole() {
        return role;
    }
   

    @Override
    public String toString() {
        return super.toString() + ", Role: " + role;
    }
    public String getEmployee(){
        return name;
    }
        public String getEmployeeId(){
        return userId;
    }
      public String getName(){
        return name;
      }
}
