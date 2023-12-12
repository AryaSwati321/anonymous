import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        try {
            Scanner obj = new Scanner(System.in);
            int a;
            int b;
            
            System.out.print("Enter a: ");
            a = obj.nextInt();
            
            System.out.print("Enter b: ");
            b = obj.nextInt();
            
            System.out.println("Division is : " + (a / b));
            System.out.println("Multiplication is : " + (a * b));
            System.out.println("Addition is : " + (a + b));
            System.out.println("Subtraction is : " + (a - b));
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } catch (InputMismatchException e) {
            System.out.println("Please enter valid integers.");
        } catch (Exception e) {
            System.out.println("Error is : " + e);
        }
    }
}
