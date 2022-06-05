package ATM_MACHINE;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

   Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    // set the customer number

     public int setCustomerNumber(int customerNumber){
         this.customerNumber = customerNumber;

        return customerNumber;
     }

     // get the customer number

     public int getCustormerNumber(){
         return customerNumber;
     }

     // set the pin number

     public int setPinNumber(int pinNumber){
         this.pinNumber = pinNumber;
         return pinNumber;
     }

     //get the pin number

     public int getPinNumber(){
         return pinNumber;
     }

     // get Checking account balance

     public double getCheckingBalance(){
         return checkingBalance;
     }

     // get Saving account balance

     public double getSavingBalance(){
         return savingBalance;
     }

     //calculate checking account withdrawal

     public double calcCheckingWithdraw(double amount){
         checkingBalance = (checkingBalance - amount);
         return checkingBalance;
     }

     //calculate Saving account withdrawal

     public double calcSavingWithdraw(double amount){
         savingBalance = (savingBalance - amount);
         return savingBalance;
     }

     // calculate checking account deposit

     public double calcCheckingDeposit(double amount){
         checkingBalance = (checkingBalance + amount);
         return checkingBalance;
     }

     // calculate Saving account deposit

     public double calcSavingDeposit(double amount){
         savingBalance = (savingBalance + amount);
         return savingBalance;
     }

     // Customer checking account withdraw input

     public void getCheckingWithdrawInput(){
         System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
         System.out.println("Amount you want to withdraw from checking account");

         double amount = input.nextDouble();

         if((checkingBalance - amount) >= 0){
             calcCheckingWithdraw(amount);
             System.out.println("New checking account balance " + moneyFormat.format(checkingBalance)); // ------------------------------
         }else{
             System.out.println("Balance cannot negative." + "\n");

         }

     }

     // Customer Saving account withdraw input
     
     public void getSavingWithdrawInput(){
         System.out.println("Saving account balance: " + moneyFormat.format(savingBalance));
         System.out.println("Amount you want to withdraw from Saving account");

         double amount = input.nextDouble();

         if((savingBalance - amount) >= 0){
             calcSavingWithdraw(amount);
             System.out.println("New Saving account balance: " + savingBalance + "\n");

         }else{
             System.out.println("Balance cannot be negative. " + "\n");
         }
     }

   // Customer checking account deposit input

   public void getCheckingDepositInput(){
       System.out.println("Checking account balance: " + moneyFormat.format(checkingBalance));
       System.out.println("Amount you want to deposit from checking account: ");
       double amount = input.nextDouble();

       if((checkingBalance + amount) >=0){
           calcCheckingDeposit(amount);
           System.out.println("New checking account balance: " + moneyFormat.format(checkingBalance));
       }else{
           System.out.println("Balance cannot be negative." + "\n");
       }
   }

   // Customer saving account deposit input

   public void getSavingDepositInput(){
       System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
       System.out.println("Amount you want to deposit from saving Account: " );
       double amount = input.nextDouble();


       if((savingBalance + amount) >= 0){
           calcSavingDeposit(amount);
           System.out.println("New saving account balance: " + moneyFormat.format(savingBalance));

       }else{
           System.out.println("Balance cannot be negative." + "\n");
       }
   }
    
   private int customerNumber;
   private int pinNumber;
   private double checkingBalance = 0;
   private double savingBalance = 0;

}  