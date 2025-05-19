public class BankAccount {
   private int balance=1000;
private int withdrawAmount;
   
    public void withdraw( int withdrawAmount) {
    this.withdrawAmount= withdrawAmount;
        if (withdrawAmount > balance) {
            throw new InsufficiantBalanceException("You have Insufficient balance");
        } else {
            balance -= withdrawAmount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }


    }
}
