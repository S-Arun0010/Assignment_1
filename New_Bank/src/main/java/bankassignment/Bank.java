package bankassignment;
import java.util.Scanner;
import java.util.logging.Logger;
public class Bank {
	private String Name;
    private long Acc_No;
    private int Balance;
    static Logger l= Logger.getLogger("com.api.jar");
    public Bank(String N, long A, int B) {
        Name = N;
        Acc_No = A;
        Balance = B;
    }
    public void Balance_Amount() {
    	l.info("Total Balance Amount :" + Balance + "Rs");
    }
    public void Deposit(int Deposit_Amount) {
    	l.info("The Deposited Amount is :" + Deposit_Amount + "Rs");
        Balance = Balance + Deposit_Amount;
    }
    public void Withdraw(int withdraw_Amount) {
        if (withdraw_Amount < Balance) {
        	l.info("Total Amount withdrawed :" + withdraw_Amount + "Rs");
            Balance = Balance - withdraw_Amount;
        } else {
        	l.info("Insufficient balance");
        }
    }
    public static void main(String[] args) {
        Bank a = new Bank("Arun", 123456789123456789L, 1000);
        l.info("Name :" + a.Name);
        l.info("Account Number :" + a.Acc_No);
        l.info("Current Balance :" + a.Balance);
        int check = 0;
        do {
        	l.info("Enter the mode of Transaction :");
            Scanner sc = new Scanner(System.in);
            String expression = sc.nextLine();
            switch (expression) {
                case "Deposit":
                	l.info("Enter the deposite Amount :");
                    int Deposit_Amount = sc.nextInt();
                    a.Deposit(Deposit_Amount);
                    break;
                case "Withdraw":
                	l.info("Enter the withdraw Amount :");
                    int withdraw_Amount = sc.nextInt();
                    a.Withdraw(withdraw_Amount);
                    break;
                case "Balance":
                    a.Balance_Amount();
                    break;
                default:
                	l.info("Enter the valid transaction");
            }
            l.info("Enter 1 to proceed for next Transactio:");
            l.info("Enter 0 to end  Transaction:");
            int test = sc.nextInt();
            check = test;
        } while (check == 1);
    }
}
