package qn.four.shapeschoser;

public class Circle {
	    public double radius;
	    public Circle(double radius) {
	        this.radius = radius;
	    }
	    public double calculateArea() {
	        return Math.PI * radius * radius;
	    }
	}