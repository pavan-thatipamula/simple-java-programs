import java.util.Scanner;
class pavan
{
 public static void main(String args[])
 {
	Check p=new check();
	p.num=10;
	p.even();
   
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
}
