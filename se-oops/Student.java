import java.util.Scanner;

public class Student {
    private String name;
    private int rollNo;
    private int sub1;
    private int sub2;

    // Method to initialize values of data members
    public void initialize() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter Roll No: ");
        rollNo = scanner.nextInt();
        System.out.print("Enter marks for Subject 1: ");
        sub1 = scanner.nextInt();
        System.out.print("Enter marks for Subject 2: ");
        sub2 = scanner.nextInt();
        scanner.close();
    }

    // Method to display values of data members
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks in Subject 1: " + sub1);
        System.out.println("Marks in Subject 2: " + sub2);
    }

    // Method to calculate total marks
    public int calculateTotal() {
        return sub1 + sub2;
    }

    // Method to calculate percentage
    public double calculatePercentage() {
        int total = calculateTotal();
        return (total / 2.0); // Assuming both subjects have equal weightage
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.initialize();
        student.display();
        System.out.println("Total Marks: " + student.calculateTotal());
        System.out.println("Percentage: " + student.calculatePercentage() + "%");
    }
}
