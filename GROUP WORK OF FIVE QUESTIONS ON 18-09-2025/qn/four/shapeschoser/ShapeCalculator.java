/**GROUP MEMBERS NAME & REG NUMBER
RAMBA Rwibutso Leonore                    223011322
TUYISHIMIRE Vedaste                       223010552
CYEZAMUTIMA Emeraude                      223023054
NAMARA Jolly                              223015547
MPUMURE Esperance                         223013760
IRADUKUNDA Epiphanie                      223015618
IRASUBIZA Benyse                          223013344

**/

package qn.four.shapeschoser;

import java.util.Scanner;

public class ShapeCalculator {
		    public static void main(String[] args) {
		        Scanner sh = new Scanner(System.in);

		        System.out.println("Choose a shape to calculate area:");
		        System.out.println("1. Rectangle");
		        System.out.println("2. Circle");
		        System.out.print("Enter your choice (1 or 2): ");
		        int choice = sh.nextInt();

		        switch (choice) {
		            case 1:
	
		                System.out.print("Enter length: ");
		                double length = sh.nextDouble();
		                System.out.print("Enter width: ");
		                double width = sh.nextDouble();
		                Rectangle rectangle = new Rectangle(length, width);
		                System.out.println("Area of Rectangle: " + rectangle.calculateArea());
		                break;
		            case 2:
		                // Circle
		                System.out.print("Enter radius: ");
		                double radius = sh.nextDouble();
		                Circle circle = new Circle(radius);
		                System.out.println("Area of Circle: " + circle.calculateArea());
		                break;
		            default:
		                System.out.println("Invalid choice! Please select 1 or 2.");
		        }

		        sh.close();
		    }
		
}
