import java.util.Scanner;
public class Question34 {
    public static void main(String[] args) {
        Employee_detail e1 = new Employee_detail();
        e1.getDetail();
        e1.setDetail();
    }
}
class Employee_detail{
    Scanner sc = new Scanner(System.in);
    int employee_id;
    String name;
    String designation;
    int salary;
    public void getDetail(){
        System.out.println("Enter Employee_ID");
        employee_id = sc.nextInt();
        System.out.println("Enter Name");
        name = sc.next();
        System.out.println("Enter Designation");
        designation = sc.next();
        System.out.println("Enter  salary");
        salary = sc.nextInt();
    }
    public void setDetail(){
        System.out.println("Enployee_ID "+employee_id);
        System.out.println("Enployee Name "+name);
        System.out.println("Enployee Designation "+designation);
        System.out.println("Employee Salary "+salary);
    }
}
