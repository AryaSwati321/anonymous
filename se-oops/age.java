import java.util.Scanner;

class AgeExceptionFailure extends Exception {
    public AgeExceptionFailure(String message) {
        super(message);
    }
}

public class age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter candidate's name: ");
        String candidateName = scanner.nextLine();

        System.out.print("Enter candidate's age: ");
        int candidateAge = scanner.nextInt();

        try {
            if (candidateAge < 18) {
                throw new AgeExceptionFailure("AgeExceptionFailure: " + candidateName + " is not eligible for voting!");
            } else {
                System.out.println(candidateName + " is eligible for voting!");
            }
        } catch (AgeExceptionFailure e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

