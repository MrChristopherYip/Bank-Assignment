import java.util.ArrayList;

public class BankAccountsDAO {
    private ArrayList<BankAccount> bankAccounts = new ArrayList<>();

    private int findByAccountNum(String accountNum) {
        for (int i = 0; i < bankAccounts.size(); i++) {
            if (accountNum.equalsIgnoreCase(bankAccounts.get(i).getAccountNum()))
                return i;
        }
        return -1;
    }

    // Create
    public boolean createAccount(BankAccount account) {
        if (findByAccountNum(account.getAccountNum()) == -1) {
            bankAccounts.add(account);
            return true;
        }
        else
            return false;
    }

    // Read
    public ArrayList<BankAccount> getAllAccounts() {
        return bankAccounts;
    }

    public BankAccount getAccount(String accountNum) {
        int i = findByAccountNum(accountNum);
        if (i != -1)
            return bankAccounts.get(i);
        else
            return null;
    }

    // Update
    public boolean updateAccount(BankAccount account) {
        int i = findByAccountNum(account.getAccountNum());
        if (i != -1) {
            bankAccounts.set(i, account);
            return true;
        }
        else
            return false;
    }

    // Delete
    public boolean deleteAccount(String accountNum) {
        int i = findByAccountNum(accountNum);
        if (i != -1) {
            bankAccounts.remove(i);
            return true;
        }
        else
            return false;
    }
}
