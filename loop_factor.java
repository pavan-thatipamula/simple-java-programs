class Factorial
{
public static void main(String args[])
{
	int num1=6,num2=12;
	int start=1,end=num1/2,max1=0,max2=0;
	while(start<=end)
		{
			if(num1%start==0)
				{
				System.out.println(num1+" is factorial");
				max1=num1;
				}
		start++;
		}
	start=1;end=num2/2;
	while(start<=end)
		{
			if(num2%start==0)
				{
				System.out.println(num2+" is factorial");
				max2=num2;
				}
		start++;
		}
	if(max1==max2)
		{
			System.out.println(max1);
		}
	
}
}