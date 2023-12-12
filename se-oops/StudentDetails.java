// Abstract Student class
abstract class Student {
    // Abstract methods to get student details
    public abstract String getName();
    public abstract int getSSCMarks();
    public abstract int getHSCMarks();
}

// Harish class extending Student
class Harish extends Student {
    private String name = "Harish";
    private int sscMarks = 85;
    private int hscMarks = 90;

    // Implementing abstract methods
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSSCMarks() {
        return sscMarks;
    }

    @Override
    public int getHSCMarks() {
        return hscMarks;
    }
    
    // Method to print student details
    public void printDetails() {
        System.out.println("Name: " + getName());
        System.out.println("SSC Marks: " + getSSCMarks());
        System.out.println("HSC Marks: " + getHSCMarks());
    }
}

// Jayant class extending Student
class Jayant extends Student {
    private String name = "Jayant";
    private int sscMarks = 98;
    private int hscMarks = 89;

    // Implementing abstract methods
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSSCMarks() {
        return sscMarks;
    }

    @Override
    public int getHSCMarks() {
        return hscMarks;
    }
    
    // Method to print student details
    public void printDetails() {
        System.out.println("Name: " + getName());
        System.out.println("SSC Marks: " + getSSCMarks());
        System.out.println("HSC Marks: " + getHSCMarks());
    }
}


// Vijay class extending Student
class Vijay extends Student {
    private String name = "Vijay";
    private int sscMarks = 100;
    private int hscMarks = 94;

    // Implementing abstract methods
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSSCMarks() {
        return sscMarks;
    }

    @Override
    public int getHSCMarks() {
        return hscMarks;
    }
    
    // Method to print student details
    public void printDetails() {
        System.out.println("Name: " + getName());
        System.out.println("SSC Marks: " + getSSCMarks());
        System.out.println("HSC Marks: " + getHSCMarks());
    }
}


// Main class
public class StudentDetails {
    public static void main(String[] args) {
        // Creating instances of Harish, Jayant, and Vijay
        Harish harish = new Harish();
        Jayant jayant = new Jayant();
        Vijay vijay = new Vijay();

        // Printing details of students
        System.out.println("Details of Harish:");
        harish.printDetails();

        // printing for Jayant 
       System.out.println("\nDetails of Jayant:");
        jayant.printDetails();

        // printing for Vijay 
       System.out.println("\nDetails of Vijay:");
        vijay.printDetails();

    }
}
