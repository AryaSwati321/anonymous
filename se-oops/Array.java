import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();

        // Adding objects to the ArrayList
        System.out.println("Enter three objects to add to the ArrayList:");
        for (int i = 0; i < 3; i++) {
            String input = scanner.nextLine();
            arrayList.add(input);
        }

        // Displaying the ArrayList
        System.out.println("ArrayList: " + arrayList);

        // Add object at a specific location
        System.out.println("Enter an object to add at a specific location (provide index and value):");
        int index = scanner.nextInt();
        String value = scanner.next();
        arrayList.add(index, value);
        System.out.println("After adding at index " + index + ": " + arrayList);

        // Remove by value
        scanner.nextLine(); // Consume the newline character
        System.out.println("Enter an object to remove:");
        String removeValue = scanner.nextLine();
        arrayList.remove(removeValue);
        System.out.println("After removing '" + removeValue + "': " + arrayList);

        // Check if the array is empty
        System.out.println("Is the ArrayList empty? " + arrayList.isEmpty());

        scanner.close();
    }
}
