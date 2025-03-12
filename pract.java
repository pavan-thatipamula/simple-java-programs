class Check
{
public static void main(String args[])
{
	int num=123,sum=0,rem=0,rev=0,temp=num,start=1;
	while(num!=0)
	{
		rem=num%10;
		sum=sum+rem;
		rev=rev*10+rem;
		num=num/10;
	}
	System.out.println(sum);
	
	while(rev!=0)
	{
		rem=rev/10;
		System.out.print(rem);
	}
	
}
}