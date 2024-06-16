import java.util.Scanner;

public class BankAccount {
    int balance;
    int previosTransaction;
    String customerName;
    int customerId;

    void deposit(int amount){
        if (amount>0){
            balance = balance+amount;
            previosTransaction = balance;
        }
    }

    void withdraw(int amount){
        if (amount>0){
            balance = balance-amount;
            previosTransaction = -amount;
        }
    }

    void PreviousTransaction(){
        if (previosTransaction>0){
            System.out.println("Credited:"+previosTransaction);
        } else if (previosTransaction<0) {
            System.out.println("Debited:"+Math.abs(previosTransaction));
        }
        else {
            System.out.println("No transction is found.");
        }
    }


    void showMenu(){
        char option;
        Scanner in = new Scanner(System.in);
        System.out.println(" Welcome to Bank Services "+customerName +" and your customerId is "+customerId);

        do {
            System.out.println("a.Deposit");
            System.out.println("b.withdraw");
            System.out.println("c.Balance");
            System.out.println("d.Previoustransaction");
            System.out.println("d.Exit");
            System.out.println("===========================================================================");
            System.out.println("choose the option:");
            System.out.println("===========================================================================");
            option = in.next().charAt(0);
            int amount;
            switch (option) {
                case 'a':
                    System.out.println("Enter the amount");
                    amount = in.nextInt();
                    deposit(amount);
                    System.out.println(amount+"/- rupees Credited in your account.");
                    System.out.println("================================================================");
                    break;
                case 'b':
                    System.out.println("Enter the amount");
                    amount = in.nextInt();
                    withdraw(amount);
                    System.out.println(amount+ "/- rupees Debited from your account.");
                    System.out.println("======================================================================");
                    break;
                case 'c':
                    System.out.println("Balance");
                    System.out.println(balance+"/-");
                    System.out.println("========================================================================");
                    break;
                case 'd':
                    PreviousTransaction();
                    System.out.println(" totol balance " + balance);
                    System.out.println("=================================================================================");
                    break;
                }
            }while (option != 'e');
        System.out.println("Thank you for the services");
    }
}
