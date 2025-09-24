/**GROUP MEMBERS NAME & REG NUMBER
RAMBA Rwibutso Leonore                    223011322
TUYISHIMIRE Vedaste                       223010552
CYEZAMUTIMA Emeraude                      223023054
NAMARA Jolly                              223015547
MPUMURE Esperance                         223013760
IRADUKUNDA Epiphanie                      223015618
IRASUBIZA Benyse                          223013344 
**/


package qn.eight;

public class ATM {
	    private double balance;
	    private final int PIN = 1202; 

	 
	    public ATM(double initialBalance) {
	        this.balance = initialBalance;
	    }

	    public boolean authenticate(int enteredPin) {
	        return enteredPin == PIN;
	    }

	    public double checkBalance() {
	        return balance;
	    }
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: " + amount);
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn: " + amount);
	        } else if (amount > balance) {
	            System.out.println("Insufficient balance.");
	        } else {
	            System.out.println("Invalid withdraw amount.");
	        }
	    }
}
	   