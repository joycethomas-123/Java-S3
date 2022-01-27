import java.util.*;
class AreaShapes
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
       
        System.out.print("Enter base of triangle: ");
        float d = obj.nextInt();
        System.out.print("Enter height of triangle: ");
        float e = obj.nextInt();
       
        Shape obj1 = new Shape();
        obj1.Area(a);
        obj1.Area(b,c);
        obj1.Area(d,e);
    }
    
}

class Shape
{
    void Area(int r)
    { 
        double area;
        area=3.14*r*r;
        System.out.println("Area of circle is: "+area);
    }
    void Area(int l,int b)
    {
        int area;
        area=l*b;
        System.out.println("Area of rectangle is: "+area);
    }
    void Area(float b,float h)
    {
        float area;
        area=b*h/2;
        System.out.println("Area of triangle is: "+area);
    }
}


