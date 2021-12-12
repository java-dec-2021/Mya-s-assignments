
public class BankAccount {

    private double checkingBalance;
    private double savingBalance;
    private static int numberOfAccounts=0;
    private static double amountOfMoney;

    // constructor
    public BankAccount(){
        numberOfAccounts++;
        amountOfMoney++;
    }

    // public BankAccount(double checkingBalance, double savingBalance){
    //     this.checkingBalance=checkingBalance;
    //     this.savingBalance=savingBalance;
    // }
    public static int getNumOfAccounts(){
        return numberOfAccounts;
    }
    public static double amountOfMoney(){
        return amountOfMoney;
    }
    // getters and setters
    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }
    public double getCheckingBalance() {
        return checkingBalance;
    }
    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }
    public double getSavingBalance() {
        return savingBalance;
    }
    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }
    public static void setNumberOfAccounts(int numberOfAccounts) {
        BankAccount.numberOfAccounts = numberOfAccounts;
    }
    public static double getAmountOfMoney() {
        return amountOfMoney;
    }
    public static void setAmountOfMoney(double amountOfMoney) {
        BankAccount.amountOfMoney = amountOfMoney;
    }

    // methods
    
    public void deposit(double amount, String accountType){
        
        if(accountType.equals("checking")){
            this.setCheckingBalance(this.getCheckingBalance()+amountOfMoney);
        }
        else if(accountType.equals("saving")){
            this.setSavingBalance(this.getSavingBalance()+ amountOfMoney);
        }
        else{
            System.out.println("Invalid account Type");
            return;
        }
        amountOfMoney+= amount;
    }
    public void withdraw(double amount, String accountType){
        if(accountType.equals("checking")){
            if(this.getCheckingBalance()-amount<0){
                System.out.println("Insufficient Funds");
            }
            else {
                this.setCheckingBalance(this.getCheckingBalance()-amount);
                amountOfMoney+= amount;
            }
        }
        else if(accountType.equals("saving")){
            if(this.getSavingBalance()-amount<0){
                System.out.println("Insufficient Funds");
            }
            else{
                this.setSavingBalance(this.getSavingBalance()+amountOfMoney);
                amountOfMoney-= amount;
            }
        }
        else{
            System.out.println("Invalid account Type");
            return;
        }
    }
    public String totalMoney(){
        return "Total Money in the acccount: " + this.getCheckingBalance() + this.getSavingBalance();
    }
}