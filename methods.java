import java.util.Scanner;
class Student
{
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		System.out.println("m1,m2,m3 marks");
		Demo d1=new Demo();
		d1.m1=s.nextInt();d1.m2=s.nextInt();d1.m3=s.nextInt();
		d1.name="pavan";d1.email="pavan@gmail.com";
		d1.total();
		d1.percentage();
		d1.Scholarship();
		
	}
}
class Demo
{
	int m1,m2,m3,total;
	String name,email;
	double per;
	
	void total()
	{
		total=m1+m2+m3;
		System.out.println(total+" is total marks");
	}
	void percentage()
	{
		per=total/300.0*100;
		System.out.println(per+" is percentage");
	}
	void Scholarship()
	{
		if(per>90)
		{
			System.out.println("A section"+" granted scholarship 25000/-");
		}
		else if(per>80)
		{
			System.out.println("b section"+" granted scholarship 20000/-");
		}
		else if(per>70)
		{
			System.out.println("c section"+" granted scholarship 15000/-");
		}
		else 
		{
			System.out.println("d section"+" no scholarship granted");
		}
	}
	
}