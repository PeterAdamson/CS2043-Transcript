//Author Peter Adamson

package pja.assn2;

//houses the grade structure
public class Grade {

	//variable declarations
	private double numberGrade;
	private String letterGrade;
	private String courseID;
	private String creditHours;
	
	//constructor
	public Grade(String courseID, String creditHours, String grade)
	{
		this.courseID = courseID;
		this.creditHours = creditHours;
		letterGrade = grade;
		numberGrade = Registrar.calculateGrade(grade);
	}

	//constructor	
	public Grade(String courseID, String creditHours, double grade)
	{
		this.courseID = courseID;
		this.creditHours = creditHours;
		numberGrade = grade;
		letterGrade = Registrar.calculateGrade(grade);
	}
	
	//returns number grade
	public double getNumberGrade()
	{
		return numberGrade;
	}
	
	//returns letter grade
	public String getLetterGrade()
	{
		return letterGrade;
	}
	
	//returns course ID
	public String getCourseID()
	{
		return courseID;
	}
	
	//returns credit hours of a course
	public String getCreditHours()
	{
		return creditHours;
	}
}
