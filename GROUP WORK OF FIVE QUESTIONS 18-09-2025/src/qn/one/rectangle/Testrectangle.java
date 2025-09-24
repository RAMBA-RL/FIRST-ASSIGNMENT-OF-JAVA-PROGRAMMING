package qn.one.rectangle;

import java.util.Scanner;

public class Testrectangle {
		    public static void main(String[] args) {
		        Scanner re= new Scanner(System.in);

		       
		        System.out.print("Enter length: ");
		        int length = re.nextInt();

		        System.out.print("Enter width: ");
		        int width = re.nextInt();

		        Rectangle rect = new Rectangle(length, width);

		        System.out.println("Area of rectangle: " + rect.calculateArea());

		        if (length == width) {
		            System.out.println("It is a square.");
		        } else {
		            System.out.println("It not a square.");
		        }

		        re.close();
		    }
		

	}
		
	


