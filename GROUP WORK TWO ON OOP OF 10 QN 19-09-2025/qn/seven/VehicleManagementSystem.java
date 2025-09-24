/**GROUP MEMBERS NAME & REG NUMBER
RAMBA Rwibutso Leonore                    223011322
TUYISHIMIRE Vedaste                       223010552
CYEZAMUTIMA Emeraude                      223023054
NAMARA Jolly                              223015547
MPUMURE Esperance                         223013760
IRADUKUNDA Epiphanie                      223015618
IRASUBIZA Benyse                          223013344 
**/

package qn.seven;

public class VehicleManagementSystem {

	public static void main(String[] args) {
	
		Vehicle car1 = new Car("CAR001", 120, 15.5);
        Vehicle bike1 = new Bike("BIKE002", 90, 40.2);
        Vehicle truck1 = new Truck("TRUCK003", 80, 8.0, 12.0);

       
        Vehicle[] vehicles = { car1, bike1, truck1 };

       
        System.out.println("Vehicle Details:");
        System.out.println("----------------");
        for (Vehicle v : vehicles) {
            v.displayDetails();
            System.out.println("----------------");
        }
    }

	}


