package cisc181.lab_6;

public class CollegeCourse implements Comparable<CollegeCourse>{
	
	private String department; //department of the course
	private Integer courseNum; // course number
	private Integer sectionNum; // section number
	private int capacity; // maximum capacity
	
	//constructor
	public CollegeCourse(String department, int courseNum,int sectionNum,int capacity){
		this.department = department.toUpperCase();
		this.courseNum = courseNum;
		this.sectionNum = sectionNum;
		this.capacity = capacity;
	}
	
	//accessor for department
	public String getDepartment(){
		return department;
	}
	//accessor for course number
	public int getCourseNum(){
		return courseNum;
	}
	//accessor for capacity
	public int getCapacity(){
		return capacity;
	}
	//accessor for section number
	public int getSectionNum(){
		return sectionNum;
	}
	//to string method override
	public String toString(){
		return "" + department + "" + courseNum + "-" + sectionNum;
	}
	
	//two college courses are equal if they have the same department, course number, and section number
	public boolean equals(CollegeCourse c){
		return department.equals(c.department) && courseNum == c.getCourseNum() && sectionNum == c.getSectionNum();
	}

	//compare the department, then the course number, then the section number
	@Override
	public int compareTo(CollegeCourse c) {
		int value = 0;
		
		value = department.compareTo(c.getDepartment());
		if(value == 0){
			value = courseNum.compareTo(c.getCourseNum());
			
			if(value == 0){
				return sectionNum.compareTo(c.getSectionNum());
			}
			return value;
		}
		return value;
	}


}
