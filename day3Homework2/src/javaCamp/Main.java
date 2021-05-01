package javaCamp;


public class Main {
	public static void main(String[] args) {
		
		Course course1 = new Course(1240541, "Introduction to Programming Course", "Engin Demiroğ", 0);
		Course course2 = new Course(1235979, "C# + Angular Course", "Engin Demiroğ", 100);
		Course course3 = new Course(1332369, "Java+React Course", "Engin Demiroğ", 32);
		
		Course[] courses = {course1,course2,course3};
		
		System.out.println("Courses");
		System.out.println("-------------------------------------------------------------------------");
		for(Course course : courses) {
			System.out.println(course.getName());
		}
		
		System.out.println("-------------------------------------------------------------------------");
		Instructor instructor = new Instructor();
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setGivenCourse("Java+React Course");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.changePassword(instructor);
		instructorManager.givenCourse(instructor);
		
		System.out.println("-------------------------------------------------------------------------");
		Student student = new Student();
		student.setFirstName("Elif");
		student.setLastName("Bulut");
		
		StudentManager studentManager = new StudentManager();
		studentManager.addCourse(course2);
		studentManager.register(student);
		studentManager.checkAccount(student);
		
		
		
		
		
	}

}
