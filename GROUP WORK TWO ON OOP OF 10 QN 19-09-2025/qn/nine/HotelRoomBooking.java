/**GROUP MEMBERS NAME & REG NUMBER
RAMBA Rwibutso Leonore                    223011322
TUYISHIMIRE Vedaste                       223010552
CYEZAMUTIMA Emeraude                      223023054
NAMARA Jolly                              223015547
MPUMURE Esperance                         223013760
IRADUKUNDA Epiphanie                      223015618
IRASUBIZA Benyse                          223013344 
**/

package qn.nine;

public class HotelRoomBooking {

	
	public static void main(String[] args) {
        Room standard = new Room(27, "Standard", 50.0);
        Room deluxe = new Room(89, "Deluxe", 100.0);
        Room suite = new Room(30, "Suite", 200.0);

        int nightsStayed = 6;
        double totalBill = deluxe.calculateCost(nightsStayed);
        System.out.println("Room Type: " + deluxe.getType());
        System.out.println("Room Number: " + deluxe.getRoomNumber());
        System.out.println("Price per Night: $" + deluxe.getPrice());
        System.out.println("Nights Stayed: " + nightsStayed);
        System.out.println("Total Bill: $" + totalBill);
    }
}
	
