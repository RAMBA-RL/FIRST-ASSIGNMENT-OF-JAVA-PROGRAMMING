/**GROUP MEMBERS NAME & REG NUMBER
RAMBA Rwibutso Leonore                    223011322
TUYISHIMIRE Vedaste                       223010552
CYEZAMUTIMA Emeraude                      223023054
NAMARA Jolly                              223015547
MPUMURE Esperance                         223013760
IRADUKUNDA Epiphanie                      223015618
IRASUBIZA Benyse                          223013344 
**/

package qn.one;

public class BankAccount {
	    private String accountNumber;
	    private String holderFName;
	    private String holderLName;
	    private double balance;

	    public BankAccount(String accountNumber, String holderFName, String holderLName, double initialBalance) {
	        this.accountNumber = accountNumber;
	        this.holderFName = holderFName;
	        this.holderLName = holderLName;
	        this.balance = initialBalance;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println(amount + " deposited into " + holderFName + " " + holderLName + "'s account. New balance: " + balance);
	            checkLowBalance();
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }
	    public void withdraw(double amount) {
	        if (amount > balance) {
	            System.out.println("Insufficient Funds");
	        } else if (amount <= 0) {
	            System.out.println("Invalid withdraw amount.");
	        } else {
	            balance -= amount;
	            System.out.println(amount + " withdrawn from " + holderFName + " " + holderLName +"'s account. New balance: " + balance);
	            checkLowBalance();
	        }
	    }

	    private void checkLowBalance() {
	        if (balance < 1000) {
	            System.out.println(" You have a low Balance");
	        }
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void displayAccount() {
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Holder First Name: " + holderFName);
	        System.out.println("Holder Last Name: " + holderLName);
	        System.out.println("Balance: " + balance);
	    }
	}






