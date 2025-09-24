/**GROUP MEMBERS NAME & REG NUMBER
RAMBA Rwibutso Leonore                    223011322
TUYISHIMIRE Vedaste                       223010552
CYEZAMUTIMA Emeraude                      223023054
NAMARA Jolly                              223015547
MPUMURE Esperance                         223013760
IRADUKUNDA Epiphanie                      223015618
IRASUBIZA Benyse                          223013344 
**/

package qn.four;

public class ShapeAreaCalculator {

	
	public static void main(String[] args) {
				        Shape circle = new Circle(7);
				        Shape rectangle = new Rectangle(6, 4);
				        Shape triangle = new Triangle(5, 8);

				        // Store shapes in an array
				        Shape[] shapes = {circle, rectangle, triangle};

				        double totalArea = 0.0;

				        // Loop to display each area and calculate total area
				        for (Shape shape : shapes) {
				            double area = shape.area();
				            System.out.println("Area: " + area);
				            totalArea += area;
				        }

				        System.out.println("Total Area of all shapes: " + totalArea);
				    }
				}
		