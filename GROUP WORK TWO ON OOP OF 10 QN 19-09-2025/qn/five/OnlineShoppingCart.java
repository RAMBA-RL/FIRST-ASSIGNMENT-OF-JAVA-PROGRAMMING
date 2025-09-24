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

public class OnlineShoppingCart {
	static class Product {
        private String productId;
        private String name;
        private double price;
        private int quantity;

        public Product(String productId, String name, double price, int quantity) {
            this.productId = productId;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }
        public double getCost() {
            return price * quantity;
        }

        public String getName() {
            return name;
        }
    }

}
