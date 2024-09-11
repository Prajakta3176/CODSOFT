//TASK 3
import java.util.Scanner;

// internal operations in bank account
class bankAccount
{
    public double balance;

    public bankAccount(double initialBalance)
    {
        this.balance = initialBalance;
    }

    public void deposit(double amount)
    {
        if(amount > 0)
        {
            balance += amount ;
            System.out.println("Deposit successful! You have added $"+ amount);
        }
        else{
            System.out.println("Deposit amount should be greater than zero.");
        }
    }

    public void withdraw(double amount)
    {
        if(amount > 0 && amount <= balance)
        {
            balance -= amount;
            System.out.println("Withdrawal successful! You have withdrawn $"+amount);
        }
        else if(amount > balance)
        {
            System.out.println("Insufficient Balance!");
        }
        // when entered amount is 0
        else
        {
            System.out.println("Withdrawal amount must be greater than zero");
        }
    }

    public double balanceCheck()
    {
        return balance;
    }
}

// making atm interface

class atm
{
    private bankAccount account;
    private Scanner sc;

    public atm(bankAccount account)
    {
        this.account = account;
        this.sc = new Scanner(System.in);
    }

    public void start()
    {
        System.out.println("Welcome to thhe ATM!");

        while(true)
        {
            System.out.println("Please choose an option: ");
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Check balance");
            System.out.println("4.Exit");
            System.out.println("Enter your choice (1-4): ");


            int choice = sc.nextInt();

            switch (choice) 
            {
            case 1:
                {
                    System.out.print("Enter the amount to deposit: $");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                }
            case 2:
                {
                  System.out.print("Enter the amount you want to withdraw: $"); 
                  double withdrawAmount = sc.nextDouble();
                  account.withdraw(withdrawAmount); 
                  break;
                }
            case 3:
                {
                  double yourBalance = account.balanceCheck();
                  System.out.println("Your current balance is: $"+yourBalance);  
                  break;
                }
            case 4:
                {
                    System.out.println("ThankYou for using our ATM!");
                    return;
                }
            default:
                {
                    System.out.println("Invalid choice,Choose between 1 and 4:");
                }
                }

        
        }
    }

}

public class atmInterface {
    public static void main(String[] args) {
        // minimum balance in account should be 1000
        bankAccount myAccount = new bankAccount(1000.00);

        atm myAtm = new atm(myAccount) ;
        myAtm.start();
        

    }
}
