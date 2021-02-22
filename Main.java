import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;

        BankAccount account = new BankAccount(
                "123456789",
                500.0,
                "Christopher Yip",
                "mr.christopheryip@gmail.com",
                "(669)333-1779");

        account.printAccount();

        while (choice != 4) {
            System.out.println("\nMenu");
            System.out.println("1. View account balance");
            System.out.println("2. Make a deposit");
            System.out.println("3. Make a withdrawal");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    account.printBalance();
                    break;
                case 2:
                    System.out.print("\nEnter amount to deposit: $");
                    account.deposit(input.nextDouble());
                    break;
                case 3:
                    System.out.print("\nEnter amount to withdraw: $");
                    account.withdraw(input.nextDouble());
                    break;
                case 4:
                    System.out.println("\nGoodbye!");
                    break;
                default:
                    System.out.println("\nSelection invalid!");
            }
        }
        input.close();
    }
}
