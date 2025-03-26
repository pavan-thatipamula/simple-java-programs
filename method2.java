import java.util.Scanner;
class Check
{
 public static void main(String args[])
 {
	Scanner s=new Scanner(System.in);
	System.out.println("enter a number");
	Prime p1=new Prime();
	for(p1.num=1;p1.num<=100;p1.num++)
	{
	p1.prime();
	}		
 }
}


class Prime
{
	int num;
	void ()
	{	int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
			System.out.println(num+" is prime");
	}
}