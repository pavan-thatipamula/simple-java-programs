// take a num as input check whether it is even or odd
//1) if even check it is perfect square or not 
//2)if odd check the last digit is divisible by 5 or not

class EVEN
{
public static void main(String args[])
{
	int num = 27;
	
	if(num%2==0)
	{
		double square = Math.sqrt(num);
		if(square==(int)square)
			{
				System.out.println(num+ " is even & perfect square");
			}
		else
			{
				System.out.println(num+ " is even &  not perfect square");
			}
	}
	else
	{
		int last=num%10;
		if(last%5==0)
			{
				System.out.println(num+" is odd & divisible by 5");
			}
		else
			{
				System.out.println(num+" is odd & not divisible by 5");
			}
	}
}
}
//------------------------------------------------------------------
class EVEN2
{
public static void main(String args[])
{
	int num =59;
	double square = Math.sqrt(num);
	int odd=num%10;
	System.out.println((num%2==0)?(square==(int)square)? num+"is even and perfect square":num+" is even":(odd%5==0)? num+ " is odd and divisible by 5":num+" is odd & not divisible");
}
}











































