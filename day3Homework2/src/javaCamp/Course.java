package javaCamp;

public class Course {
	private int id;
	private String name;
	private String lecturer;
	private int percentageOfCompletion;
	
	public Course(int id,String name,String lecturer,int percantageOfCompletion) {
		this.id = id;
		this.name = name;
		this.lecturer = lecturer;
		this.percentageOfCompletion = percantageOfCompletion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLecturer() {
		return lecturer;
	}

	public void setLecturer(String lecturer) {
		this.lecturer = lecturer;
	}

	public int getPercentageOfCompletion() {
		return percentageOfCompletion;
	}

	public void setPercentageOfCompletion(int percentageOfCompletion) {
		this.percentageOfCompletion = percentageOfCompletion;
	}
	
	
	
}
