import java.util.Scanner;

class Employee {
    int empID;
    String name;
    double salary;
    int experience;
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[3];

        for (int i = 0; i < 3; i++) {
            employees[i] = new Employee();

            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.print("Employee ID: ");
            employees[i].empID = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Name: ");
            employees[i].name = scanner.nextLine();

            System.out.print("Salary: ");
            employees[i].salary = scanner.nextDouble();

            System.out.print("Experience (in years): ");
            employees[i].experience = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            scanner.nextLine();
      }

        System.out.println("\nDetails of all employees:");
        for (Employee employee : employees) {
            System.out.println("Employee ID: " + employee.empID);
            System.out.println("Name: " + employee.name);
            System.out.println("Salary: " + employee.salary);
            System.out.println("Experience: " + employee.experience + " years");
            System.out.println();
        }

        scanner.close();
    }
}
