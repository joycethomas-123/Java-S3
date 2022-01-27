import java.util.*;
class PerimeterShapes
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        int a = obj.nextInt();
        System.out.print("Enter length of rectangle: ");
        int b = obj.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        int c = obj.nextInt();
        Perimeter obj1 = new Perimeter();
        obj1.Perimeter(a);
        obj1.Perimeter(b,c);
    }
    
}

class Perimeter
{
    void Perimeter(int r)
    { 
        double perimeter;
        perimeter=2*3.14*r;
        System.out.println("Perimeter of circle is: "+perimeter);
    }
    void Perimeter(int l,int b)
    {
        int perimeter;
        perimeter=2*(l+b);
        System.out.println("Perimeter of rectangle is: "+perimeter);
    }
    
}
