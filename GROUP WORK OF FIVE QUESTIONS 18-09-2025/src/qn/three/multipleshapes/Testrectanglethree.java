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
