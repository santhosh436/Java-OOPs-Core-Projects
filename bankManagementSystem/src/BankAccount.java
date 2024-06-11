import java.util.Scanner;

public class BankAccount {
    int balance;
    int previosTransaction;
    String customerName;
    int customerId;

    void deposit(int amount){
        if (amount!=0){
            balance = balance+amount;
            previosTransaction = balance;
        }
    }

    void withdraw(int amount){
        if (amount!=0){
            balance = balance-amount;
            previosTransaction = -amount;
        }
    }

    void PreviousTransaction(){
        if (previosTransaction>0){
            System.out.println("deposited:");
            System.out.println(previosTransaction);
        } else if (previosTransaction<0) {
            System.out.println("withdraw:");
            System.out.println(Math.abs(previosTransaction));
        }
        else {
            System.out.println("No transction is found.");
        }
    }


    void showMenu(){
        char option;
        Scanner in = new Scanner(System.in);
        System.out.println(" Welcome to Bank Services "+customerName +" and your customerId is "+customerId);
        System.out.println("a.Deposit");
        System.out.println("b.withdraw");
        System.out.println("c.Balance");
        System.out.println("d.Previoustransaction");
        System.out.println("d.Exit");
        do {
            System.out.println("===========================================================================");
            System.out.println("Enter the option");
            System.out.println("===========================================================================");
            option = in.next().charAt(0);
            int amount;
            switch (option) {
                case 'a':
                    System.out.println("Enter the amount");
                    amount = in.nextInt();
                    deposit(amount);
                    System.out.println( " Bank Balance: "+balance);
                    break;
                case 'b':
                    System.out.println("Enter the amount");
                    amount = in.nextInt();
                    withdraw(amount);
                    break;
                case 'c':
                    System.out.println("Balance");
                    System.out.println(balance);
                    break;
                case 'd':
                    PreviousTransaction();
                    System.out.println(" totol balance " + balance);
                    break;
                }
            }while (option != 'e');
        System.out.println("Thank you for the services");
    }
}
