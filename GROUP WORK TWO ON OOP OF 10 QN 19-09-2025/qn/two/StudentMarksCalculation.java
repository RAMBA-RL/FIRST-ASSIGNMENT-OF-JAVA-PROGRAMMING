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

public class StudentMarksCalculation {
	    public static void main(String[] args) {
	        Student s1 = new Student(1, "Ange","Mukunzi", new int[]{85, 78, 90});
	        Student s2 = new Student(2, "Billy","Mugisha", new int[]{58, 65, 62});
	        Student s3 = new Student(3, "Godfrey","Gabiro", new int[]{35, 40, 38});

	        Student[] students = {s1, s2, s3};
	        double highestAverage = 0.0;

	        for (Student s : students) {
	            System.out.println("ID: " + s.getId() + ", Name: " + s.getFName() +   s.getLName()+
	                ", Average: " + s.computeAverage() + ", Grade: " + s.getGrade());
	            if (s.computeAverage() > highestAverage) {
	                highestAverage = s.computeAverage();
	            }
	        }

	        System.out.println("Highest average marks among the students: " + highestAverage);
	    }
	}