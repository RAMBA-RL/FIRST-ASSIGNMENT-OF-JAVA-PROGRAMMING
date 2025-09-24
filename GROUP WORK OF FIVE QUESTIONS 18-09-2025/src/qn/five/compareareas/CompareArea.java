package qn.five.compareareas;

import java.util.Scanner;

public class CompareArea {


	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter the length of the rectangle: ");
		        double rectLength = sc.nextDouble();
		        System.out.print("Enter the width of the rectangle: ");
		        double rectWidth = sc.nextDouble();
		        Rectangle rectangle = new Rectangle(rectLength, rectWidth);

		        // Input for circle
		        System.out.print("Enter the radius of the circle: ");
		        double circleRadius = sc.nextDouble();
		        Circle circle = new Circle(circleRadius);


		        // Calculate areas
		        double rectArea = rectangle.calculateArea();
		        double circleArea = circle.calculateArea();

		        // Compare and print result
		        if (rectArea > circleArea) {
		            System.out.println("Rectangle has a larger area (" + rectArea + ") than the circle (" + circleArea + ").");
		        } else if (circleArea > rectArea) {
		            System.out.println("Circle has a larger area (" + circleArea + ") than the rectangle (" + rectArea + ").");
		        } else {
		            System.out.println("Both shapes have the same area (" + rectArea + ").");
		        }

		        sc.close();
		    }
		
	}


