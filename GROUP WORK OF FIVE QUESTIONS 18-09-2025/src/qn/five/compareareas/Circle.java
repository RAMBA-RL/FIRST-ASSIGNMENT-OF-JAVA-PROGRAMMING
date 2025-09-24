package qn.five.compareareas;

public class Circle {

	public double radius;

	public Circle(double circleRadius) {
		  this.radius = circleRadius;
	}

	   public double calculateArea() {
	        return Math.PI * radius * radius;
	        
	    }
	}
