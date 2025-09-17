package ClassAttendanceTracker;

import java.util.Scanner;

public class Attendance {

	public static void main(String[] args) {
	
		        Scanner b = new Scanner(System.in);

		        // Ask total number of students in class
		        System.out.print("Enter total number of students in the class: ");
		        int classSize = b.nextInt();

		        // Ask total number of days you want to record attendance
		        System.out.print("Enter number of days to record attendance: ");
		        int totalDays = b.nextInt();

		        int count = 0;
		        int Attendance = 0;

		        int[] attendance = new int[totalDays];

		        // Loop through each day
		        while (count < totalDays) {
		            System.out.print("Enter number of students present on day " + (count + 1) + ": ");
		            int present = b.nextInt();

		            attendance[count] = present;
		            Attendance += present;

		            count++;
		        }

		        // Print attendance list
		        System.out.println("\n======== ATTENDANCE LIST ========");
		        for (int i = 0; i < totalDays; i++) {
		            System.out.println("Day " + (i + 1) + " -> " + attendance[i] + " students present");
		        }

		        // Calculate and print average attendance
		        double average = (double) Attendance / totalDays;
		        System.out.println("\nAverage attendance per day: " + average);

		        b.close();
		    }
		
	}

