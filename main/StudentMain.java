package com.mile1.main;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;
import com.mile1.bean.Student;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullStudentException;
import com.mile1.main.StudentMain;

public class StudentMain{
	//for a 5 data set of inputs
	static Student data[] = new Student[6];
	static {
		for(int i=0;i<data.length;i++)
		{
			data[i] = new Student();
		}
		data[0] = new Student("Sekar", new int[] {99,98,97});
		data[1] = new Student("Shekhar", new int[] {11,22,33});
		data[2] = new Student("Ravi", new int[] {23,97,67});
		data[3] = null;
		data[4] = new Student(null, new int[] {56,76,54});
		data[5] = new Student("Jay", null);
	}
	
	public static void main(String args[]) throws NullStudentException, NullMarksArrayException
	{
		StudentReport studentReport= new StudentReport();
		String x;
		
		System.out.println("GRADE CALCULATION");
		
		for(int i=0;i<data.length;i++)
		{
			try {
				x=studentReport.valide(data[i]);
				
			}
			catch(NullNameException e)
			{
				x="NullNameException occured";
			}
			catch(NullMarksArrayException e)
			{
				x="NullMarksArrayException occured";
			}
			catch(NullStudentException e)
			{
				x="NullStudentException occured";
			}
			System.out.println("GRADE: "+ x);
		}
		
		
		StudentService studentService = new StudentService();
		System.out.println("Number of Objects with Marks array as null: " + studentService.findNumberofNullMarks(data));
		System.out.println("Number of Objects with Name as null: " + studentService.findNumberofNullNames(data));
		System.out.println("Number of Objects that are entirely null: " + studentService.findNumberofNullObjects(data));
	}
}
