
package javahome15_08_2023;

import abstructclass.BankAccount;
import abstructclass.CheckingAccount;
import abstructclass.SavingAccount;
import java.util.Scanner;


public class JavaHome15_08_2023 {


    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter D For Saving deposit and W for withdraw");
        //String input=sc.nextLine();
//        String accountNum=sc.nextLine();
//        String accountHolder=sc.nextLine();
//        double balance=sc.nextDouble();
        
        while(sc.hasNextLine()){
             String input=sc.nextLine();
            if(input.equalsIgnoreCase("D")|| input.equalsIgnoreCase("W")){
                //break;
            }
            else{
                 System.out.println("Please enter valid data D or W");
            }
        
        if(input.equalsIgnoreCase("D")){
        System.out.println("Enter Account Number");
        String accountNum=sc.nextLine();
        System.out.println("Enter Holder name");
        String accountHolder=sc.nextLine();
        System.out.println("Enter Account Balance");
        double balance=sc.nextDouble();
        System.out.println("Enter Deposit Amount");
        double deposit=sc.nextDouble();
        System.out.println("Enter Withdraw Amount");
        double withdraw=sc.nextDouble();
        
        
        BankAccount savingAccount=new SavingAccount(accountNum, accountHolder, balance);
        
        savingAccount.deposit(deposit);
        savingAccount.withdraw(withdraw);
        //System.out.println("Account holder name: "+savingAccount.getAccountHolder());
        break;
        
        }
        else if(input.equalsIgnoreCase("W")){
        System.out.println("Enter Account Number");
        String accountNum=sc.nextLine();
        System.out.println("Enter Holder name");
        
        String accountHolder=sc.nextLine();
        System.out.println("Enter Account Balance");
        double balance=sc.nextDouble();
        System.out.println("Enter Deposit Amount");
        
        double deposit=sc.nextDouble();
        System.out.println("Enter Withdraw Amount");
        double withdraw=sc.nextDouble();
                

        BankAccount checkingAccount=new CheckingAccount(accountNum, accountHolder, balance);

        System.out.println("Acount holder name: "+checkingAccount.getAccountHolder()+"\n");
        checkingAccount.deposit(deposit);
        checkingAccount.withdraw(withdraw);
        break;
        }
            
        //System.out.println("After Claim Balance "+savingAccount.getBalance()-savingAccount.withdraw(0));
//        else{
//            System.out.println("Please enter valid data");
//            
//        }
        
       }

    }
    
}
