import java.util.Scanner;

class Complex {
    private double real;
    private double imaginary;

    // Default Constructor
    public Complex() {
        this.real = 0;
        this.imaginary = 0;
    }

    // Parameterized Constructor
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Addition of two complex numbers
    public Complex add(Complex c) {
        double newReal = this.real + c.real;
        double newImaginary = this.imaginary + c.imaginary;
        return new Complex(newReal, newImaginary);
    }

    // Subtraction of two complex numbers
    public Complex subtract(Complex c) {
        double newReal = this.real - c.real;
        double newImaginary = this.imaginary - c.imaginary;
        return new Complex(newReal, newImaginary);
    }

    // Multiplication of two complex numbers
    public Complex multiply(Complex c) {
        double newReal = this.real * c.real - this.imaginary * c.imaginary;
        double newImaginary = this.real * c.imaginary + this.imaginary * c.real;
        return new Complex(newReal, newImaginary);
    }

    // Display complex number
    public void display() {
        System.out.println("Complex number: " + this.real + " + " + this.imaginary + "i");
    }
}

public class ComplexOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter real part of first complex number:");
        double real1 = scanner.nextDouble();
        System.out.println("Enter imaginary part of first complex number:");
        double imaginary1 = scanner.nextDouble();
        Complex c1 = new Complex(real1, imaginary1);

        System.out.println("Enter real part of second complex number:");
        double real2 = scanner.nextDouble();
        System.out.println("Enter imaginary part of second complex number:");
        double imaginary2 = scanner.nextDouble();
        Complex c2 = new Complex(real2, imaginary2);

        // Performing arithmetic operations
        Complex sum = c1.add(c2);
        Complex difference = c1.subtract(c2);
        Complex product = c1.multiply(c2);

        // Displaying results
        System.out.println("Sum:");
        sum.display();

        System.out.println("\nDifference:");
        difference.display();

        System.out.println("\nProduct:");
        product.display();

        scanner.close();
    }
}

