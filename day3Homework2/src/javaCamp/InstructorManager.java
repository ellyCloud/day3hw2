package javaCamp;

public class InstructorManager extends UserManager {
	public static void givenCourse(Instructor instructor) {
		System.out.println("The course currently given by " + instructor.getFirstName() + " " + instructor.getLastName() + " :");
		System.out.println(instructor.getGivenCourse());
	}
	

}
