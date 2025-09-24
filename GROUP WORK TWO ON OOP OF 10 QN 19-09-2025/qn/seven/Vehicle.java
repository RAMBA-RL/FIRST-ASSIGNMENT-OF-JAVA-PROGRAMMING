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

public class Vehicle {
	    protected String registrationNumber;
	    protected int speed;

	    public Vehicle(String registrationNumber, int speed) {
	        this.registrationNumber = registrationNumber;
	        this.speed = speed;
	    }

	   
	    public void displayDetails() {
	        System.out.println("Registration Number: " + registrationNumber);
	        System.out.println("Speed: " + speed + " km/h");
	    }
	}
	class Car extends Vehicle {
	    private double fuelEfficiency; 

	    public Car(String registrationNumber, int speed, double fuelEfficiency) {
	        super(registrationNumber, speed);
	        this.fuelEfficiency = fuelEfficiency;
	    }

	    @Override
	    public void displayDetails() {
	        super.displayDetails();
	        System.out.println("Type: Car");
	        System.out.println("Fuel Efficiency: " + fuelEfficiency + " km/l");
	    }
	}

	class Bike extends Vehicle {
	    private double fuelEfficiency; 

	    public Bike(String registrationNumber, int speed, double fuelEfficiency) {
	        super(registrationNumber, speed);
	        this.fuelEfficiency = fuelEfficiency;
	    }

	    @Override
	    public void displayDetails() {
	        super.displayDetails();
	        System.out.println("Type: Bike");
	        System.out.println("Fuel Efficiency: " + fuelEfficiency + " km/l");
	    }
	}

	class Truck extends Vehicle {
	    private double load; 
	    private double capacity; 

	    public Truck(String registrationNumber, int speed, double load, double capacity) {
	        super(registrationNumber, speed);
	        this.load = load;
	        this.capacity = capacity;
	    }

	    @Override
	    public void displayDetails() {
	        super.displayDetails();
	        System.out.println("Type: Truck");
	        System.out.println("Load: " + load + " tons");
	        System.out.println("Capacity: " + capacity + " tons");
	    }
	}

	