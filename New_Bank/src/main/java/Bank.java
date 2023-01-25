import java.util.Scanner;
public class Bank {
	private String Name;
    private long Acc_No;
    private int Balance;
    public Bank(String N, long A, int B) {
        Name = N;
        Acc_No = A;
        Balance = B;
    }
    public void Balance_Amount() {
        System.out.println("Total Balance Amount :" + Balance + "Rs");
    }
    public void Deposit(int Deposit_Amount) {
        System.out.println("The Deposited Amount is :" + Deposit_Amount + "Rs");
        Balance = Balance + Deposit_Amount;
    }
    public void Withdraw(int withdraw_Amount) {
        if (withdraw_Amount < Balance) {
            System.out.println("Total Amount withdrawed :" + withdraw_Amount + "Rs");
            Balance = Balance - withdraw_Amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
    public static void main(String[] args) {
        Bank a = new Bank("Arun", 123456789123456789L, 1000);
        System.out.println("Name :" + a.Name);
        System.out.println("Account Number :" + a.Acc_No);
        System.out.println("Current Balance :" + a.Balance);
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

