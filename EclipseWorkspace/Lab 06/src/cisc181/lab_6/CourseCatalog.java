package cisc181.lab_6;

import java.util.ArrayList;
import java.util.Collections;

public class CourseCatalog {
	
	private ArrayList<CollegeCourse> courses; // list of courses
	
	
	//constructor allocates space for arraylist
	public CourseCatalog(){
		courses = new ArrayList<CollegeCourse>();
	}
	
	//returns true if CollegeCourse c is contained within the courses arraylist
	private boolean courseExists(CollegeCourse c){
		//contains method wasn't working for whatever reason...
		for(CollegeCourse course : courses){
			if(c.equals(course))
				return true;
		}
		return false;
	}
	
	
	//accessor method for the courses arraylist
	public ArrayList<CollegeCourse> getAllCourses(){
		return courses;
	}
	
	//adds a course only if it does not exist within
	// the arraylist and then sorts the catalog appropriately
	//returns true if it added a course, false if it did not
	public boolean addCourse(CollegeCourse c){
		if(courseExists(c))
			return false;
		courses.add(c);
		Collections.sort(courses);
		return true;
	}
	//removes course  only if it exists
	// returns boolean to determine if it removed a course or not
	public boolean removeCourse(CollegeCourse c){
		if(!courseExists(c))
			return false;
		
		courses.remove(c);
		return true;
	}
	
	//prints all courses in the catalog
	public void printCourseCatalog(){
		for(CollegeCourse c : courses){
			System.out.println(c);
		}
	}
	

}
