import java.util.*;
public class bank {
    String name;
    long accno;
    int balance;
    public Bank(String n, long a, int b) {
        name = n;
        accno = a;
        balance = b;
    }
    public void balanceamount() {
        logger.log("Total Balance Amount :" + balance + "Rs");
    }
    public void deposit(int depositamount) {
        logger.log("The Deposited Amount is :" + depositamount + "Rs");
        balance = balance + depositamount;
    }
    public void withdraw(int withdrawamount) {
        if (withdrawamount < balance) {
            logger.log("Total Amount withdrawed :" + withdrawamount + "Rs");
            balance = balance - withdrawamount;
        } else {
            logger.log("Insufficient balance");
        }
    }
    public static void main(String[] args) {
        bank a = new bank("Arun", 123456789123456789L, 1000);
        logger.log("Name :" + a.name);
       logger.log("Account Number :" + a.accno);
        logger.log("Current Balance :" + a.balance);
        int check = 0;
        do {
            logger.log("Enter the mode of Transaction :");
            Scanner sc = new Scanner(System.in);
            String expression = sc.nextLine();
            switch (expression) {
                case "Deposit":
                    System.out.println("Enter the deposite Amount :");
                    int depositamount = sc.nextInt();
                    a.deposit(depositamount);
                    break;
                case "Withdraw":
                    logger.log("Enter the withdraw Amount :");
                    int withdrawamount = sc.nextInt();
                    a.withdraw(withdrawamount);
                    break;
                case "Balance":
                    a.balanceamount();
                    break;
                default:
                    logger.log("Enter the valid transaction");
            }
            logger.log("Enter 1 to proceed for next Transactio:");
           logger.log("Enter 0 to end  Transaction:");
            int test = sc.nextInt();
            check = test;
        } while (check == 1);
    }
}

