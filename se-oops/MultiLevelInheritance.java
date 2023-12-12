import java.util.Scanner;

class Account {
    String cust_name;
    int acc_no;
}

class Saving_Account extends Account {
    double min_bal;
    double saving_bal;
}

class Acct_Details extends Saving_Account {
    double deposits;
    double withdrawals;
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Acct_Details account = new Acct_Details();

        System.out.println("Enter Customer Name: ");
        account.cust_name = scanner.nextLine();

        System.out.println("Enter Account Number: ");
        account.acc_no = scanner.nextInt();

        System.out.println("Enter Minimum Balance: ");
        account.min_bal = scanner.nextDouble();

        System.out.println("Enter Savings Balance: ");
        account.saving_bal = scanner.nextDouble();

        System.out.println("Enter Total Deposits: ");
        account.deposits = scanner.nextDouble();

        System.out.println("Enter Total Withdrawals: ");
        account.withdrawals = scanner.nextDouble();

        System.out.println("\nAccount Details:");
        System.out.println("Customer Name: " + account.cust_name);
        System.out.println("Account Number: " + account.acc_no);
        System.out.println("Minimum Balance: " + account.min_bal);
        System.out.println("Savings Balance: " + account.saving_bal);
        System.out.println("Total Deposits: " + account.deposits);
        System.out.println("Total Withdrawals: " + account.withdrawals);

        scanner.close();
    }
}
