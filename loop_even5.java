class Even
{
public static void main(String args[])
{
	int num=12345,count=0,temp=num;
	while(num!=0)
	{
		count++;
		num=num/10;
	}
	num=temp;
	if(count%2==0)
		{
			count=count/2;
			int div=(int)Math.pow(10,count);
			int num1=num/div;
			int num2=num%div;
			int res=num1+num2;
			System.out.println(" the digit  count is even so sum of half parts are " + res);
		}
	else
		{
			int num1=num%10;
			int num2=num/10;
			int res=num1+num2;
			System.out.println(" the digit  count is odd so sum of is " + res);
		}
	
}
}