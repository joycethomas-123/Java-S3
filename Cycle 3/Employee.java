import java.util.*;
class Employee 
{
    String name ;
    int empono,phno;
    void ReadDetails()  
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter name of the employee:");
        name = obj.nextLine();  
       
        System.out.print("Enter Empo no:"); 
        empono = obj.nextInt();
        
        System.out.print("Enter Phone no:"); 
        phno = obj.nextInt();
        System.out.println();
    }
       
    void PrintDetails()
    {
        
        System.out.print("Name : "+name);
        System.out.println();
        System.out.print("Empo no : "+empono); 
        System.out.println();
        System.out.print("Phone no : "+phno); 
        System.out.println(); 
    }

    public static void main(String args[]) 
    {
        int i;  
        Main e[] = new Main[50];
        System.out.println("EMPLOYEES DETAILS\n");
        System.out.println();
        for(i=0;i<5;i++) 
        {  
            e[i] = new Main();
            e[i].ReadDetails(); 
        }
         
        System.out.println("The entered details are:\n"); 
          
        for(i=0;i<5;i++) 
          {
            e[i].PrintDetails();
          }
    }
}
