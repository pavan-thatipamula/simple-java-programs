import java.util.Scanner;
class Check
{
public static void main(String args[])
 {
	Scanner s=new Scanner(System.in);
	System.out.println("enter a number");
	int num=s.nextInt();
	System.out.println("enter a digit");
	int digit = s.nextInt();
	int rev=0,temp=num;
	while(num!=0)
	{
		int rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
	int count=0,rem=0;
	while(rev!=0)
	{
		rem=rev%10;
		count++;
		if(count==digit)
		{
			System.out.println(rem+" is at "+digit+" position");
			break;
		}
		rev=rev/10;
	}System.out.println(rem+" is digit");
	int count2=0;
	while(temp!=0)
	{
		int x=temp%10;
		 if(rem==x)
		  {
				count2++;
		  }
		temp=temp/10;
	}
	System.out.println(rem+" has occured "+count2+" times");
 }
}
