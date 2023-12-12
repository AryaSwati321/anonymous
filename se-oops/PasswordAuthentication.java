import java.util.Scanner;

class AuthenticationFailure extends Exception {
    public AuthenticationFailure(String message) {
        super(message);
    }
}

public class PasswordAuthentication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the stored password: ");
        String storedPassword = scanner.nextLine();

        System.out.print("Enter password for authentication: ");
        String enteredPassword = scanner.nextLine();

        try {
            if (!enteredPassword.equals(storedPassword)) {
                throw new AuthenticationFailure("AuthenticationFailure: Incorrect password entered!");
            } else {
                System.out.println("Authentication successful!");
            }
        } catch (AuthenticationFailure e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
