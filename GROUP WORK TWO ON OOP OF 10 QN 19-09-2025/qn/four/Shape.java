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

	abstract class Shape {
	    public abstract double area();
	}
	class Circle extends Shape {
	    private double radius;

	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    public void setRadius(double radius) {
	        this.radius = radius;
	    }

	    @Override
	    public double area() {
	        return Math.PI * radius * radius;
	    }
	}

	class Rectangle extends Shape {
	    private double length;
	    private double width;

	  
	    public Rectangle(double length, double width) {
	        this.length = length;
	        this.width = width;
	    }
	    public void setLength(double length) {
	        this.length = length;
	    }
	    public void setWidth(double width) {
	        this.width = width;
	    }

	    @Override
	    public double area() {
	        return length * width;
	    }
	}
	class Triangle extends Shape {
	    private double base;
	    private double height;

	    // Constructor
	    public Triangle(double base, double height) {
	        this.base = base;
	        this.height = height;
	    }
	    public void setBase(double base) {
	        this.base = base;
	    }
	    public void setHeight(double height) {
	        this.height = height;
	    }

	    public double area() {
	        return 0.5 * base * height;
	    }
	}

	


