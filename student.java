//Q take student subject marks ,calculate total matrks,calculate percentage, calculate grade

class Marks
{
public static void main(String args[])
{
	int sub1=63;
	int sub2=98;
	int sub3=97;
	int total_marks=sub1+sub2+sub3;
	double percentage=(double)(total_marks/300)*100;
	System.out.println(percentage);
	if(sub1<35)
	{
		System.out.println("student got fail");
	}
	else if(sub2<35)
	{
		System.out.println("student got fail");
	}
	else if(sub3<35)
	{
		System.out.println("student got fail");
	}
	else if(percentage<35)
	{
		System.out.println("student got fail");
	}
	else if(percentage<50)
	{
		System.out.println("total marks of the student is "+total_marks);
		System.out.println("percentage of student is "+ percentage+"%");
		System.out.println("student got C grade");
	}
	else if(percentage<60)
	{
		System.out.println("total marks of the student is "+total_marks);
		System.out.println("percentage of student is "+ percentage+"%");
		System.out.println("student got B+ grade");
	}
	else if(percentage<70)
	{
		System.out.println("total marks of the student is "+total_marks);
		System.out.println("percentage of student is "+ percentage+"%");
		System.out.println("student got B grade");
	}
	else if(percentage<80)
	{
		System.out.println("total marks of the student is "+total_marks);
		System.out.println("percentage of student is "+ percentage+"%");
		System.out.println("student got A grade");
	}
	else if(percentage<90)
	{
		System.out.println("total marks of the student is "+total_marks);
		System.out.println("percentage of student is "+ percentage+"%");
		System.out.println("student got A+ grade");
	}
	else if(percentage<100)
	{
		System.out.println("total marks of the student is "+total_marks);
		System.out.println("percentage of student is "+ percentage+"%");
		System.out.println("student got O ");
	}
	else
	{
		System.out.println("invalid marks");
	}
}
}

//--------METHOD 2-------------------

class Marks2
{
public static void main(String args[])
{
	int sub1=63;
	int sub2=98;
	int sub3=97;
	int total_marks=sub1+sub2+sub3;
	int percentage=(total_marks/3);
	if(sub1<35||sub2<35||sub3<35)
	{
		System.out.println("student got fail");
	}
	else if(percentage<35)
	{
		System.out.println("student got fail");
	}
	else if(percentage<50)
	{
		System.out.println("total marks of the student is "+total_marks);
		System.out.println("percentage of student is "+ percentage+"%");
		System.out.println("student got C grade");
	}
	else if(percentage<60)
	{
		System.out.println("total marks of the student is "+total_marks);
		System.out.println("percentage of student is "+ percentage+"%");
		System.out.println("student got B+ grade");
	}
	else if(percentage<70)
	{
		System.out.println("total marks of the student is "+total_marks);
		System.out.println("percentage of student is "+ percentage+"%");
		System.out.println("student got B grade");
	}
	else if(percentage<80)
	{
		System.out.println("total marks of the student is "+total_marks);
		System.out.println("percentage of student is "+ percentage+"%");
		System.out.println("student got A grade");
	}
	else if(percentage<90)
	{
		System.out.println("total marks of the student is "+total_marks);
		System.out.println("percentage of student is "+ percentage+"%");
		System.out.println("student got A+ grade");
	}
	else if(percentage<100)
	{
		System.out.println("total marks of the student is "+total_marks);
		System.out.println("percentage of student is "+ percentage+"%");
		System.out.println("student got O ");
	}
	else
	{
		System.out.println("invalid marks");
	}
}
}




















