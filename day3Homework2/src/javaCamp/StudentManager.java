package javaCamp;

public class StudentManager extends UserManager {
	public static void addCourse(Course course) {
		System.out.println(course.getName() + " added to your list.");
	}
	
	public static void removeCourse(Course course) {
		System.out.println(course.getName() + " removed from your list.");
		
	}
	
	public static void takenCourse(Student student) {
		System.out.println("The course currently taken by " + student.getFirstName() + " " + student.getLastName() + " :");
		System.out.println(student.getTakenCourse());
	}

}
