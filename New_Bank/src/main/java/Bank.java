import java.util.*;
public class Bank {
    String name;
    long accno;
    int balance;
    public Bank(String n, long a, int b) {
        name = n;
        accno = a;
        balance = b;
    }
    public void balanceamount() {
        System.out.println("Total Balance Amount :" + balance + "Rs");
    }
    public void deposit(int depositamount) {
        System.out.println("The Deposited Amount is :" + depositamount + "Rs");
        balance = balance + depositamount;
    }
    public void withdraw(int withdrawamount) {
        if (withdrawamount < balance) {
            System.out.println("Total Amount withdrawed :" + withdrawamount + "Rs");
            balance = balance - withdrawamount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
    public static void main(String[] args) {
        Bank a = new Bank("Arun", 123456789123456789L, 1000);
        System.out.println("Name :" + a.name);
        System.out.println("Account Number :" + a.accno);
        System.out.println("Current Balance :" + a.balance);
        int check = 0;
        do {
            System.out.println("Enter the mode of Transaction :");
            Scanner sc = new Scanner(System.in);
            String expression = sc.nextLine();
            switch (expression) {
                case "Deposit":
                    System.out.println("Enter the deposite Amount :");
                    int depositamount = sc.nextInt();
                    a.deposit(depositamount);
                    break;
                case "Withdraw":
                    System.out.println("Enter the withdraw Amount :");
                    int withdrawamount = sc.nextInt();
                    a.withdraw(withdrawamount);
                    break;
                case "Balance":
                    a.balanceamount();
                    break;
                default:
                    System.out.println("Enter the valid transaction");
            }
            System.out.println("Enter 1 to proceed for next Transactio:");
            System.out.println("Enter 0 to end  Transaction:");
            int test = sc.nextInt();
            check = test;
        } while (check == 1);
    }
}

