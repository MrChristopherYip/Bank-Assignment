public class BankAccount {

    private String accountNum;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNum;

    public BankAccount(String accountNum, double balance, String customerName, String email, String phoneNum) {
        this.accountNum = accountNum;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNum = phoneNum;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "Name: " + customerName +
                "\nAccount Number: " + accountNum +
                "\nBalance: $" + balance +
                "\nEmail: " + email +
                "\nPhone Number: " + phoneNum;
    }

    public void deposit(double amt) {
        balance += amt;
        System.out.println("Deposit: $" + amt);
        System.out.println("Current balance: $" + balance);
    }

    public void withdraw(double amt) {
        if (amt > balance)
            System.out.println("Insufficient funds.");
        else {
            balance -= amt;
            System.out.println("Withdraw: $" + amt);
        }
        System.out.println("Current balance: $" + balance);
    }

    public void printBalance() {
        System.out.println("Bank account for: " + customerName);
        System.out.println("Current balance: $" + balance);
    }

    public void printAccount() {
        System.out.println(this.toString());
    }
}
