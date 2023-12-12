import java.util.Scanner;

class Student {
    String name;
    int[] marks = new int[3];
    double average;

    void calculateAverage() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        average = (double) sum / marks.length;
    }

    void setDetails(String name, int[] marks) {
        this.name = name;
        System.arraycopy(marks, 0, this.marks, 0, marks.length);
        calculateAverage();
    }

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks[0] + ", " + marks[1] + ", " + marks[2]);
        System.out.println("Average: " + average);
    }
}

public class Details {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            int[] marks = new int[3];
            System.out.print("Enter marks for three subjects (separated by spaces): ");
            for (int j = 0; j < 3; j++) {
                marks[j] = scanner.nextInt();
            }
            scanner.nextLine();

            students[i] = new Student();
            students[i].setDetails(name, marks);
        }

        System.out.println("\nDetails of all students:");
        for (Student student : students) {
            student.printDetails();
            System.out.println();
        }

        scanner.close();
    }
}
