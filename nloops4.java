import java.util.Scanner;
class Check
{
 public static void main(String args[])
 {
	Scanner s=new Scanner(System.in);
	System.out.println("enter a number :");
	int num=s.nextInt();//3245
	System.out.println(" enter the digit position");
	int digit=s.nextInt();
	int count=0,rev=0;//1
	while(num!=0)
	{
		int rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
	while(rev!=0)//5423
		{
			int rem=rev%10;//3 2
			count++;//1 2
			System.out.println(count+" count");
		if(count==digit)//f
			{
				System.out.println(rem+" is the value");
				break;
			}
			rev=rev/10;
		}
	if(digit>count)
	{
		System.out.println("num is small than the digit position");
	}
 }
}