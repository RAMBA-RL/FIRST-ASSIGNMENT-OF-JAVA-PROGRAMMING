/**GROUP MEMBERS NAME & REG NUMBER
RAMBA Rwibutso Leonore                    223011322
TUYISHIMIRE Vedaste                       223010552
CYEZAMUTIMA Emeraude                      223023054
NAMARA Jolly                              223015547
MPUMURE Esperance                         223013760
IRADUKUNDA Epiphanie                      223015618
IRASUBIZA Benyse                          223013344

**/

package qn.three.multipleshapes;

import java.util.Scanner;

public class Testrectanglethree {

	
	public static void main(String[] args) {
		        Scanner rec = new Scanner(System.in);

		        Threerectangle[] rectangles = new  Threerectangle[3]; 

		        for (int i = 0; i < 3; i++) {
		            System.out.println("Enter Sides of Rectangle " + (i + 1));
		            System.out.print("Length: ");
		            int length = rec.nextInt();
		            System.out.print("Width: ");
		            int width = rec.nextInt();

		            rectangles[i] = new Threerectangle(length,width);
		        }

		        System.out.println("\nAreas of Rectangles:");
		        for (int i = 0; i < 3; i++) {
		            System.out.println("Rectangle " + (i + 1) + " Area: " + rectangles[i].calculateArea());
		        }

		        rec.close();
		    }


	}
