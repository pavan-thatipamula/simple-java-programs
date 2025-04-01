import java.util.Scanner;
class pavan
{
 public static void main(String args[])
 {
	Check p=new Check();
	p.num=10;
	p.even(10);
   
 }
}
class Check
{
	int num;
	void even()
	{
		int num=10;
		if(num%2==0)
		{
			System.out.println("even");
		}
		else 
			System.out.println("odd");		
	}
	String e()
	{
		if(num%2==0)
			return "even";
		else
			return "odd";
	}
	void even(int num)
	{
		if(num%2==0)
		{
			System.out.println("even");
		}
		else 
			System.out.println("odd");	
	}
}
