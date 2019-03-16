
package BankAcc;

import java.util.*;
public class BankAcc {
    
public String accountNumber;
public String Passcode ;
public double balance;
public  double[] transactionsSummary;
public  int numOfTransactions=0;

    public BankAcc(String accountNumber, String Passcode, double balance) {
        this.accountNumber = accountNumber;
        this.Passcode = Passcode;
        this.balance = balance;
    }

   

   

   
 /**public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
*/
    public double[] getTransactionsSummary() {
        return transactionsSummary;
    }


void deposit (double x)
	{
		balance = balance + x;
		
	}

boolean login (String n,String p)
	{
		if (n.equals(accountNumber)&&p.equals(Passcode))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

boolean withdraw (double x)
	{
		if (x>balance)
		{
			return false;
		}
		else
		{
			balance = balance - x;
			return true;
		}
		
	}
    public String displayBalance (){
        return Double.toString(balance);
    }
}
