//Author Peter Adamson

package pja.assn2;

import java.util.ArrayList;

//Transcript class to allow adding/removing grades of a student record.
public class Transcript {
	
	//variable declarations
	private int studentID;
	private int count;
	private double GPA;
	ArrayList<Grade> results = new ArrayList<Grade>();
	
	//constructor expects a student ID
	public Transcript(int studentID)
	{
		this.studentID = studentID;
		count = 0;
	}
	
	//Adds a letter grade to the transcript
	public void add(String courseID, String creditHours, String grade)
	{
		Grade gradeAssigned = new Grade(courseID, creditHours, grade);
		results.add(gradeAssigned);
		count += 1;
	}
	
	//adds a number grade from the transcript
	public void add(String courseID, String creditHours, double grade)
	{
		Grade gradeAssigned = new Grade(courseID, creditHours, grade);
		results.add(gradeAssigned);
		count += 1;
	}
	
	//removes a grade from the transcript
	public void remove(String courseID, String creditHours, String grade)
	{
		for(int i = 0; i < results.size(); i++)
		{
			Grade temp = results.get(i);
			if(temp.getLetterGrade().compareTo(grade) == 0 && temp.getCourseID().compareTo(courseID) == 0 && temp.getCreditHours().compareTo(creditHours) == 0)
			{
				results.remove(i);
				count -= 1;
				break;
			}
		}
	}
	
	//removes a grade from the transcript
	public void remove(String courseID, String creditHours, double grade)
	{
		Grade temp;
		for(int i = 0; i < results.size(); i++)
		{
			temp = results.get(i);
			if(temp.getNumberGrade() == grade && temp.getCourseID().compareTo(courseID) == 0 && temp.getCreditHours().compareTo(creditHours) == 0)
			{
				results.remove(i);
				count -= 1;
				break;
			}
		}
	}

	//calculates the GPA based on the UNB gpa calculation	
	public void calculateGPA()
	{	
		Grade temp;
		String ch;
		int creditHour;
		double gradePoint = 0;
		int creditHours = 0;
		
		for(int i = 0; i < results.size(); i++)
		{
			temp = results.get(i);
			ch = temp.getCreditHours();
			creditHour = Character.getNumericValue(ch.charAt(0));
			creditHours += creditHour;
			gradePoint += creditHour * temp.getNumberGrade();
		}
		
		GPA = gradePoint / creditHours;
	}
	
	//returns student ID
	public int getStudentID()
	{
		return studentID;
	}
	
	//returns a grade
	public Grade getGrade(int i)
	{
		return results.get(i);
	}
	
	//returns current count of grades added
	public int getCount()
	{
		return count;
	}
	
	//print structure for use in the driver
	public String toString()
	{
		System.out.println("Student " + studentID + ":");
		if(count > 0)
		{
			for(int i = 0; i < count; i++)
			{
				Grade current = results.get(i);
				System.out.println(current.getCourseID() + " " + current.getCreditHours() + " " + current.getNumberGrade() + " (" + current.getLetterGrade() + ")");
			}
			calculateGPA();
			System.out.printf("GPA: %.2f\n",GPA);
		}
		else
		{
			System.out.println("GPA: NaN");
		}
		return "done";
	}
}
