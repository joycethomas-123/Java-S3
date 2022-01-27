public class Employee
{
    public static void main(String args[])
    {
        Engineer e=new Engineer();
        e.display();
        e.calcSalary();
    }

    void display()
    {
        System.out.println("Name of class is Employee.");
    }

    void calcSalary()
    {
        System.out.println("Salary of employee is 10000");
    }
}

class Engineer extends Employee
{
    void calcSalary()
    {
        super.calcSalary();
        System.out.println("Salary of engineer is 20000");
    }
}
