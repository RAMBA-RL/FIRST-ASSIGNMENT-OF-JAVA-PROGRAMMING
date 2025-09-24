package qn.two.circle;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		        Scanner ci = new Scanner(System.in);

		        System.out.print("Enter the radius of the circle: ");
		        double radius = ci.nextDouble();

		        Circle cir = new Circle(radius);

		        System.out.println("\nChoose an option among two:");
		        System.out.println("1. Find Area");
		        System.out.println("2. Find Circumference");

		        int choice = ci.nextInt();

		        switch (choice) {
		            case 1:
		                System.out.println("Area of the circle: " + cir.calculateArea());
		                break;
		            case 2:
		                System.out.println("Circumference of the circle: " + cir.calculateCircumference());
		                break;
		            default:
		                System.out.println("Invalid choice. Please enter 1 or 2.");
		        }

		        ci.close();
		    }
}