
public class BankAccountTest {
public static void main(String[] args) {
    BankAccount myBankAccount = new BankAccount();
    myBankAccount.deposit(10,"checking");
    // myBankAccount.withdraw(200,"saving");
    System.out.println(myBankAccount.totalMoney());
}
    
}