interface OnlineCourse
{
	void getDetails();
}

class DataStructure implements OnlineCourse
{
	public void getDetails()
	{
		System.out.println("Oldest");
	}
}

class Java implements OnlineCourse
{
	public void getDetails()
	{
		System.out.println("widely used");
	}
}


class Python implements OnlineCourse
{
	public void getDetails()
	{
		System.out.println("Emerging");
	}
}

class CourseFactory
{
	public OnlineCourse chooseCourse(String str)
	{
		if(str.equals("Mostly used"))
			return new Java();
		
		else if(str.equals("Machine Learning"))
			return new Python();
		
		else
			return new DataStructure();		
	}
}

public class OnlineCourseMain
{
	public static void main (String [] args)
	{
		CourseFactory cf= new CourseFactory();
		OnlineCourse obj=cf.chooseCourse ("Mostly used");	
		obj.getDetails();
	}

}


/*public class OnlineCourseMain
{
	public static void main (String [] args)
	{
		
		OnlineCourse obj= new Python();
		System.out.println(obj.getDetails()); 
	}

}*/
