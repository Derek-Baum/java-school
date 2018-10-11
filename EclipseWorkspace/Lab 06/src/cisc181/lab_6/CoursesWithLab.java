package cisc181.lab_6;

public class CoursesWithLab extends CollegeCourse{

	public static final int LAB_SESSION_CAPACITY = 20; // static capacity for all labs
	
	private CollegeCourse[] labSessions; // array containing lab sessions
	
	// constructor, determines how many lab sessions there are and allocates space for the array
	public CoursesWithLab(String department, int courseNum, int sectionNum, int capacity) {
		super(department, courseNum, sectionNum, capacity);
		int numLabs = capacity/LAB_SESSION_CAPACITY + (capacity % LAB_SESSION_CAPACITY == 0 ? 0 : 1);
		
		labSessions = new CollegeCourse[numLabs];
		for(int i = 0; i < numLabs; i++){
			labSessions[i] = new CollegeCourse(department,courseNum,100+i,LAB_SESSION_CAPACITY);
		}
	}
	// accessor method for the labSessions array
	public CollegeCourse[] getLabSessions(){
		return labSessions;
	}
	// toString method override, properly indents lab sessions
	public String toString(){
		String output = super.toString();
		for(CollegeCourse c : labSessions){
			output+="\n\t";
			output+=c.toString();
		}
		return output;
	}
	
	
	
}
