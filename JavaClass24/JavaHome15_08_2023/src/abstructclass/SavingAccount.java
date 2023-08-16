
package abstructclass;


public class SavingAccount extends BankAccount{

    public SavingAccount() {
    }

    public SavingAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    
    

    @Override
    public void deposit(double amount) {
      if(amount>0){
          balance+=amount;
          
          
          System.out.println("STATE BANK OF ISDB\n"
                  + "Transaction Approved\n"
                  +"Dear "+getAccountHolder()+"\n"+ 

                   "Good news! Your claim transaction of "+amount+ "$ has been approved and successfully processed.\n" );
          
          //System.out.println("The deposit is "+amount+" and Total amount is "+balance+"\n");
      }
      else{
          System.out.println("Enter Correct amount");
      }
    }

    @Override
    public void withdraw(double amount) {
        if(balance <amount){
            System.out.println("\n[Bank Name]\n" +"State Bank of IDB"+
        "Transaction Error Alert\n" +
       "\n" +
       "Dear " +getAccountHolder()+
       "\n" +
     "We regret to inform you that your recent claim transaction was declined due Blance. Please ensure sufficient funds are available. For assistance, call [Customer Support Number].\n" +
     "\n" +
    "Sincerely MD.Sabit Hassan,\n" +
    "CEO Of SBOI \n"+
"[State Bank of IDB]");
        }
//        else if(){
//            System.out.println(amount+" claim successfully");
//            System.out.println("The final balance is "+(balance-amount));
//        }
        
        else{
            System.out.println(amount+ " claim Succesfully");
            System.out.println("The final balance is "+(balance-amount));
            
        }
          
    }
   
   

   
    
}
