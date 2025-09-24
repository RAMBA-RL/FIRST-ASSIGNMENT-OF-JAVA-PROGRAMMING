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

public class EmployeeSalarySystem {
	    public static void main(String[] args) {
	       
	        FullTimeEmployee emp1 = new FullTimeEmployee("Benitha", 60000);
	        PartTimeEmployee emp2 = new PartTimeEmployee("Bugingo", 190,200);

	  
	        double salary1 = emp1.calculateSalary();
	        double salary2 = emp2.calculateSalary();

	     
	        System.out.println(emp1.getName() + " Salary: " + salary1);
	        if (salary1 > 60000) {
	            System.out.println(emp1.getName() + " is a High Earner.");
	        }

	        System.out.println(emp2.getName() + " Salary: " + salary2);
	        if (salary2 > 60000) {
	            System.out.println(emp2.getName() + " is a High Earner.");
	        }

	        double totalExpenditure = salary1 + salary2;
	        System.out.println("Total Salary Expenditure is: " + totalExpenditure);
	    }

	}


