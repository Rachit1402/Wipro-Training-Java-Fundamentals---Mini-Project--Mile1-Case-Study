package com.mile1.service;
import com.mile1.bean.Student;
public class StudentService {
	public int findNumberofNullMarks(Student data[])
	{
		
		//checking number of students with null marks or null name or null objects in the array
		int count_null_marks =0;
		for(int i=0;i<data.length;i++)
		{
			try {
				data[i].getMarks();
			}
			catch(Exception e)
			{
				count_null_marks++;
			}
		}
		return count_null_marks;
	}
	
	public int findNumberofNullNames(Student data[])
	{
		int count_null_name=0;
		for(int i=0;i<data.length;i++)
		{
			try
			{
				data[i].getName();
			}
			catch(Exception e)
			{
				count_null_name++;
			}
		}
		return count_null_name;
	}
	
	public int findNumberofNullObjects(Student data[])
	{
		int count_null_objects=0;
		for(int i=0;i<data.length;i++)
		{
			if(data[i] == null)
			{
				count_null_objects++;
			}
		}
		return count_null_objects;
	}

}
