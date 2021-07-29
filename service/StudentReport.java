package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;

public class StudentReport{
	public String findGrade(Student studentObject)
	{
		int[] marks=studentObject.getMarks();
		int Marks_Sum = 0;
		for(int i =0;i<marks.length;i++)
		{
			// if any marks is less than 35 we directly print F or else find the sum
			if(marks[i]<35)
			{
				return "F";
			}
			else
			{
				Marks_Sum = Marks_Sum + marks[i];
			}
		}
		
		//checking the sum and giving the grade accordingly
		if(Marks_Sum <= 150)
		{
			return "D";
		}
		else if(Marks_Sum >150 && Marks_Sum <=200)
		{
			return "C";
		}
		else if(Marks_Sum >200 && Marks_Sum <=250)
		{
			return "B";
		}
		else if(Marks_Sum >250 && Marks_Sum <=300)
		{
			return "A";
		}
		else
		{
			return "D";
		}
	}
		
		public String valide(Student studentObejct)
			throws NullStudentException, NullNameException, NullMarksArrayException{
			if(studentObejct == null)
			{
				throw new NullStudentException();
			}
			else {
				if (studentObejct.getName() == null)
					throw new NullNameException();
				if (studentObejct.getMarks() == null)
					throw new NullMarksArrayException();
				else
				{
					return findGrade(studentObejct);
				}
		}
	}		
}