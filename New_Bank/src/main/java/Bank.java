import java.util.*;
public class Bank {
    String name;
    long acc_no;
    int balance;
    public Bank(String N, long A, int B) {
        name = N;
        acc_no = A;
        balance = B;
    }
    public void Balance_Amount() {
        System.out.println("Total Balance Amount :" + balance + "Rs");
    }
    public void Deposit(int Deposit_Amount) {
        System.out.println("The Deposited Amount is :" + Deposit_Amount + "Rs");
        balance = balance + Deposit_Amount;
    }
    public void Withdraw(int withdraw_Amount) {
        if (withdraw_Amount < balance) {
            System.out.println("Total Amount withdrawed :" + withdraw_Amount + "Rs");
            balance = balance - withdraw_Amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
    public static void main(String[] args) {
        Bank a = new Bank("Arun", 123456789123456789L, 1000);
        System.out.println("Name :" + a.name);
        System.out.println("Account Number :" + a.acc_no);
        System.out.println("Current Balance :" + a.balance);
        int check = 0;
        do {
            System.out.println("Enter the mode of Transaction :");
            Scanner sc = new Scanner(System.in);
            String expression = sc.nextLine();
            switch (expression) {
                case "Deposit":
                    System.out.println("Enter the deposite Amount :");
                    int Deposit_Amount = sc.nextInt();
                    a.Deposit(Deposit_Amount);
                    break;
                case "Withdraw":
                    System.out.println("Enter the withdraw Amount :");
                    int withdraw_Amount = sc.nextInt();
                    a.Withdraw(withdraw_Amount);
                    break;
                case "Balance":
                    a.Balance_Amount();
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

