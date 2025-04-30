import java.util.Scanner;
class Book
{
 public static void main(String args[])
 {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter 1st prime value");
	int a=sc.nextInt();
	System.out.println("enter 2st prime value");
	int b=sc.nextInt();
		int count2=1;
			int count3=1;
	for(int x=1;x<Integer.MAX_VALUE;x++)
	{
		int num=x,count=0;
	for(int y=1;y<=num;y++)
	{
		if(num%y==0)
		count++;
	}
	if(count==2)
	{
		if(count2==a)
		{
			a=x;
			break;
		}
		count2++;
	}
	}
	for(int x=1;x<Integer.MAX_VALUE;x++)
	{
		int num=x,count=0;
	for(int y=1;y<=num;y++)
	{
		if(num%y==0)
		count++;
	}
	if(count==2)
	{
		
		if(count3==b)
		{
			b=x;
			break;
		}
		count3++;
	}
	}
	int c=a*b;
	c=c-1;
	System.out.println(c);
 }
}