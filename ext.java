class Large
{
public static void main(String args[])
{
	int num=8729,rem=0,min=9,temp=num,min2=9;
	while(num!=0)
	{
		rem=num%10;
		if(rem<min)
			{
			min=rem;
			}
		num=num/10;	
	}
	System.out.println(min);
	while(temp!=0)
	{
		rem=temp%10;
		if(rem!=min && rem<min2)
			{
				min2=rem;
			}
		temp=temp/10;
	}
	System.out.println(min2+" is second minimum");
}
}