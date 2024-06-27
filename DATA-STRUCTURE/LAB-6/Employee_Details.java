import java.util.*;
public class Employee_Details{
    int employee_id;
    String name;
    String designation;
    double salary;
    public Employee_Details(int id,String nme,String design,double employee_salary){
        employee_id=id;
        name=nme;
        designation=design;
        salary=employee_salary;
    }
    public void display(){
        System.out.println("Employee_Id: "+employee_id+"\nName: "+name+"\nDesignation: "+designation+"\nEmployee_Salary: "+salary);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the employee id");
        int employee_id=sc.nextInt();
        System.out.println("enter the name:");
        String name=sc.next();
        System.out.println("enter the designation:");
        String designation=sc.next();
        System.out.println("enter the salary:");
        double salary=sc.nextDouble();
        Employee_Details employee=new Employee_Details(employee_id,name,designation,salary);
        System.out.println();
        System.out.println("Employee Details are as follows:-");
        employee.display();
    }
    
}