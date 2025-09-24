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

import java.util.Scanner;

public class ATMSimulation {
    public static void main(String[] args) {
        ATM atm = new ATM(0);

        int userPin = 1202;

        if (atm.authenticate(userPin)) {
            System.out.println("PIN Verified.");

            atm.deposit(10000); 
            atm.withdraw(3000); 

            System.out.println("Final Balance is: " + atm.checkBalance());
        } else {
            System.out.println("Incorrect PIN. Access Denied.");
        }
    }
}



