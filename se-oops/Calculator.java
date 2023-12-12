import java.util.Scanner;

public class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);

        // Taking inputs for integer addition
        System.out.println("Enter two integers for addition:");
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();
        int sum1 = calc.add(int1, int2);
        System.out.println("\nSum of " + int1 + " and " + int2 + " is: " + sum1);

        // Taking inputs for three integer addition
        System.out.println("\nEnter three integers for addition:");
        int int3 = scanner.nextInt();
        int int4 = scanner.nextInt();
        int int5 = scanner.nextInt();
        int sum2 = calc.add(int3, int4, int5);
        System.out.println("\nSum of " + int3 + ", " + int4 + ", and " + int5 + " is: " + sum2);

        // Taking inputs for double addition
        System.out.println("\nEnter two doubles for addition:");
        double double1 = scanner.nextDouble();
        double double2 = scanner.nextDouble();
        double sum3 = calc.add(double1, double2);
        System.out.println("\nSum of " + double1 + " and " + double2 + " is: " + sum3);

        
        scanner.close();
    }
}
