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

public class BankTest {

	    public static void main(String[] args) {
	      
	        BankAccount account1 = new BankAccount("12001", "Ange", "Ineza",0);
	        BankAccount account2 = new BankAccount("12003", "Boy","Haguma", 0);

	        account1.deposit(5000);

	        account1.withdraw(2000);
	        
	        account1.withdraw(2500);

	     
	        System.out.println("\nFinal Balances:");
	        System.out.print("Account 1: ");
	        account1.displayAccount();

	        System.out.print("\nAccount 2: ");
	        account2.displayAccount();
	    }
	}
		









	


