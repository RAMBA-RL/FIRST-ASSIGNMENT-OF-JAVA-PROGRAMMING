/**GROUP MEMBERS NAME & REG NUMBER
RAMBA Rwibutso Leonore                    223011322
TUYISHIMIRE Vedaste                       223010552
CYEZAMUTIMA Emeraude                      223023054
NAMARA Jolly                              223015547
MPUMURE Esperance                         223013760
IRADUKUNDA Epiphanie                      223015618
IRASUBIZA Benyse                          223013344 
**/

package qn.five;

import qn.five.OnlineShoppingCart.Product;

public class Online {

	public static void main(String[] args) {
	        Product[] cart = new Product[3];
	        cart[0] = new Product("P101", "Laptop", 40000, 1);
	        cart[1] = new Product("P102", "Mouse", 1000, 2);
	        cart[2] = new Product("P103", "Keyboard", 3000, 1);

	        double total = 0;
	        for (Product p : cart) {
	            total += p.getCost();
	        }

	        boolean discountApplied = false;
	        double finalTotal = total;

	        if (total > 10000) {
	            finalTotal = total * 0.9; 
	            discountApplied = true;
	        }

	        System.out.printf("Total bill: %.2f%n", finalTotal);
	        if (discountApplied) {
	            System.out.println("A 10% discount was applied.");
	        } else {
	            System.out.println("No discount was applied.");
	        }
	 
	}

}
