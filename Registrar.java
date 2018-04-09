//Author Peter Adamson

package pja.assn2;

//Grade conversion class
public class Registrar {
	
	//calulcates a number grade based on a letter grade using UNB system
	public static double calculateGrade(String grade)
	{
		if(grade.compareTo("A+") == 0)
		{
			return 4.3;
		}
		else if(grade.compareTo("A") == 0)
		{
			return 4.0;
		}
		else if(grade.compareTo("A-") == 0)
		{
			return 3.7;
		}
		else if(grade.compareTo("B+") == 0)
		{
			return 3.3;
		}
		else if(grade.compareTo("B") == 0)
		{
			return 3.0;
		}
		else if(grade.compareTo("B-") == 0)
		{
			return 2.7;
		}
		else if(grade.compareTo("C+") == 0)
		{
			return 2.3;
		}
		else if(grade.compareTo("C") == 0)
		{
			return 2.0;
		}
		else if(grade.compareTo("D") == 0)
		{
			return 1.0;
		}
		else
		{
			return 0.0;
		}
	}
	
	//calculates a letter grade based on a number grade using the UNB system
	public static String calculateGrade(double grade)
	{		
		if(grade >= 4.3)
		{
			return "A+";
		}
		else if(grade >= 4.0)
		{
			return "A";
		}
		else if(grade >= 3.7)
		{
			return "A-";
		}
		else if(grade >= 3.3)
		{
			return "B+";
		}
		else if(grade >= 3.0)
		{
			return "B";
		}
		else if(grade >= 2.7)
		{
			return "B-";
		}
		else if(grade >= 2.3)
		{
			return "C+";
		}
		else if(grade >= 2.0)
		{
			return "C";
		}
		else if(grade >= 1.0)
		{
			return "D";
		}
		else
		{
			return "F";
		}
	}
	
}
