/**GROUP MEMBERS NAME & REG NUMBER
RAMBA Rwibutso Leonore                    223011322
TUYISHIMIRE Vedaste                       223010552
CYEZAMUTIMA Emeraude                      223023054
NAMARA Jolly                              223015547
MPUMURE Esperance                         223013760
IRADUKUNDA Epiphanie                      223015618
IRASUBIZA Benyse                          223013344 
**/

package qn.three;

public class Employee {
	    private String name;

	    public Employee(String name) {
	        this.name = name;
	    }

	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }

	    public double calculateSalary() {
	        return 0.0;
	    }
	}
	class FullTimeEmployee extends Employee {
	    private double baseSalary;

	    public FullTimeEmployee(String name, double baseSalary) {
	        super(name);
	        this.baseSalary = baseSalary;
	    }

	    public void setBaseSalary(double baseSalary) {
	        this.baseSalary = baseSalary;
	    }

	    @Override
	    public double calculateSalary() {
	        double allowance = 0.2 * baseSalary; 
	        return baseSalary + allowance;
	    }
	}

	class PartTimeEmployee extends Employee {
	    private int hoursWorked;
	    private double hourlyRate;

	    public PartTimeEmployee(String name, int hoursWorked, double hourlyRate) {
	        super(name);
	        this.hoursWorked = hoursWorked;
	        this.hourlyRate = hourlyRate;
	    }

	    // Setters for hoursWorked and hourlyRate
	    public void setHoursWorked(int hoursWorked) {
	        this.hoursWorked = hoursWorked;
	    }
	    public void setHourlyRate(double hourlyRate) {
	        this.hourlyRate = hourlyRate;
	    }

	    @Override
	    public double calculateSalary() {
	        return hoursWorked * hourlyRate;
	    }
	}



