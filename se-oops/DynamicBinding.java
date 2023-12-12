import java.util.*;
abstract class Shape
{
    double val1 ,val2;
    void input()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first value");
        val1 = s.nextDouble();
        System.out.println("Enter Second value");
        val2 = s.nextDouble(); 
    }
     abstract void computeArea();
}
class Triangle extends Shape
{
    void computeArea()
    {
        double area;
        area = 0.1f/0.2 * val1 * val2;
        System.out.println("Traiangle Area :"+area);
    }
}
class Rectangle extends Shape
{
    void computeArea()
    {
        double area;
        area = val1 * val2;
        System.out.println("Rectangle area :"+area);
    }
}
public class DynamicBinding
{
    public static void main(String args[])
    {
       // Shape s; // refrence of base class
        
        Shape T = new Triangle();
        Shape R = new Rectangle();
        
        //Triangle T = new Triangle();
        //Rectangle R = new Rectangle();
        
        //s = T;
        
        T.input();
        T.computeArea();
        
        
        //s = R;
        
        R.input();
        R.computeArea(); 
    }
}

