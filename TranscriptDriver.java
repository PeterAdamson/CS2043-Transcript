//Author Peter Adamson

package pja.assn2;

/*drives the transcript, registrar, and grade classes.  This program is designed to provide a way to add and remove grades on a transcript, which is created with a student number.  The transcript class is able to calculate a GPA based on the grades added/removed.  The transcript class can take grades as either a letter or a number, and will create an instance of the grade class based on that grade.  The grade class will automatically use the registrar class to calculate a nuber grade based on a letter grade or a letter grade based on a number grade.*/
public class TranscriptDriver {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Transcript t1 = new Transcript(8510804);
		t1.add("CS1003", "4CH", "B");
		t1.add("CS2033", "4CH", "A");
		t1.add("ECE2213", "4CH", 3.3);
		t1.add("ECON1001", "3CH", 2.0);
		String test = t1.toString();
		Transcript t2 = new Transcript(8510805);
		test = t2.toString();
	}
}
