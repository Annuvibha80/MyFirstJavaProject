
class  Person{
    private String Name;
    private String EmployeeId;

    public void setEmployeeInfo(String Name, String EmployeeId){
        this.Name = Name;
        this.EmployeeId = EmployeeId;
    }

    public void getEmployeeInfo(){
        System.out.println("Employee Name : " +Name);
        System.out.println("EmployeeId : " +EmployeeId);
    }
}


public class Employee {
    public static void main(String[] args) {
        Person obj = new Person();
        obj.setEmployeeInfo("Annuvibha", "ID1001");
        obj.getEmployeeInfo();
    }
}
