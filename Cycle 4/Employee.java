import java.util.*;
public class Employee
{
    
    
        String name,address,phno;
        int age,salary;
        void print_Salary(int salary)
        {
            System.out.println(salary);
        }
    
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        Officer obj1=new Officer();
        Manager obj2=new Manager();
        obj1.Details();
        System.out.println("Enter your Specialization:");
        obj1.Specialization=obj.nextLine();
        obj2.Details();
        System.out.println("Enter your Department:");
        obj2.Department=obj.nextLine();
        obj1.Display();
        System.out.println("Salary of officer:");
        obj1.print_Salary(obj1.salary);
        obj2.Display();
        System.out.println("Salary of manager:");
        obj2.print_Salary(obj2.salary);
        obj.close();
        
    }
    void Details()
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter your name: ");
        name=obj.nextLine();
        System.out.print("Enter your address: ");
        address=obj.nextLine();
        System.out.print("Enter your phone number: ");
        phno=obj.next();
        System.out.print("Enter your age: ");
        age=obj.nextInt();
        System.out.print("Enter your salary: ");
        salary=obj.nextInt();
        
    }
    void Display()
    {
        System.out.println("ENTERED DETAILS ARE: \n");
        System.out.println("Name:"+name);
        System.out.println("Address:"+address);
        System.out.println("Phone number:"+phno);
        System.out.println("Age:"+age);
        System.out.println("Salary:"+salary);
    }
}
class Officer extends Employee
{
   String Specialization;
}
class Manager extends Employee
{
   String Department;
}
