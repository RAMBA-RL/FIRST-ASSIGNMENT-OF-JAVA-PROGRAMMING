package MARKS;

import java.util.Scanner;

public class Grading {

	
	public static void main(String[] args) {
		        Scanner b = new Scanner(System.in);
		                // Ask total number of students
		                System.out.print("Enter total number of students: ");
		                int totalStudents = b.nextInt();

		                int passes = 0;
		                int fails = 0;
		                int studentCount = 0;

		                while (studentCount < totalStudents) {
		                    System.out.print("Enter marks for student " + (studentCount + 1) + ": ");
		                    int mark = b.nextInt();
		                    if (mark >= 80) {
		                        System.out.println("  Grade: A");
		                    } else if (mark >= 70) {
		                        System.out.println("  Grade: B");
		                    } else if (mark >= 60) {
		                        System.out.println("  Grade: C");
		                    } else if (mark >= 50) {
		                        System.out.println("  Grade: D");
		                    } else {
		                        System.out.println("  Grade: F");
		                    }
		                    if (mark >= 50) {
		                        passes++;
		                    } else {
		                        fails++;
		                    }

		                    studentCount++;
		                }

		                System.out.println("\n======= CLASS SUMMARY========");
		                System.out.println("Total students: " + totalStudents);
		                System.out.println("Passed: " + passes);
		                System.out.println("Failed: " + fails);

		                double passRate = (passes * 100.0) / totalStudents;
		                System.out.println("Class pass rate: " + passRate + "%");

		                b.close();
		            }
		        }