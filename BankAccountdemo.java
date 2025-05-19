public class BankAccountdemo{
     public static void main(String []args){
        int withdrawAmount = 500;
        BankAccount account = new BankAccount();
        try{
            account.withdraw(withdrawAmount);
        }
        catch (InsufficiantBalanceException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("Invalid Input");
        }
     }
}
