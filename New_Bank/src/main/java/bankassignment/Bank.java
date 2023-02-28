package bankassignment;
import java.util.Scanner;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
public class Bank {
	
	private String name;
    private long accountnumber;
    private int balance; 
    static PrintStream print = new PrintStream(new FileOutputStream(FileDescriptor.out));
    
    public Bank(String name, long accountnumber, int balance) {
        this.name = name;
        this.accountnumber = accountnumber;
        this.balance = balance;
    }
    public void balanceamount() {
    	 print.println("Total Balance Amount :" + balance + "Rs");
    }
    
    public void deposit(int depositamount) {
    	 balance = balance + depositamount;
    	 print.println("The Deposited Amount is :" + depositamount + "Rs");         
    }
    
    public void withdraw(int withdrawamount) {
        if (withdrawamount < balance) 
        {    
        	 balance = balance - withdrawamount;
        	 print.println("Total Amount withdrawed :" + withdrawamount + "Rs");

        } else {
        	 print.println("Insufficient balance");
        }
    }
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	Scanner s = new Scanner(System.in);
    	print.println("Enter the Name:");
    	String name = s.nextLine();
    	print.println("Enter the Account_Number:");
    	Long accnumber = sc.nextLong();
    	print.println("Enter the Current_Balance:");
    	int currentbalance = sc.nextInt();
    	
        Bank customer = new Bank(name,accnumber,currentbalance);
        print.println("Name :" + customer.name);
        print.println("Account Number :" + customer.accountnumber);
        print.println("Current Balance :" + customer.balance);
        
        int check = 0;
        do {
        	
        	print.println("Enter the mode of Transaction :");            
            String expressions = s.nextLine();
            switch (expressions) {
                case "Deposit":
                	 print.println("Enter the deposite Amount :");
                     int depositamount = sc.nextInt();
                     customer.deposit(depositamount);                    
                     break;
                case "Withdraw":
                	print.println("Enter the withdraw Amount :");
                    int withdrawamount = sc.nextInt();
                    customer.withdraw(withdrawamount);
                    break;
                case "Balance":
                	customer.balanceamount();
                    break;
                default:
                	 print.println("Enter the valid transaction");
            }
            print.println("Enter 1 to proceed for next Transaction:");
            print.println("Enter 0 to end  Transaction:");
            check = sc.nextInt();
        } while (check == 1);
            
        print.println("Thank You");
    }
}
