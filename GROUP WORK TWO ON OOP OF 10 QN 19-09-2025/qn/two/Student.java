/**GROUP MEMBERS NAME & REG NUMBER
RAMBA Rwibutso Leonore                    223011322
TUYISHIMIRE Vedaste                       223010552
CYEZAMUTIMA Emeraude                      223023054
NAMARA Jolly                              223015547
MPUMURE Esperance                         223013760
IRADUKUNDA Epiphanie                      223015618
IRASUBIZA Benyse                          223013344 
**/


package qn.two;

public class Student {
	    private int id;
	    private String Fname;
	    private String Lname;
	    private int[] marks = new int[3];

	    public Student(int id, String Fname,String Lname, int[] marks) {
	        this.id = id;
	        this.Fname = Fname;
	        this.Lname = Lname;
	        for (int i = 0; i < 3; i++) {
	            this.marks[i] = marks[i];
	        }
	    }

	    public void setId(int id) { 
	    	this.id = id; 
	    	}
	    public void setFName(String name) {
	    	this.Fname = Fname; 
	    	}
	    public void setLName(String name) {
	    	this.Lname = Lname; 
	    	}
	    public void setMarks(int[] marks) {
	        for (int i = 0; i < 3; i++) {
	            this.marks[i] = marks[i];
	        }
	    }

	    public int getId(){
	     return id; }
	    public String getFName(){
	    	return Fname; }
	    public String getLName(){
	    	return Lname; }
	    public int[] getMarks() {
	    	return marks; }

	    public double computeAverage() {
	        int sum = 0;
	        for (int i = 0; i < 3; i++) sum += marks[i];
	        return sum / 3;
	    }

	    public String getGrade() {
	        double avg = computeAverage();
	        if (avg >= 80) return "A";
	        else if (avg >= 60) return "B";
	        else if (avg >= 40) return "C";
	        else return "Fail";
	    }
	}


