package ATM_MACHINE;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;


public class OperationMenu extends Account{
    
    Scanner menuInput = new Scanner(System.in);
    int selection;
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

    /* Validate Login information customer number and pin number */

    public void getLogin() throws IOException{
        int x = 1;

        do{
            try {
                
                data.put(98982323, 1234);
                data.put(12345678, 3333);


                System.out.println("welcome to the ATM project");

                System.out.println("Enter your Customer Number: ");
                setCustomerNumber(menuInput.nextInt());

                System.out.println("Enter your Pin Number: ");
                setPinNumber(menuInput.nextInt());

                
            } catch (Exception e) {
               System.out.println("\n" + "Invalid character(s). ONly numbers." + "\n");
               x = 2;
            }


            for(Entry<Integer, Integer> entry : data.entrySet()){
                if(entry.getKey() == getCustormerNumber() && entry.getValue() == getPinNumber()){
                    getAccoutType();
                }else{
                    System.out.println("\n" + "Wrong Customer Number or pin number");
                }
            }

            
        }while(x == 1);
    }

    //display account type menu with selection

    public void getAccoutType(){
        System.out.println("Select the Account you want to access:");
        System.out.println("Type 1 - Checking Account");
        System.out.println("Type 2 - Saving Account");
        System.out.println("Type 3 - Exit");
        System.out.println("Choice: ");

        selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                getChecking();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                System.out.println("Thank You for using this ATM, have good day");
                break;
            default:
                System.out.println("\n" + "Invalid Choice." + "\n");
                getAccoutType();
                
        }
    }

    // Display checking account menu with selection

    public void getChecking(){
        System.out.println("Checking Account:");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Funds ");
        System.out.println("Typw 3 - Deposit Funds");
        System.out.println("Type 4 - Exit");
        System.out.println("Choice: ");

        selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                System.out.println("Checking Account Balance:" + moneyFormat.format(getCheckingBalance()));
                getAccoutType();
                break;
            case 2:
                getCheckingWithdrawInput();
                getAccoutType();
                break;

            case 3:
                getCheckingDepositInput();
                getAccoutType();
                break;
            case 4:
                System.out.println("Thanks for choosing this ATM !!");
                break;
            
            default:
                System.out.println("\n" + "Invalid choice" + "\n");
               break;
                
        }
    }

    // Display saving account menu with selections

    public void getSaving(){
        System.out.println("Saving Account:");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Funds ");
        System.out.println("Typw 3 - Deposit Funds");
        System.out.println("Type 4 - Exit");
        System.out.println("Choice: ");

        selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                System.out.println("Saving Account Balance:" + moneyFormat.format(getSavingBalance()));
                getAccoutType();
                break;
            case 2:
                getSavingWithdrawInput();
                getAccoutType();
                break;
            case 3:
                getSavingDepositInput();
                getAccoutType();
                break;
            default:
                System.out.println("\n" + "Invalid choice" + "\n");
                break;
        }
    }

}


